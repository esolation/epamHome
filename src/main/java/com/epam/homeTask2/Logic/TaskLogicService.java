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
    Sort and return sorted collection.
    Recover full text.
     */
    @Override
    public void doTaskLogic() {
        
    }
}
