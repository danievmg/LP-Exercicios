package Exercicio10.Classes10;

public class Exercicio11 {
    /* Exercício Conta
    Criar uma classe Conta que contenha o nome do cliente, o número da conta e o saldo. Estes valores deverão ser informados no construtor da classe;
    Criar um método depositar e um método sacar para realizar o depósito e o saque de valores da conta;
    Criar métodos getters para cada atributo da classe.
    O programa deve instanciar objetos da classe Conta e utilizar seus métodos.
    */
    private String nome;
    private int numeroConta;
    private float saldo;

    public Exercicio11(String nome, int numeroConta, float saldo) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void depositar() {
        System.out.print("Você depositou o dinheiro");

    }

    public void sacar() {
        System.out.print("Você Sacou o dinheiro");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
