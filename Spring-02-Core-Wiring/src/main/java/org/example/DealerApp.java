package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DealerApp {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigCar.class);
        System.out.println("Person's Name = " + container.getBean(Person.class).getName());
        System.out.println("Car's make = " + container.getBean(Car.class).getMake());
        System.out.println("Person's car = " + container.getBean(Person.class).getCar());
    }
}
