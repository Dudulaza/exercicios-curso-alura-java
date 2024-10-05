import Modelos.Animal;
import Modelos.Cachorro;

public class PrincipalClasses {
    public static void main(String[] args) {
        Animal animal = new Cachorro("Vira-lata", 3);

        if (animal instanceof Cachorro) {
            Cachorro cachorro = (Cachorro) animal;
            System.out.println(cachorro.getEspecie());
        } else {
            System.out.println("O objeto não é um cachorro.");
        }


    }
}
