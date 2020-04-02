package com.epam.homeTask2.parseredText.elements;

import com.epam.homeTask2.Parser.ParserService;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Paragraphs {
    private String paragraph;
    private ParserService parserService = new ParserService();
    private List<Sentence> sentences = new ArrayList<>();

    public  Sentence sentence;

    public Paragraphs(String text) {

    }

    private void setSentence(){
        sentences = parserService.getAllSentencesFromText(paragraph);
    }

    public List<String> getParagraph() {
        return paragraph;
    }

    public void setParagraph(List<String> paragraph) {
        this.paragraph = paragraph;
    }

    public Sentence getSentence() {
        return sentence;
    }


}
