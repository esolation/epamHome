package com.epam.homeTask1;

import com.epam.homeTask1.Biker.Biker;
import com.epam.homeTask1.Equipment.Elements.Chest;
import com.epam.homeTask1.Equipment.Elements.Feet;
import com.epam.homeTask1.Equipment.Elements.Helmet;
import com.epam.homeTask1.Methods.Methods;
import com.epam.homeTask1.Methods.MethodsImpl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
     int [] num = {1,2,3,4,5};
     List<Integer> num1 = IntStream.of(num).boxed().collect(Collectors.toList());
        System.out.println(Collections.max(num1));


    }
}
