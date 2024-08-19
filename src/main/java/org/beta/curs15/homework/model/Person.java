package org.beta.curs15.homework.model;

import lombok.Builder;
import org.beta.curs15.homework.exceptions.ValidationException;

import java.util.UUID;

@Builder
public record Person(
        String id,
        String name,
        Integer age
) {
    public Person {
        if (id == null) {
            id = UUID.randomUUID().toString();
        }
        validateName(name);
        validateAge(age);
    }

    void validateName(String name) {
        if (name == null) {
            throw new ValidationException();
        }
    }

    void validateAge(Integer age) {
        if (age == null) {
            throw new ValidationException();
        }
    }
}
