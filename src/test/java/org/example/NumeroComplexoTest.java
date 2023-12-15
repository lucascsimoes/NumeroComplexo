package org.example;

import junit.framework.TestCase;

public class NumeroComplexoTest extends TestCase {

    public void testSomar() {
        NumeroComplexo calc = new NumeroComplexo(8.0, 2.0);
        String resultado = calc.somar(new NumeroComplexo(3.0, 5.0)) + "";

        assertEquals("11.0 + 7.0i", resultado);
    }

    public void testSubtrair() {
        NumeroComplexo calc = new NumeroComplexo(4.0, 7.0);
        String resultado = calc.subtrair(new NumeroComplexo(2.0, 3.0)) + "";

        assertEquals("2.0 + 4.0i", resultado);
    }

    public void testModulo() {
        NumeroComplexo calc = new NumeroComplexo(4.0, 6.0);
        String resultado = calc.modulo() + "";

        assertEquals("7.211102550927978", resultado);
    }
}