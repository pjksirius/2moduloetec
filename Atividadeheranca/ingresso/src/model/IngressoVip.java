package model;

public class IngressoVip extends Ingresso {
    //herda de Ingresso
    private String tipoCamarote;
    //Construtor
    public IngressoVip(int valor, String tipoCamarote) {
        super(valor);
        this.tipoCamarote = tipoCamarote;
    }

    @Override
    public String toString() {
        return "Ingresso VIP (" + tipoCamarote + ")\nValor do ingresso: R$" + getValor();
    }

}
