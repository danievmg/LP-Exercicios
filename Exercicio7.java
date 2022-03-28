
public class Exercicio7 {
   
   //A importância de R$ 780.000,00 será dividida entre três ganhadores de um concurso, sendo que:O primeiro ganhador receberá 46% do total;O segundo receberá 32% do total;O terceiro receberá o restante.Calcule e imprima a quantia recebida por cada um dos ganhadores.

   
    public static void main(String[] args) {
        // valores, 46%  = 46/100 32% = 32/100 22% = 22/100
        double ganhador = 780000*(0.046);
        double segundo = 780000*(0.036);
        double terceiro = 780000*(0.022);
        System.out.println("Primeiro Lugar ganhou: R$" + ganhador + "\n Segundo Lugar ganhou: R$" + segundo +"\n Terceiro Lugar ganhou: R$" + terceiro);
    }
}




