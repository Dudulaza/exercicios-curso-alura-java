import Modelos.Titulo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PrincipalTituloJson {
    public static void main(String[] args) {

        Titulo titulo = new Titulo("Abacaxi", 2019);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String Json = gson.toJson(titulo);

        System.out.println(Json);
    }
}
