package org.example.model.comporator;
import org.example.model.Human;

import java.util.Comparator;



public class HumanComporatorByAge implements Comparator<Human> {

    @Override
    public int compare(Human o1, Human o2) {

        return Integer.compare(o1.getAge(), o2.getAge());
    }

}