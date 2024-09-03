package model;

public class Animal {

    public String nome;
    public String especie;
   

    public  Animal(String nome, String especie){  
        this.nome = nome;
        this.especie = especie;
    }
    
    public void caminhar() {
        System.out.println("E está caminhando.");
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Espécie: " + especie;
    }

}
