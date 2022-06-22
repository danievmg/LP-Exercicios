package Exercicio9.Classes9;

public class Exercicio9 {
/*Criar uma classe Lâmpada que pode ser ligada e desligada. Também deve ser possível observar o estado da lâmpada.
O programa deve instanciar objetos da classe Lampada e utilizar seus métodos.
*/
    private boolean ligado;

    public void desligar(){
        this.ligado = false;
        System.out.print("A Lampada está desligada");
    }
    public void ligar(){
        this.ligado = true;
        System.out.print("A Lampada está Ligada");
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
}
