package com.Health.model;

import java.util.Comparator;
import java.util.stream.Collector;

public class Personconparator implements Comparator<Persons> {
    @Override
    public int compare(Persons p1, Persons p2) {
        return p1.getCheck().compareTo(p2.getCheck());

    }

}
