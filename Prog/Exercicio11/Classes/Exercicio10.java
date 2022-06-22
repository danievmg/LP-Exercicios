package Exercicio11.Classes;

public class Exercicio10 {
    /*Exercício Elevador
    Criar uma classe denominada Elevador para armazenar as informações de um elevador dentro de um
    prédio. A classe deve armazenar o
    andar atual (térreo = 0), total de andares no prédio (desconsiderando o térreo), capacidade do elevador e
    quantas pessoas estão presentes nele.
    A classe deve também disponibilizar os seguintes métodos:
    Construtor: que deve receber como parâmetros a capacidade do elevador e
    o total de andares no prédio (os elevadores sempre começam no térreo e vazio);
    Entrar: para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);
    Sair: para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);
    Subir: para subir um andar (não deve subir se já estiver no último andar);
    Descer: para descer um andar (não deve descer se já estiver no térreo).*/
    private int andarAtual;
    private int Andares;
    private int Capacidade;
    private int PresentesPessoas;

    public Exercicio10(int andarAtual, int andares, int capacidade, int presentesPessoas) {
        this.andarAtual = andarAtual;
        Andares = andares;
        Capacidade = capacidade;
        PresentesPessoas = presentesPessoas;
    }

    public void Entrar() {
        if (this.PresentesPessoas == this.Capacidade) {
            System.out.print("Impossivel de entrar no elevador");
        } else {
            this.PresentesPessoas++;
        }
    }

    public void Sair() {
        if (this.PresentesPessoas > 0) {
            System.out.print("Impossivel, não tem ngm ali");
        } else {
            this.PresentesPessoas--;
        }
    }

    public void Subir() {
        if (this.andarAtual == this.Andares) {
            System.out.print("O Elevador está no ultimo andar");
        } else {
            this.andarAtual++;
        }
    }

    public void Descer() {
        if (this.andarAtual == 1) {
            System.out.print("Impossivel de se descer mais");
        } else {
            this.andarAtual--;
        }
    }

    public void Status() {
        System.out.print("Tem " + this.PresentesPessoas + " pessoas no elevador\n Estamos no" + this.andarAtual + " andar");
    }
}
