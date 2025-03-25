package com.alpaca.xml;

import com.alpaca.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext context = new GenericXmlApplicationContext("xmlconfig/context.xml");

        MemberDTO member =context.getBean("member", MemberDTO.class);

        System.out.println(member);


    }
}
