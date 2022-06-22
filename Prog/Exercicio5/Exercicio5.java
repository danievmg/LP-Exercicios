package Exercicio5;

import java.util.Scanner;

/*Faça um programa que simule o menu de uma agenda eletrônica. Agenda deve possuir opções tais como: (só precisa criar o menu)
Adicionar contato;
buscar contato;
remover contato;
editar contato;
sair
*/
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite Uma opção\n1)Adicionar contato;\n" +
                "2)buscar contato;\n" +
                "3)remover contato;\n" +
                "4)editar contato;\n" +
                "5)sair\n Opção: ");

        int funcao = input.nextInt();
           if (funcao > 0 && funcao < 6) {
               switch(funcao){
                   case 1:
                       System.out.println("Adicionando contato");
                       break;
                   case 2:
                       System.out.println("Buscando Contato");
                       break;
                   case 3:
                       System.out.println("Remover contato");
                       break;
                   case 4:
                       System.out.println("Editando Contato");
                       break;
                   case 5:
                       System.out.println("Saindo...");
               }
           }else {
               System.out.println("Insira um opção valida");
           }



    }
}
