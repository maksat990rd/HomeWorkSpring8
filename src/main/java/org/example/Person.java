package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component
public class Person {
    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private int age;
    private Animal animal;
    private Animal animal2;

    public Person() {}

    @Autowired
    public Person(@Qualifier("dog") Animal animal,@Qualifier("cat") Animal animal2) {
        this.animal = animal;
        this.animal2 = animal2;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
    public void animalMethod() {
        System.out.println(animal.animalMinus());
        System.out.println(animal.animalPlus());
        System.out.println(animal2.animalMinus());
        System.out.println(animal2.animalPlus());
    }
    @PostConstruct
    void initMethod() {
        System.out.println("Init method...run");
    }
    @PreDestroy
    void destroyMethod() {
        System.out.println("Destroy method...finish");
    }

}
