package com.epam.homeTask2.Logic;

import com.epam.homeTask2.ParseredText;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskLogicService implements TaskLogic {
    private ParseredText parseredText = new ParseredText();
    Map<String,Integer> matchers = new HashMap<>();
    private int count=0;
    public TaskLogicService(String text){
        parseredText.parseText(text);
    }

    @Override
    public void doTaskLogic() {
        Pattern pattern;
        Matcher matcher;
        Map<String, List<String>> e = parseredText.getWords();
            for(Map.Entry<String, List<String>> entry :e.entrySet() ){
                StringUtils
                entry.getValue().forEach(x->
                {
                    if(entry.getKey().contains(x))
                    count++; });
                matchers.put(entry.getKey(),count/2);
                count=0;
            }
            matchers.forEach((x,y)-> {
                System.out.println(String.format("Предложение: %s. Количество повторяющихся слов: %d", x,y));
            });
    }
}
