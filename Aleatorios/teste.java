import java.util.Scanner;

public class teste{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        int numero = 0, antecessor = 0, sucessor = 0;
       
        System.out.println("Informe um número");
        numero = entrada.nextInt();
        sucessor = numero + 1;
        antecessor = numero -1;
       
        System.out.println("O número informado foi "+numero);
        System.out.println("O antecessor é "+antecessor);
        System.out.println("O sucessor é "+sucessor);
       
    }
}