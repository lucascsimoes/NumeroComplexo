package org.example;

import junit.framework.TestCase;

public class CalcularTest extends TestCase {

    public void testSomarValores() {
        Calcular calc = new Calcular();
        String resultado = calc.somarValores("4 + 2i", "2 + 3i");

        assertEquals("6.0 + 5.0i", resultado);
    }

    public void testSubtrairValores() {
        Calcular calc = new Calcular();
        String resultado = calc.subtrairValores("4 + 2i", "2 + 3i");

        assertEquals("2.0 + -1.0i", resultado);
    }

    public void testModularValores() {
        Calcular calc = new Calcular();
        String resultado = calc.modularValores("4 + 2i", "2 + 3i");

        assertEquals("4.47213595499958", resultado);
    }
}