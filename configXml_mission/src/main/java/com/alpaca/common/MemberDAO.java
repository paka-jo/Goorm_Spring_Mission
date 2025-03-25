package com.alpaca.common;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class MemberDAO {

    private final Map<Integer,MemberDTO> memberMap;

    public MemberDAO() {
        memberMap = new HashMap<>();

        memberMap.put(1, new MemberDTO(1, "paka12", "pa123@gmail.com", "알파카", "010-1234-5678"));
        memberMap.put(2, new MemberDTO(2, "alpa12", "al123@gmail.com", "알파", "010-2345-6789"));
    }
    public MemberDTO selectMember(int sequence) {return memberMap.get(sequence);}

    public boolean insertMember(MemberDTO newMember){
        int before = memberMap.size();

        memberMap.put(newMember.getSequence(), newMember);

       int after = memberMap.size();

        return after > before ? true : false;


    }


    }

