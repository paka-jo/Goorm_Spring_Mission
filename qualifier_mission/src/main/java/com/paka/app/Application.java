package com.paka.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.paka");

        String[] beanNames =context.getBeanDefinitionNames(); //IoC 컨테이너에 등록된 모든 Bean의 이름을 String 배열로 반환
        for(String beanName : beanNames) {
            System.out.println(beanName);
        }

        AppService appService = context.getBean("ServiceQualifier", AppService.class);

        appService.ScreenOpen();
    }
}
