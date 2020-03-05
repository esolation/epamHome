package com.epam.homeTask2;

import com.epam.homeTask2.Parser.ParserService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParseredText {
    private ParserService parserService = new ParserService();
    private List<String> sentences = new ArrayList<>();
    private Map<String, List<String>> words = new HashMap<>();

    public ParseredText(){}
    public ParseredText(String text){
        parseText(text);
    }

    public List<String> getSentences() {
        return sentences;
    }

    public void setSentences(List<String> sentences) {
        this.sentences = sentences;
    }

    public Map<String, List<String>> getWords() {
        return words;
    }

    public void setWords(Map<String, List<String>> words) {
        this.words = words;
    }

    public void parseText(String text){
       this.sentences = parserService.getAllSentencesFromText(text);
       for (String sentence : sentences) {
           words.put(sentence, parserService.getAllWordsFromSentences(sentence));
       }
   }
}
