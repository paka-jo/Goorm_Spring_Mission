package com.paka.common;

import org.springframework.stereotype.Component;

@Component
public class Lock  implements Screen{
    @Override
    public void open() {
        System.out.println("휴대폰이 잠기셨습니다");

    }
}
