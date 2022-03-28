import java.util.Scanner;
public class Exercicio2{
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("1º Numero;");
            int numero = entrada.nextInt();
        System.out.println("2º Numero;");
            int nuemro2 = entrada.nextInt();
        System.out.println("3º Nuemro;");
            int numero3 = entrada.nextInt();
        System.out.println( nuemro2 + numero + numero3);
    }
}