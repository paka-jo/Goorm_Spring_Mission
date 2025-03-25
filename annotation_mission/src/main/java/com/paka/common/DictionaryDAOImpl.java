package com.paka.common;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository("dictionaryDAO")
public class DictionaryDAOImpl implements DictionaryDAO{

    private Map<Integer, DictionaryDTO> dictionaryList;

    public DictionaryDAOImpl() {
        dictionaryList = new HashMap<>();
        dictionaryList.put(1, new DictionaryDTO(1,"Korean","인생","어떤 사람과 그의 삶 모두를 낮잡아 이르는 말."));
        dictionaryList.put(2, new DictionaryDTO(2,"Korean","고난","괴로움과 어려움을 아울러 이르는 말."));

    }

    @Override
    public List<DictionaryDTO> selectDictionaryList(){ return new ArrayList<>(dictionaryList.values());
    }
 }
