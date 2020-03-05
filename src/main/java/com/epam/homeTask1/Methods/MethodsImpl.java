package com.epam.homeTask1.Methods;

import com.epam.homeTask1.Equipment.Equipment;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MethodsImpl implements Methods {
    @Override
     public List<Equipment> sort(List<Equipment> e) {
        e.sort(Comparator.comparingDouble(Equipment::getWeight).reversed());
        return e;
    }

    @Override
    public List<Equipment> findByCriteria(List<Equipment> e, double min, double max) {
        return e.stream()
                .filter(x -> x.getCost() > min && x.getCost() < max)
                .collect(Collectors.toList());
    }

    @Override
    public double FullPrice(List<Equipment> e) {
        return e.stream()
                .mapToDouble(Equipment::getCost)
                .reduce(0.0,Double::sum);
    }
}