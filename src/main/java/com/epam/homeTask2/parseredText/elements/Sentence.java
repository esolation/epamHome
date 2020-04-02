package com.epam.homeTask2.parseredText.elements;

import com.epam.homeTask2.Parser.Parser;
import com.epam.homeTask2.Parser.ParserService;

import java.util.ArrayList;
import java.util.List;

public class Sentence {
    Parser parser = new ParserService();
   private String sentence;
    private List<Words> words;

    Sentence(String text){
        sentences.addAll(parser.getAllSentencesFromText(text));
    }

    private void setWords(){
        sentences.forEach(x-> words = new Words(x));
    }

    public List<String> getSentences() {
        return sentences;
    }

    public void setSentences(List<String> sentences) {
        this.sentences = sentences;
    }
}
