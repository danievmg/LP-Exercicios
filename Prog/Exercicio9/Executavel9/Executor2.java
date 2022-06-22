package Exercicio9.Executavel9;

import Exercicio9.Classes9.Exercicio9;

import java.util.Scanner;

public class Executor2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Exercicio9 e9 = new Exercicio9();
        System.out.print("Tecle (1) Para Ligar\nTecle (2) Para Ligar\nInterruptor");
        int interruptor = input.nextInt();
        switch (interruptor) {
            case 1:
                e9.ligar();
                break;
            case 2:
                e9.desligar();
        }
        }
        //e9.setLigado();
    }

