package ru.geekbrains.example.Equals2;

import org.junit.jupiter.api.Assertions;

public class EqualsExample {
    public static void main(String[] args) {
        Dog spike = new Dog(5544332);
        Dog lord = new Dog(5544332);

        Assertions.assertTrue(spike.equals(spike));

        Assertions.assertEquals(spike.hashCode(), lord.hashCode());
    }

}
