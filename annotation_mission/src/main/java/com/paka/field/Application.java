package com.paka.field;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Application {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.paka");

        DictionaryService dictionaryService = context.getBean("dictionaryServiceField", DictionaryService.class);

        dictionaryService.selectAllDictionarys().forEach(System.out::println);
    }
}
