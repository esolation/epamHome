package com.epam.homeTask2.Parser;

import java.util.List;

public interface Parser {
    List<String> getAllParagraphsFromText(String text);
    List<String> getAllSentencesFromText(String text);
    List<String> getAllWordsFromSentences(String sentence);
}
