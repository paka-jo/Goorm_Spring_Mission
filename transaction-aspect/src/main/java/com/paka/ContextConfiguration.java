package com.paka;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.logging.Logger;

@Configuration // 수동으로 빈 등록, 의존성 관리,프로파일 지원
@EnableAspectJAutoProxy(proxyTargetClass = true) // aop 활성화
public class ContextConfiguration {}


