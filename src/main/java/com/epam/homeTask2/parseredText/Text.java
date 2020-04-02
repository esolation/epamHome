package com.epam.homeTask2.parseredText;


import com.epam.homeTask2.Parser.Parser;
import com.epam.homeTask2.Parser.ParserService;
import com.epam.homeTask2.parseredText.elements.Paragraphs;

import java.util.ArrayList;
import java.util.List;

public class Text {
    public static void main(String[] args) {
        Parser parser = new ParserService();
        String text = "Hello. My name is Vlad. Im the CODER? HAHAHAA.\n\tTooday im gonna finish my second task";
      List<Paragraphs> paragraphs = new ArrayList<>();
        for(String paragraph: parser.getAllParagraphsFromText(text) ){
            paragraphs.add(new Paragraphs(paragraph));
        }


    }
}
