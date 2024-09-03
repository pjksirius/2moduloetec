package model;

public class Cachorro extends Animal{
    
     //construtor
     public Cachorro(String nome, String especie) {
        super(nome, especie); 
        
    }

    public void latir() {
        System.out.println("O cachorro está latindo.");
    }


}
