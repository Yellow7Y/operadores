package com.company;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("INFORME A NOTA QUE VOCE TIROU NA PRIMEIRA PROVA: ");
        Float notaUmInformada = scanner.nextFloat();
        System.out.print("INFORME A NOTA QUE VOCE TIROU NA SEGUNDA PROVA: ");
        Float notaDoisInformada = scanner.nextFloat();
        int fatorDivisaoDasNotas = 2;
        Float mediaDaNotaInformada = notaUmInformada + notaDoisInformada / fatorDivisaoDasNotas;
        Boolean resultadoAprovado = (mediaDaNotaInformada >= 7);
        Boolean resultadoReprovado = (7 >= mediaDaNotaInformada);
        int resultadoAprovadoComDistincao = 10;
        if (resultadoAprovado) {
            System.out.println("PARABÉNS, VOCE FOI APROVADO. ");
        }
        if (resultadoReprovado) {
            System.out.println("PARABÉNS, VOCE FOI APROVADO. ");
        }
        else {
            System.out.println("PARABÉNS, VOCE FOI APROVADO COM DISTINCAO. ");
        }
}
}
