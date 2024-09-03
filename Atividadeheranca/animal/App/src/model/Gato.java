package model;

public class Gato extends Animal{
  
    public Gato(String nome, String especie) {
        super(nome, especie); 
    }
   
    public void  miar() {
        System.out.println("O gato está miando.");
    }


}
