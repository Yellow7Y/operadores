package com.company;

import java.util.Scanner;

public class operadoresTeste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("INFORME UM VALOR");
        Double numeroDigitado = scanner.nextDouble();
        Double numero = numeroDigitado *= 5;
        System.out.println("O VALOR FINAL É: " + numero);
    }
}
