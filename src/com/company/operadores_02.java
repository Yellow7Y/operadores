package com.company;

import java.util.Scanner;

public class operadores_02 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("POR FAVOR, INFORME O VALOR DE SUA COMPRA: ");
        Double valorDeCompraImformado = scanner.nextDouble();
        Boolean ComFrete = valorDeCompraImformado < 100;
        Double valorFinal= valorDeCompraImformado;
        if (ComFrete) {
            valorFinal += 15.0;
        }
        System.out.println("O VALOR A SER PAGO PELO PRODUTO É: " + valorFinal + " REAIS");
        scanner.close();
    }
}