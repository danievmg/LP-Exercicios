package Exercicio7.Executavel7;

import Exercicio7.Classes7.Multiplos;

import java.util.Scanner;

public class Execultavel7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Multiplos m1 = new Multiplos();
        m1.setSomaMdetres(0);

        int i = 0;
        while (i < 6){
            System.out.print("Adicione um numero: ");
            int adicione = entrada.nextInt();
            if(adicione%3==0){
                m1.setSomaMdetres(m1.getSomaMdetres()+adicione);
                m1.situacao();
                i++;
            }else{
                i++;
                m1.situacao();
            }
            m1.media();
        }
    }
}
