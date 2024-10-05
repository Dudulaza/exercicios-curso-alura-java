import Modelos.Veiculo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

public class PrincipalVeiculoJson {
    public static void main(String[] args) {

        List<Veiculo> veiculos = new ArrayList<>();

        Veiculo veiculo = new Veiculo("Chevrolet", "Gol", 2019, 19000.00);
        Veiculo veiculo2 = new Veiculo("Ford", "Focus", 2011, 11000.00);

        veiculos.add(veiculo);
        veiculos.add(veiculo2);


        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String veiculoJson = gson.toJson(veiculos);

        System.out.println(veiculoJson);
    }
}
