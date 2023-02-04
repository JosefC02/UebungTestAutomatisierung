package org.campus02.gross;

import org.campus02.gross.GenderAnalyzer;
import org.campus02.gross.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class GenderAnalyzerTest {

    GenderAnalyzer genderAnalyzer = new GenderAnalyzer();
    ArrayList<Person> arrayPerson = new ArrayList<>();
    Person josef;
    Person melanie;
    Person julia;

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
        arrayPerson.add(josef);
        arrayPerson.add(melanie);
        arrayPerson.add(julia);

    }

    /**
     * Test the result of avgM and avgW
     */
    @Test
    void analyze() {
        genderAnalyzer.setPersons(arrayPerson);
        genderAnalyzer.analyze();
        Assertions.assertEquals(187, genderAnalyzer.getAvgM());
        Assertions.assertEquals(162, genderAnalyzer.getAvgW());
    }
}