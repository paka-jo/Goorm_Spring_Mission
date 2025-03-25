package com.paka.common;

public class MemberDTO {

    private int sequence;
    private String name;
    private String phone;
    private String email;
    private Account memberInformation;

    public MemberDTO() {}

    public MemberDTO(int sequence, String name, String phone, String email, Account memberInformation) {
        this.sequence = sequence;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.memberInformation = memberInformation;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Account getMemberInformation() {
        return memberInformation;
    }

    public void setMemberInformation(Account memberInformation) {
        this.memberInformation = memberInformation;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "sequence=" + sequence +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", memberInformation=" + memberInformation +
                '}';
    }
}



