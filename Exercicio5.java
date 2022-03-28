import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual a cotacao do Dolar? em Real. ");
        float dolar = input.nextInt();
        System.out.println("Quantos dols voce tem?");
        float dolar_tem = input.nextInt();
        float conversao = dolar_tem*dolar;
        System.out.println("Voce tem R$ "+ conversao);
    }
}
