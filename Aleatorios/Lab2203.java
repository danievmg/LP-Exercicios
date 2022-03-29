import java.util.Scanner;

public class Lab2203 {
    public static void main(String[] args) {
            

        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Idade: ");
        int idade = entrada.nextInt();
        
        String nomePai = "";
        boolean podeDirigir = idade >= 18;

        if(!podeDirigir){
            
            System.out.print("Nome do pai: ");
            nomePai = entrada.next();
        }

        System.out.println("Pode dirigir?");
        if(podeDirigir){
            System.out.println("Sim claro");
        }else{
            System.out.println("Não, se fizer isso, seu pai "+ nomePai+ " sera preso");
        }

        entrada.close();
    } //não sabia que a vida pode ser horrivel da pior forma 
}
