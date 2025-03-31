package com.paka.common;

import org.springframework.stereotype.Component;

@Component
public class Wrong implements Screen{
    @Override
    public void open() {
        System.out.println("비밀번호가 틀리셨습니다");

    }
}
