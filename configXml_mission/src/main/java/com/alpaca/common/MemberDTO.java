package com.alpaca.common;

public class MemberDTO {

    private int sequence;
    private String id;
    private String email;
    private String name;
    private String phone;

    public MemberDTO() {
    }

    public MemberDTO(int sequence, String id, String email,String name, String phone) {
        this.sequence = sequence;
        this.id = id;
        this.email = email;
        this.name = name;
        this.phone = phone;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name= name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "sequence=" + sequence +
                ", id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}


