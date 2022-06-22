package Exercicio8.Executavel;

import Exercicio8.Classses8.Exercicio8;

import java.util.Scanner;

public class Executor {
    public static void main(String[] args) {
        Exercicio8 E1 = new Exercicio8();

        Scanner input = new Scanner(System.in);
        System.out.print("-Quantidade: ");
        E1.setQuantidade(input.nextInt());
        while (0 == 0) {


            System.out.print("Digite Uma opção\n1)Aumenta +1;\n" +
                    "2)Mostra o Valor;\n" +
                    "3)Zera o contador;\n");
            int opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    E1.Aumentar();
                    break;
                case 2:
                    E1.Valor();
                    break;
                case 3:
                    E1.Zerar();
                    break;
            }


        }
    }
}