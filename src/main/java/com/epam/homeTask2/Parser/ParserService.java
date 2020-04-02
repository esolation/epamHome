package com.epam.homeTask2.Parser;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParserService implements Parser {
    @Override
    public List<String> getAllParagraphsFromText(String text) {
        return List.of(text.split("[\n\t]\\s*"));
    }

    @Override
    public List<String> getAllSentencesFromText(String text) {

        return List.of(text.split("[.!?]\\s"));
    }
    @Override
    public List<String> getAllWordsFromSentences(String sentence) {
        return Arrays.asList(sentence.split("[ ,]\\s*"));
    }
}
