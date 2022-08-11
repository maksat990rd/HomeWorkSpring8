package org.example;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal {

    @Override
    public String animalPlus() {
        return "Sobaka lovit koshku!";
    }

    @Override
    public String animalMinus() {
        return "Sobaka layet ochen chasto!";
    }
}
