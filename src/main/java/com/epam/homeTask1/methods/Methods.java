package com.epam.homeTask1.methods;

import com.epam.homeTask1.equipment.Equipment;

import java.util.List;

public interface Methods {
     List<Equipment> sort(List<Equipment> e);
     List<Equipment> findByCriteria(List<Equipment> e,double min,double max);
     double FullPrice(List<Equipment> e);
}
