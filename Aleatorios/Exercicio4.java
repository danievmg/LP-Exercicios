import java.util.Scanner;
public class Exercicio4 {
    
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("---Insira o valor em KM/h---\nAtraves desses dados irei convertelos em m/s: ");
            double KM = input.nextInt();
        double divisao = KM/(3.6);
            System.out.println(KM + " Km/h são " + divisao + " m/s");
    }
}
