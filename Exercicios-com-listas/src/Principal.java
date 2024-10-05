import java.util.ArrayList;
import java.util.Collections;

public class Principal {
    public static void main(String[] args) {

        //ORDENANDO NUMEROS

        ArrayList<Integer> listaDeNumeros = new ArrayList<Integer>();
        listaDeNumeros.add(3);
        listaDeNumeros.add(5);
        listaDeNumeros.add(1);
        listaDeNumeros.add(11);

        Collections.sort(listaDeNumeros);
        System.out.println(listaDeNumeros);
    }
}
