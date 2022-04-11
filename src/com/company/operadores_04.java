package com.company;

import java.util.Scanner;

/*
Crie um programa que receba a idade de uma pessoa e a quantidade de tempo que essa pessoa contribuiu com a previdência,
 depois verifique se ela pode aposentar ou não.
Nas regras desse programa a pessoa vai precisar ter, pelo menos, 55 anos e ter contribuído com, pelo menos, 25 anos.
 Se ela passar nessas duas condições, então mostre pra ela uma mensagem dizendo que ela pode aposentar.
 */

public class operadores_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("POR FAVOR, INFORME SUA IDADE: ");
        Double idade = scanner.nextDouble();
        System.out.print("AGORA, INFORME QUANTOS MESES VOCÊ JÁ CONTRIBUIU COM A PREVIDÊNCIA: ");
        Double TempoDeContribuiçao = scanner.nextDouble();
        Boolean resultado = (TempoDeContribuiçao == 25) && (idade == 55);
        if (resultado) {
            System.out.println("PARABÉNS, VOCÊ JÁ PODE APOSENTAR!");
        }else{
            System.out.println("INFELIZMENTE, VOCÊ AINDA NÃO PODE APOSENTAR");
        }
    }
}

