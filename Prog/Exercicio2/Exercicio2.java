package Exercicio2;


/* Faça um programa que de 0 a 100 verifique se o número é par ou impar. Caso esse valor seja par, deverá imprimir  “Número par” caso contrário, “Número ímpar”.*/

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o valor: ");
        int opcao = input.nextInt();
        int descobrindo = (opcao % 2);
        if (descobrindo == 0){
            System.out.println("é Par");
        }else if(descobrindo !=0){
            System.out.println("é Impar");
        }else if(opcao > 100 || opcao < 0){
            System.out.println("O Numero está fora da faixa 0 - 100...");
        }

    }
}
//Danievmg Esteve aqui