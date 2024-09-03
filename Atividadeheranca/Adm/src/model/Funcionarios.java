package model;

public class Funcionarios {

    // atributos
    private String nome;
    private int matricula;
   
    
    // construtor
    public Funcionarios(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }
    
    // getter e setter para nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    // getter e setter para matricula
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

}
