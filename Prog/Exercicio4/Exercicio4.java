package Exercicio4;

import java.util.Scanner;

public class Exercicio4 {
    //Faça um programa que calcule os 20 primeiros múltiplos de um valor informado via  teclado.
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int numeros = input.nextInt();
        int vezes = 20;
        while (vezes != 0) {
            System.out.println(numeros * vezes);
            vezes--;
        }
    }
}