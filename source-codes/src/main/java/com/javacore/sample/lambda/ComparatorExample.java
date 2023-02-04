package com.javacore.sample.lambda;

import com.javacore.sample.model.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

    public static void main(String[] args) {

        List<Person> listOfPerson = new ArrayList();
        listOfPerson.add(new Person("abc", 27));
        listOfPerson.add(new Person("mno", 26));
        listOfPerson.add(new Person("pqr", 28));
        listOfPerson.add(new Person("xyz", 27));

        // Without lambda expression.
        // Sort list by age
        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.age() - o2.age();
            }
        };

        Collections.sort(listOfPerson, comparator);

        System.out.println(" sort persons by age in ascending order");
        for (Person person : listOfPerson) {
            System.out.println(" Person name : " + person.name());
        }

        // With lambda expression.
        // Sort list by age

        //sample A
        Collections.sort(listOfPerson, (o1, o2) -> o1.age() - o2.age());

        //sample B
        Collections.sort(listOfPerson, Comparator.comparing(Person::age));

        // Use forEach method added in java 8
        System.out.println(" sort persons by age in ascending order");
        listOfPerson.forEach(
                (person) -> System.out.println(" Person name : " + person.name()));

    }

}
