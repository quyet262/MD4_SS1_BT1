package com.example.dictionary.service;

import com.example.dictionary.model.Dictionary;
import com.example.dictionary.repository.DictionaryRepository;
import org.springframework.stereotype.Service;

@Service
public class DictionaryService {

    DictionaryRepository dictionaryRepository = new DictionaryRepository();

    public Dictionary findDictionary(String word) {
        return dictionaryRepository.findByWord(word);
    }

}
