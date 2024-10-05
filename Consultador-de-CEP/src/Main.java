import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ConsultaCep consultaCep = new ConsultaCep();
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um CEP para busca: ");
        var cep = leitura.nextLine();

        try {
            Endereco novoEndereco = consultaCep.buscaEndereco(cep);

            System.out.println(novoEndereco);

            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.salvaJson(novoEndereco);

        } catch (RuntimeException | IOException e){
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }

    }
}