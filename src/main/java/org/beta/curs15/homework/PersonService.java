package org.beta.curs15.homework;

import org.beta.curs15.homework.model.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonService {
    private final List<Person> persons = new ArrayList<>();

    public PersonService() {
    }

    public PersonService(List<Person> persons) {
        if (persons != null) {
            this.persons.addAll(persons);
        }
    }

    public Person addPerson(Person person) {
        this.persons.add(person);
        return person;
    }

    public List<Person> getPersons() {
        return persons;
    }
}
