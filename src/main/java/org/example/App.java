package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {


        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);


        Person person = context.getBean("person", Person.class);
        System.out.println(person.getName() + " " + person.getAge());
        person.animalMethod();
        context.close();
        
    }
}
