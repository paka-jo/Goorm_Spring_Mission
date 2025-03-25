package com.paka.field;

import com.paka.common.DictionaryDAO;
import com.paka.common.DictionaryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("dictionaryServiceField")
public class DictionaryService {

    @Autowired
    private DictionaryDAO dictionaryDAO;

    public List<DictionaryDTO> selectAllDictionarys () {
        return dictionaryDAO.selectDictionaryList();
    }

}
