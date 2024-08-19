package org.beta.curs15.content.generics;

import org.beta.curs15.content.recursion.Pair;
import org.beta.curs15.homework.model.Person;

import java.util.ArrayList;
import java.util.List;

public class GenericsMain {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Test");

        OldBox oldBox = new OldBox("test");
        OldBox oldBox2 = new OldBox(4);
        OldBox oldBox3 = new OldBox(Person.builder()
                .name("mihai")
                .age(44)
                .build());

        if(oldBox3.getItem() instanceof Person){
            System.out.println(((Person) oldBox3.getItem()).name());
        }

        if(oldBox2.getItem() instanceof Integer){
            System.out.println(((Integer) oldBox2.getItem()) > 30);
        }

        NewBox<String> newBoxString = new NewBox<>("test");
        System.out.println(newBoxString.getItem().length());

        NewBox<Person> newBoxPerson = new NewBox<>(Person.builder()
                .name("mihai")
                .age(44)
                .build());

        System.out.println(newBoxPerson.getItem().name());

        BoxNumbers<Integer> boxNumberInteger = new BoxNumbers<>(4);
        System.out.println(boxNumberInteger.getNumber());

        Employee employee = new Employee("Mihai");
        System.out.println(NewBox.getLength(employee));

    }
}
