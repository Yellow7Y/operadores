package com.company;

import java.util.Scanner;

public class operadores_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double resultado = 0.0;
        System.out.print("POR FAVOR, INFORME O VALOR DE SUA CONTA DE LUZ: ");
        resultado = scanner.nextDouble();
        System.out.print("INFORME O VALOR DE SUA CONTA DE AGUA: ");
        resultado = scanner.nextDouble();
        System.out.print("INFORME O VALOR DE SUA CONTA DE TELEFONE: ");
        resultado = scanner.nextDouble();
        System.out.print("INFORME O VALOR DA ESCOLA DE SEU FILHO: ");
        resultado = scanner.nextDouble();
        System.out.print("INFORME O VALOR DE SUA FATURA DO CARTÃO: ");
        resultado = scanner.nextDouble();
        System.out.print("INFORME O VALOR GASTO NO SUPERMECADO: ");
        resultado = scanner.nextDouble();
        System.out.println("O VALOR QUE VOCÊ PAGARÁ ESSE MÊS NAS CONTAS DE SUA RESIDÊNCIA É: " + resultado + " REAIS");
    }
}

/*
Faça um programa que receba:
O valor da conta de luz
Conta de água
Conta de telefone
Escola do filho
Fatura do cartão
Gastos com supermercado
... e mostre o gasto total que a família teve no mês. Não esqueça de usar muito o operador "+=".
 */
