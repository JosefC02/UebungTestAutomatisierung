package org.campus02.gross;

import org.campus02.gross.Person;
import org.campus02.gross.PersonManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonManagerTest {

    Person josef;
    Person melanie;
    Person julia;

    PersonManager personManager = new PersonManager();

    @BeforeEach
    void setUp() {
        josef = new Person("Josef",
                "Gross",
                'M',
                23,
                "AUT",
                2000,
                "grau",
                87,
                187
        );

        melanie = new Person("Melanie",
                "G",
                'F',
                21,
                "AUT",
                0,
                "blau",
                63,
                168
        );

        julia = new Person("Julia",
                "T",
                'F',
                23,
                "AUT",
                400,
                "blau",
                57,
                156
        );
        personManager.addPerson(josef);
        personManager.addPerson(melanie);
        personManager.addPerson(julia);
    }

    @Test
    void addPerson() {
       Assertions.assertEquals(3, personManager.getSize());
    }
}