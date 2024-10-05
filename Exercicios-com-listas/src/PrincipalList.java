import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PrincipalList {
    public static void main(String[] args) {

//        List<String> listaDeString = new ArrayList<>();
//        listaDeString.add("Abacaxi");
//        listaDeString.add("Mercurio");
//        listaDeString.add("Cabeça");
//
//        System.out.println("Lista com ArrayList: " + listaDeString);
//
//        List<String> listaDeStringLinked = new LinkedList<>();
//        listaDeStringLinked.add("Eu");
//        listaDeStringLinked.add("Tu");
//        listaDeStringLinked.add("Nozes");
//
//        System.out.println("Lista com LinkedList: " + listaDeStringLinked);

        List<String> listaPolimorfica;

        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Abacaxi");
        listaPolimorfica.add("Mercurio");
        listaPolimorfica.add("Cabeça");

        System.out.println("Lista com ArrayList: " + listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Eu");
        listaPolimorfica.add("Tu");
        listaPolimorfica.add("Nozes");

        System.out.println("Lista com LinkedList: " + listaPolimorfica);


    }
}
