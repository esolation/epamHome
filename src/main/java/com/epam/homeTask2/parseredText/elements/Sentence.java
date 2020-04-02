package com.epam.homeTask2.parseredText.elements;

import com.epam.homeTask2.Parser.Parser;
import com.epam.homeTask2.Parser.ParserService;

import java.util.ArrayList;
import java.util.List;

public class Sentence {
    Parser parser = new ParserService();
    private String sentence;
    private List<Words> words;

    public Sentence(String text){
        this.sentence = text;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public List<Words> getWords() {
        return words;
    }

    public void setWords(List<Words> words) {
        this.words = words;
    }

    @Override
    public String toString() {
        return sentence;
    }
}
