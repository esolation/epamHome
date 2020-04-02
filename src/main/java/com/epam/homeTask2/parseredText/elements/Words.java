package com.epam.homeTask2.parseredText.elements;

import com.epam.homeTask2.Parser.Parser;
import com.epam.homeTask2.Parser.ParserService;

import java.util.ArrayList;
import java.util.List;

public class Words {
    private Parser parser = new ParserService();
   private String word;
    public Words(String text){
      this.word = text;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
