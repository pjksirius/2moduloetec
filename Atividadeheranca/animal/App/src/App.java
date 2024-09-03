import model.Cachorro;
import model.Gato;


public class App {
    public static void main(String[] args) throws Exception {
       testaranimal();
    }

    public static void testaranimal(){
        
        Cachorro cachorro = new Cachorro("Bob","Cachorro");
        Gato gato = new Gato("Cristal", "gato");

        System.out.println( "Animal " +cachorro);
        cachorro.latir();
        cachorro.caminhar();

        System.out.println("Animal " +gato);
        gato.miar();
        gato.caminhar();

    }
}
