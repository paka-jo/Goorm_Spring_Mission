package com.paka.common;

public class MemberInformation implements Account {

    private String id;
    private String code;

    public MemberInformation() {}

    public MemberInformation(String id, String code) {
        this.id = id;
        this.code = code;
    }

    @Override
    public String getNickName() {

        return "당신의 id와 코드는 "+this.id+","+ this.code +"입니다";
    }
}
