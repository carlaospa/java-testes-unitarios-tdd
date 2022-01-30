package br.com.carlaospa.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {    
    
    @Test
    void testSomar() {

        Calculadora calc = new Calculadora();
        int soma = calc.somar(3, 7);                        
        Assertions.assertEquals(10, soma);
    }
}
