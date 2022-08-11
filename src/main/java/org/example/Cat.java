package org.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal {

    @Override
    public String animalPlus() {
        return  "Koshka lovit mishey!";
    }

    @Override
    public String animalMinus() {
        return "Koshka spit dnem!";
    }
}
