package org.example;

public class NumeroComplexo {
    private double real;
    private double imaginario;

    public NumeroComplexo(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    public NumeroComplexo somar(NumeroComplexo outro) {
        double novoReal = this.real + outro.real;
        double novoImaginario = this.imaginario + outro.imaginario;
        return new NumeroComplexo(novoReal, novoImaginario);
    }

    public NumeroComplexo subtrair(NumeroComplexo outro) {
        double novoReal = this.real - outro.real;
        double novoImaginario = this.imaginario - outro.imaginario;
        return new NumeroComplexo(novoReal, novoImaginario);
    }

    public double modulo() {
        return Math.sqrt(Math.pow(this.real, 2) + Math.pow(this.imaginario, 2));
    }

    @Override
    public String toString() {
        return this.real + " + " + this.imaginario + "i";
    }
}
