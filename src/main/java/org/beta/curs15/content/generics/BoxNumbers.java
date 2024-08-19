package org.beta.curs15.content.generics;

import java.util.List;

public class BoxNumbers<T extends Number> {
    private T number;

    public BoxNumbers(T number) {
        this.number = number;
    }

    public void setNumber(T number) {
        this.number = number;
    }

    public T getNumber() {
        return number;
    }
}
