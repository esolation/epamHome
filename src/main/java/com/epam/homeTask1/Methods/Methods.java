package com.epam.homeTask1.Methods;

import com.epam.homeTask1.Equipment.Equipment;

import java.util.List;
import java.util.Set;

public interface Methods {
     List<Equipment> sort(List<Equipment> e);
     List<Equipment> findByCriteria(List<Equipment> e,double min,double max);
     double FullPrice(List<Equipment> e);
}
