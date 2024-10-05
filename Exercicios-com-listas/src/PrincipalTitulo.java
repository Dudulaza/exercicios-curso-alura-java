import Modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;

public class PrincipalTitulo {
    public static void main(String[] args) {

        Titulo titulo = new Titulo("A calça mal assombrada");
        Titulo titulo2 = new Titulo("Homem-Aranha");
        Titulo titulo3 = new Titulo("Thor");
        Titulo titulo4 = new Titulo("João e Maria");


        ArrayList<Titulo> listaDeTitulos = new ArrayList<>();
        listaDeTitulos.add(titulo);
        listaDeTitulos.add(titulo2);
        listaDeTitulos.add(titulo3);
        listaDeTitulos.add(titulo4);

        Collections.sort(listaDeTitulos);
        System.out.println(listaDeTitulos);
    }
}
