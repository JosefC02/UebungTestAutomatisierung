package org.campus02.gross;

import org.campus02.gross.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonTest {

    Person person;

    @BeforeEach
    void setUp() {
        person = new Person("Josef",
                "Gross",
                'M',
                23,
                "AUT",
                2000,
                "blau",
                87,
                187
        );

    }

    @Test
    void testConstructor() {
        Assertions.assertEquals("Josef",person.getFirstname());
        Assertions.assertEquals("Gross",person.getLastname());
        Assertions.assertEquals('M',person.getGender());
        Assertions.assertEquals(23, person.getAge());
        Assertions.assertEquals("AUT", person.getCountry());
        Assertions.assertEquals(2000, person.getSalary());
        Assertions.assertEquals("blau",person.getEyeColor());
        Assertions.assertEquals(87, person.getWeight());
        Assertions.assertEquals(187, person.getSize());

    }
    @Test
    void setEyeColor() {
        person.setEyeColor("braun");
        Assertions.assertEquals("braun", person.getEyeColor());
        person.setEyeColor("blau");
        Assertions.assertEquals("blau", person.getEyeColor());
        person.setEyeColor("grün");
        Assertions.assertEquals("grün", person.getEyeColor());
        person.setEyeColor("grau");
        Assertions.assertEquals("undefined", person.getEyeColor());

    }
}