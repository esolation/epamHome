package com.epam.homeTask2.Logic;
import com.epam.homeTask2.ParseredText;
import java.util.*;
import java.util.stream.Collectors;

public class TaskLogicService implements TaskLogic {
    private ParseredText parseredText = new ParseredText();
    public TaskLogicService(String text) {
        parseredText.parseText(text);
    }

    /*
    Take all sentences.
    Sort and display.
    Recover full text.
     */
    @Override
    public List<String> doTaskLogic() {
        return parseredText.getSentences().stream()
                .sorted(Comparator.comparingInt(String::length).reversed())
                .collect(Collectors.toList());

    }
}
