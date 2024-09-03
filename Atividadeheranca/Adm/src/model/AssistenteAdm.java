package model;

public class AssistenteAdm extends Funcionarios { 
    public AssistenteAdm(String nome, int matricula) {
        super(nome, matricula);
    }
  
    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }
    
    @Override
    public int getMatricula() {
        return super.getMatricula();
    }

    @Override
    public void setMatricula(int matricula) {
        super.setMatricula(matricula);
    }
}