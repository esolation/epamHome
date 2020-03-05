package com.epam.homeTask2;

import com.epam.homeTask2.Logic.TaskLogic;
import com.epam.homeTask2.Logic.TaskLogicService;

public class Main {
    public static void main(String[] args) {
        String text = "Привет, меня зовут Влад. Я вижу в  городе Гродно. Мне 23 года 23.";
        TaskLogic taskLogic = new TaskLogicService(text);
        taskLogic.doTaskLogic();




    }
}
