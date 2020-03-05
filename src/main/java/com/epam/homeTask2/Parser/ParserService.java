package com.epam.homeTask2.Parser;

import com.epam.homeTask2.Parser.Parser;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParserService implements Parser {

    @Override
    public List<String> getAllSentencesFromText(String text) {
        return Stream.of(text.split("[.!?]\\s*")).collect(Collectors.toList());
    }

    @Override
    public List<String> getAllWordsFromSentences(String sentence) {
        return Arrays.asList(sentence.split("[ \t\n,.]\\s*"));
    }
}
