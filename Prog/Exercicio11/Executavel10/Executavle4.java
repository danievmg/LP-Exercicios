package Exercicio11.Executavel10;

import Exercicio11.Classes.Exercicio10;

import java.util.Scanner;

public class Executavle4 {
    public static void main(String[] args) {
        Exercicio10 e11 = new Exercicio10(1, 10, 6, 0);
        Scanner entrada = new Scanner(System.in);
        System.out.print("1 - Subir\n2 - Descer\n3 - Entrar\n4-Sair");

        while (0==0) {
            int opccao = entrada.nextInt();
            switch (opccao){
                case 1:
                    e11.Subir();
                    e11.Status();
                    break;
                case 2:
                    e11.Descer();
                    e11.Status();
                    break;
                case 3:
                    e11.Entrar();
                    e11.Status();
                    break;
                case 4:
                    e11.Sair();
                    e11.Status();
                    break;
            }

        }
    }
}
