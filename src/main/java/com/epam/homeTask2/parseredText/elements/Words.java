package com.epam.homeTask2.parseredText.elements;

import com.epam.homeTask2.Parser.Parser;
import com.epam.homeTask2.Parser.ParserService;

import java.util.ArrayList;
import java.util.List;

public class Words {
    private Parser parser = new ParserService();
    private List<String> word = new ArrayList<>();
    public Words(String text){
        word.addAll(parser.getAllWordsFromSentences(text));
    }

    public List<String> getWord() {
        return word;
    }

    public void setWord(List<String> word) {
        this.word = word;
    }
}
