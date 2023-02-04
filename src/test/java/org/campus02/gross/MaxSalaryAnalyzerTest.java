package org.campus02.gross;

import org.campus02.gross.MaxSalaryAnalyzer;
import org.campus02.gross.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;

class MaxSalaryAnalyzerTest {

    Person josef;
    Person melanie;
    Person julia;

    ArrayList<Person> persons = new ArrayList<>();

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

        persons.add(josef);
        persons.add(melanie);
        persons.add(julia);
    }

    /**
     * check personsWithHighestSalary
     */


    @Test
    void analyze() {
        MaxSalaryAnalyzer maxSalaryAnalyzer = new MaxSalaryAnalyzer();
        maxSalaryAnalyzer.setPersons(persons);
        maxSalaryAnalyzer.analyze();

        HashSet<Person> personsWithHighestSalary = maxSalaryAnalyzer.getPersonsWithHighestSalary();
        Person personWithHighestSalary = new ArrayList<>(personsWithHighestSalary).get(0);

        Assertions.assertEquals(1, personsWithHighestSalary.size());
        Assertions.assertEquals(josef, personWithHighestSalary);
    }
}