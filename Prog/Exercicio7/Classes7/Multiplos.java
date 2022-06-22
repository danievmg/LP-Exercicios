package Exercicio7.Classes7;

public class Multiplos {

    private int SomaMdetres;

    public void situacao(){
        System.out.print("Tem "+SomaMdetres+"\n");
    }
    public void media(){
        System.out.print("A Media dos Multiplos de 3 é"+SomaMdetres/6);
    }
    public int getSomaMdetres() {
        return SomaMdetres;
    }

    public void setSomaMdetres(int somaMdetres) {
        SomaMdetres = somaMdetres;
    }
}
