package model;

public class RendaDasPessoas {
    private double valor;

    public RendaDasPessoas(double valor) {
        this.valor = valor;
    }
    
    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Valor do salário atual é: R$" + valor;
    }

}
