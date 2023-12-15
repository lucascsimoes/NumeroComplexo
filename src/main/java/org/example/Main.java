package org.example;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame window = new JFrame("Números Complexos");
        window.setSize(700, 400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(new GridLayout(2, 1));

        JPanel divTexts = new JPanel(new FlowLayout());

        JPanel divNumberA = new JPanel(new GridLayout(2, 1));
        JLabel labelNumberA = new JLabel("a", SwingConstants.CENTER);
        labelNumberA.setFont(new Font("Arial", Font.PLAIN, 20));
        JTextField numberA = new JTextField(2);
        numberA.setFont(new Font("Arial", Font.PLAIN, 20));
        divNumberA.add(labelNumberA);
        divNumberA.add(numberA);

        JPanel divNumberB = new JPanel(new GridLayout(2, 1));
        JLabel labelNumberB = new JLabel("b", SwingConstants.CENTER);
        labelNumberB.setFont(new Font("Arial", Font.PLAIN, 20));
        JTextField numberB = new JTextField(2);
        numberB.setFont(new Font("Arial", Font.PLAIN, 20));
        divNumberB.add(labelNumberB);
        divNumberB.add(numberB);

        JPanel divResultado = new JPanel(new GridLayout(2, 1));
        JLabel labelResultado = new JLabel("Resultado", SwingConstants.CENTER);
        labelResultado.setFont(new Font("Arial", Font.PLAIN, 20));
        JTextField resultado = new JTextField(2);
        resultado.setFont(new Font("Arial", Font.PLAIN, 20));
        divResultado.add(labelResultado);
        divResultado.add(resultado);

        divNumberA.setPreferredSize(new Dimension(200, 100));
        divNumberB.setPreferredSize(new Dimension(200, 100));
        divResultado.setPreferredSize(new Dimension(200, 100));

        divTexts.add(divNumberA);
        divTexts.add(divNumberB);
        divTexts.add(divResultado);

        JPanel divButtons = new JPanel(new FlowLayout());

        JButton soma = new JButton("Soma");
        soma.addActionListener(e -> resultado.setText(Calcular.somarValores(numberA.getText(), numberB.getText())));

        JButton subtracao = new JButton("Subtração");
        subtracao.addActionListener(e -> resultado.setText(Calcular.subtrairValores(numberA.getText(), numberB.getText())));

        JButton modulo = new JButton("Módulo");
        modulo.addActionListener(e -> resultado.setText(Calcular.modularValores(numberA.getText(), numberB.getText())   ));

        divButtons.add(soma);
        divButtons.add(subtracao);
        divButtons.add(modulo);

        window.add(divTexts);
        window.add(divButtons);

        window.setVisible(true);

    }
}