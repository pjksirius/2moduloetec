package model;

public class Imovel {
    private double valor;

    // Construtor para inicializar o valor do imóvel
    public Imovel(double valor) {
        this.valor = valor;
    }

    // Método para obter o valor do imóvel
    public double getValor() {
        return valor;
    }

    // Método para definir o valor do imóvel
    public void setValor(double valor) {
        this.valor = valor;
    }

}
