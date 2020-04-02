package com.epam.homeTask2.parseredText;


import com.epam.homeTask2.parseredText.elements.Paragraphs;

import java.util.ArrayList;
import java.util.List;

public class Text {
    public static void main(String[] args) {
        String text = "Hello my name is Vlad. Im code.\n\tI love it so much!";
        Paragraphs paragraphs = new Paragraphs(text);
        System.out.println(paragraphs.getParagraph().size());






    }


}
