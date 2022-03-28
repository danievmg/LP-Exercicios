package Exercicios;
import java.util.Scanner;
public class ExercicioBisexto {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira um ano: ");
        int ano =  input.nextInt();
        if (ano%400==0) {
            System.out.println("é Bissexto");
        }
        else if(ano%4==0){
            System.out.println("é Bissexto");
        }
        else{
            System.out.println("Não é bissexto");
        }
    }
}
