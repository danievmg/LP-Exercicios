package Exercicio1;
/*Faça um programa que verifique os números de 0 a 500, e verifique se ele está entre o intervalo de 100 e 200.
 Se estiver dentro desta faixa, imprimir “Você digitou um número entre 100 e 200”, senão  imprima “Você digitou um número fora da faixa”.*/


import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(("Inissira um numero de 0 a 500: "));
        int codigo = input.nextInt();
        if (codigo > 200 || codigo < 100){
            System.out.println("--Faixa entre 100 e 200--\nVocê digitou um numero fora da faixa");
            //System.out.println("Você digitou um numero entre 100 e 200");
        }else{
            //System.out.println("Você digitou um numero fora da faixa");
            System.out.println("--Faixa entre 100 e 2000--\nVocê digitou um numero entre 100 e 200");
        }
    }
}

// Danievmg esteve aqui LOL