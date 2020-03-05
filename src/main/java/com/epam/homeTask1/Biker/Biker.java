package com.epam.homeTask1.Biker;

import com.epam.homeTask1.Equipment.Equipment;

import java.util.ArrayList;
import java.util.List;

public class Biker {
    private List<Equipment> equip = new ArrayList<>();

    public Biker(){}

    public void addEquipment(Equipment e){
        equip.add(e);
    }

    public List<Equipment> getEquip()
    {
        return equip;
    }
}
