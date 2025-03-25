package com.paka.javaconfig;

import com.paka.common.Account;
import com.paka.common.MemberDTO;
import com.paka.common.MemberInformation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {

    @Bean
    public Account accountGenerator() {
        return new MemberInformation("paka23","32312");
    }

    @Bean
    public MemberDTO memberGenerator() {

        MemberDTO member = new MemberDTO();
        member.setSequence(1);
        member.setName("알파카");
        member.setPhone("010-1234-5678");
        member.setEmail("paka1234@gmail.com");
        member.setMemberInformation(accountGenerator());

        return member;
    }
}
