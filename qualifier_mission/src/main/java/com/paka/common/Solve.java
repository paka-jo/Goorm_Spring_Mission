package com.paka.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Solve implements Screen{
    @Override
    public void open() {
        System.out.println("잠금이 풀렸습니다");

    }
}
