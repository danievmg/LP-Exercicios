package Exercicio3;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero = input.nextInt();
        int vezes = numero;
        while (numero > 1){
            vezes = vezes *(numero-1);
            numero --;}
        System.out.println(vezes);


}}
