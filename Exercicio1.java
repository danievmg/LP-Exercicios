import java.util.Scanner;
public class Exercicio1 {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira um numero: ");
        int numero = entrada.nextInt();
        int sucessor = numero + 1;
        int antecessor = numero - 1; 
        System.out.println("Sucessor: " + sucessor);
        System.out.println("antecessor: " +  antecessor);
    }
}
