package org.campus02.gross;

import org.campus02.gross.CountryAnalyzer;
import org.campus02.gross.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class CountryAnalyzerTest {


    CountryAnalyzer countryAnalyzer = new CountryAnalyzer();
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
                "DE",
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
     * check result
     */


    @Test
    void analyze() {
        countryAnalyzer.setPersons(arrayPerson);
        countryAnalyzer.analyze();
        Assertions.assertEquals(1, countryAnalyzer.getResult().get("DE"));
        Assertions.assertEquals(2, countryAnalyzer.getResult().get("AUT"));
    }
}