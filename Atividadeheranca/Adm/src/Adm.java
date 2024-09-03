
import model.AssistenteAdm;
import model.Tecnico;

public class App {
    public static void main(String[] args)  {
        testarFuncionarios();
    }
    
    
    private static void testarFuncionarios() {
        AssistenteAdm AAdm1 = new AssistenteAdm("Lindonéia", 1246);
 
        // Corrigir chamada do método getNome() e getMatricula()
        System.out.println("Assistente Adm - Nome: " + AAdm1.getNome() + ", Matrícula: " + AAdm1.getMatricula());

        Tecnico T1 = new Tecnico("Aparecida", 1566);
        System.out.println("Técnico - Nome: " + T1.getNome() + ", Matrícula: " + T1.getMatricula());
    }
}
