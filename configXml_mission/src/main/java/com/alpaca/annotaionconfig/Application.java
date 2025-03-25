package com.alpaca.annotaionconfig;

import com.alpaca.common.MemberDAO;
import com.alpaca.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        String[] anno = context.getBeanDefinitionNames();
        for(String beanName : anno) {
            System.out.println("beanName:" +anno);
        }
        MemberDAO memberDAO = context.getBean("memberDAO", MemberDAO.class);

        System.out.println(memberDAO.selectMember(1));
        System.out.println(memberDAO.insertMember(new MemberDTO(3,"haha1","haha@gmail.com","하하","010-3456-7890")));
        System.out.println(memberDAO.selectMember(2));

    }
}
