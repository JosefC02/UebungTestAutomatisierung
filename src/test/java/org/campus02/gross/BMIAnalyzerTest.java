package org.campus02.gross;

import org.campus02.gross.BMIAnalyzer;
import org.campus02.gross.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class BMIAnalyzerTest {

    ArrayList<Person> arrayPerson = new ArrayList<>();
    Person josef;
    Person melanie;
    Person julia;

    BMIAnalyzer bmiAnalyzer = new BMIAnalyzer();

    @BeforeEach
    void setUp() {
        josef = new Person("Josef",
                "Gross",
                'M',
                23,
                "AUT",
                2000,
                "grau",
                80,
                160
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

    @Test
    void calcBmi() {
        Assertions.assertEquals(31.25, bmiAnalyzer.calcBmi(josef));
    }

    /**
     * check result
     */
    @Test
    void analyze() {
        bmiAnalyzer.setPersons(arrayPerson);
        bmiAnalyzer.analyze();
        Assertions.assertEquals(bmiAnalyzer.calcBmi(bmiAnalyzer.getResult().get(0).getKey()),bmiAnalyzer.getResult().get(0).getValue());
        Assertions.assertEquals(bmiAnalyzer.calcBmi(bmiAnalyzer.getResult().get(1).getKey()),bmiAnalyzer.getResult().get(1).getValue());
        Assertions.assertEquals(bmiAnalyzer.calcBmi(bmiAnalyzer.getResult().get(2).getKey()),bmiAnalyzer.getResult().get(2).getValue());


    }
}