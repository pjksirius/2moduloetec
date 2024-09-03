package model;

public class Ingresso {
    private int valor;
    //Construtor
    public Ingresso(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    @Override
    //Retorna o valor da classe ingresso.
    public String toString() {
        return "Ingresso Normal\nValor do ingresso: R$" + valor;
    }

}
