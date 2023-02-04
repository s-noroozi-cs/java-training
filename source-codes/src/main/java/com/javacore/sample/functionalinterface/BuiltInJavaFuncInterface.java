package com.javacore.sample.functionalinterface;

import com.javacore.sample.model.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class BuiltInJavaFuncInterface {

    public static void main(String[] args) {

        double[] doubleNumbers = {3.4d, 9d, 6.8d, 10.3d, 2.3d};
        DoubleConsumer doubleConsumer = d -> System.out.print(d + " ");
        Arrays.stream(doubleNumbers).forEach(doubleConsumer);

        System.out.println("\n----------------------");

        int[] intNumbers = {3, 5, 6, 7, 5};
        IntConsumer intConsumer = i -> System.out.print(i + " ");
        Arrays.stream(intNumbers).forEach(intConsumer);

        System.out.println("\n----------------------");

        long[] longNumbers = {13L, 3L, 6L, 1L, 8L};
        LongConsumer longConsumers = l -> System.out.print(l + " ");
        Arrays.stream(longNumbers).forEach(longConsumers);

        System.out.println("\n----------------------");

        Predicate<Person> predicate = p -> p.age() > 28;
        boolean result = predicate.test(new Person("ramesh", 29));
        System.out.print("age > 28: " + result);

        System.out.println("\n----------------------");

        BiFunction<Person, Person, Integer> biFunction = (p1, p2) -> p1.age() + p2.age();

        int totalAge = biFunction.apply(
                new Person("Ramesh", 10),
                new Person("ram", 10)
        );
        System.out.print("total age: " + totalAge);

        System.out.println("\n----------------------");

        BiConsumer<Person, Person> biConsumer = (p1, p2) -> {
            System.out.println(" print first person");
            System.out.println(p1.name());
            System.out.println(" print second person");
            System.out.println(p2.name());
        };

        biConsumer.accept(new Person("Ramesh", 10), new Person("ram", 10));

        System.out.println("----------------------");

        List<Person> listOfPerson = new ArrayList<Person>();
        listOfPerson.add(new Person("abc", 27));
        listOfPerson.add(new Person("mno", 26));
        listOfPerson.add(new Person("pqr", 28));
        listOfPerson.add(new Person("xyz", 27));

        //First example
        listOfPerson.forEach((person) -> {
            System.out.printf("Person name: %s ,age: %d%n", person.name(),person.age());
        });

        System.out.println("----------------------");


        // Second example
        Consumer<Person> consumer = (person) -> {
            System.out.printf("Person name: %s ,age: %d%n", person.name(),person.age());
        };
        listOfPerson.forEach(consumer);

        System.out.println("----------------------");

        Supplier<Person> supplier = () -> new Person("Ramesh", 30 );
        Person p = supplier.get();
        System.out.println("Person Detail:" + p.name() + ", " + p.age());

        System.out.println("----------------------");
    }
}
