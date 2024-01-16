package com.test.test;

import com.test.test.model.Addition;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestCaseAddition {

    @Test
    public void  testCaseAdditionNominal(){

        //GIVEN
        Addition addition = new Addition(1, 5);

        // Vérification qu'on bien valorisé l'attribut number1
        assertEquals(1, addition.getNumber1());

        // Vérification qu'on bien valorisé l'attribut number2

        assertEquals(5, addition.getNumber2());

        // vérification sur la méthode somme

        assertEquals(6, addition.sum());

    }
}
