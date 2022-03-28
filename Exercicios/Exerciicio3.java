package Exercicios;
import java.util.Scanner;
public class Exerciicio3 {
    
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o ano Atual: ");
            int ano = input.nextInt();
        System.out.println("Insira a sua idade: ");
            int idade = input .nextInt();
        int ano_nascimento = ano - idade;
        System.out.println(ano_nascimento);
    }   
    
}
