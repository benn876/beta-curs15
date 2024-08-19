package org.beta.curs15.content.generics;

import org.beta.curs15.homework.model.Person;

public class NewBox<T> {
    private T item;

    public NewBox(T item){
        this.item = item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public static <E extends PersonClass> int getLength(E person){
        return person.getName().length();
    }
}
