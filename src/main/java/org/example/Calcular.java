package org.example;

import java.util.ArrayList;
import java.util.List;

public class Calcular {

    public static String[] removerCaracteres(String numero) {
        String retirarEspaco = numero.replaceAll(" ", "");
        String retirarI = retirarEspaco.replaceAll("i", "");
        return retirarI.split("\\+");
    }
    public static String somarValores(String a, String b) {
        int numberRealA = 0, numberImaginarioA = 0, numberRealB = 0, numberImaginarioB = 0;
        String valorRealA = removerCaracteres(a)[0];
        String valorImaginarioA = removerCaracteres(a)[1];
        String valorRealB = removerCaracteres(b)[0];
        String valorImaginarioB = removerCaracteres(b)[1];


        try {
            numberRealA = Integer.parseInt(valorRealA);
        } catch (Exception e) {
            System.out.println(valorRealA + " não é um número válido.");
        }

        try {
            numberImaginarioA = Integer.parseInt(valorImaginarioA);
        } catch (Exception e) {
            System.out.println(valorImaginarioA + " não é um número válido.");
        }

        try {
            numberRealB = Integer.parseInt(valorRealB);
        } catch (Exception e) {
            System.out.println(valorRealB + " não é um número válido.");
        }

        try {
            numberImaginarioB = Integer.parseInt(valorImaginarioB);
        } catch (Exception e) {
            System.out.println(numberImaginarioB + " não é um número válido.");
        }

        if (isNumeric(valorRealA) && isNumeric(valorImaginarioA) && isNumeric(valorRealB) && isNumeric(valorImaginarioB)) {
            NumeroComplexo num1 = new NumeroComplexo(numberRealA, numberImaginarioA);
            NumeroComplexo num2 = new NumeroComplexo(numberRealB, numberImaginarioB);

            return num1.somar(num2) + "";
        } else {
            return "ERRO";
        }
    }

    public static String subtrairValores(String a, String b) {
        int numberRealA = 0, numberImaginarioA = 0, numberRealB = 0, numberImaginarioB = 0;
        String valorRealA = removerCaracteres(a)[0];
        String valorImaginarioA = removerCaracteres(a)[1];
        String valorRealB = removerCaracteres(b)[0];
        String valorImaginarioB = removerCaracteres(b)[1];


        try {
            numberRealA = Integer.parseInt(valorRealA);
        } catch (Exception e) {
            System.out.println(valorRealA + " não é um número válido.");
        }

        try {
            numberImaginarioA = Integer.parseInt(valorImaginarioA);
        } catch (Exception e) {
            System.out.println(valorImaginarioA + " não é um número válido.");
        }

        try {
            numberRealB = Integer.parseInt(valorRealB);
        } catch (Exception e) {
            System.out.println(valorRealB + " não é um número válido.");
        }

        try {
            numberImaginarioB = Integer.parseInt(valorImaginarioB);
        } catch (Exception e) {
            System.out.println(numberImaginarioB + " não é um número válido.");
        }

        if (isNumeric(valorRealA) && isNumeric(valorImaginarioA) && isNumeric(valorRealB) && isNumeric(valorImaginarioB)) {
            NumeroComplexo num1 = new NumeroComplexo(numberRealA, numberImaginarioA);
            NumeroComplexo num2 = new NumeroComplexo(numberRealB, numberImaginarioB);

            return num1.subtrair(num2) + "";
        } else {
            return "ERRO";
        }
    }

    public static String modularValores(String a, String b) {
        int numberRealA = 0, numberImaginarioA = 0, numberRealB = 0, numberImaginarioB = 0;
        String valorRealA = removerCaracteres(a)[0];
        String valorImaginarioA = removerCaracteres(a)[1];
        String valorRealB = removerCaracteres(b)[0];
        String valorImaginarioB = removerCaracteres(b)[1];


        try {
            numberRealA = Integer.parseInt(valorRealA);
        } catch (Exception e) {
            System.out.println(valorRealA + " não é um número válido.");
        }

        try {
            numberImaginarioA = Integer.parseInt(valorImaginarioA);
        } catch (Exception e) {
            System.out.println(valorImaginarioA + " não é um número válido.");
        }

        try {
            numberRealB = Integer.parseInt(valorRealB);
        } catch (Exception e) {
            System.out.println(valorRealB + " não é um número válido.");
        }

        try {
            numberImaginarioB = Integer.parseInt(valorImaginarioB);
        } catch (Exception e) {
            System.out.println(numberImaginarioB + " não é um número válido.");
        }

        if (isNumeric(valorRealA) && isNumeric(valorImaginarioA) && isNumeric(valorRealB) && isNumeric(valorImaginarioB)) {
            NumeroComplexo num1 = new NumeroComplexo(numberRealA, numberImaginarioA);

            return num1.modulo() + "";
        } else {
            return "ERRO";
        }
    }

    public static boolean isNumeric(String number) {
        if (number == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(number);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
