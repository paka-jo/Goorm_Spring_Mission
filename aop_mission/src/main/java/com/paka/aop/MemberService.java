package com.paka.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class MemberService {

    private final MemberDAO memberDAO;

    @Autowired
    public MemberService(MemberDAO memberDAO) {
        this.memberDAO = memberDAO;
    }

    public Map<Long, MemberDTO> selectMembers() {

        return  memberDAO.selectMembers();
    }

    public MemberDTO selectMember(Long id) {

        return  memberDAO.selectMember(id);
    }
}
