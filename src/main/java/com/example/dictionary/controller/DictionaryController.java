package com.example.dictionary.controller;

import com.example.dictionary.model.Dictionary;
import com.example.dictionary.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/dictionarys")

public class DictionaryController {
    @Autowired
    private DictionaryService dictionaryService;
    @GetMapping("")
   public String dictionary() {
        return "enter";
    }

    @GetMapping("/out")
    public ModelAndView out(@RequestParam("word") String word) {
       Dictionary dictionary =  dictionaryService.findDictionary(word);
        ModelAndView mav = new ModelAndView("out");
        mav.addObject("dictionary", dictionary);

        return mav;
    }
}
