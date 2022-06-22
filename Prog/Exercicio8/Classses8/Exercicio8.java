package Exercicio8.Classses8;

public class Exercicio8 {
   /*Criar uma classe Contador que encapsule um valor usado para a contagem de itens ou eventos. A classe deve conter métodos que devem:
    Zerar o contador;
    Incrementar o contador em uma unidade;
    Retornar o valor do contador;
    O programa deve instanciar objetos da classe Contador e utilizar seus métodos.*/
    private int quantidade;


    public void Zerar (){this.quantidade = 0;}
    public void Aumentar(){this.quantidade++;}
    public void Valor(){System.out.print("O Valor que está Marcando é: "+quantidade +"\n");}

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
