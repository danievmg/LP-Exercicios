import java.util.Scanner;
public class Exercicio6 {

    //Leia um programa que represente uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão é: F = C*(9.0/5.0)+32.0, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o Valor em Cº: ");
        double Celsius = input.nextDouble();
        double conversao = Celsius*(9.0/5.0)+32.0;
        System.out.println(Celsius+ "º Celsius são " + conversao+"º Fahrenheit");

    }
}
