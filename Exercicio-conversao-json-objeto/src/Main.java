import Modelos.Pessoa;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String pessoas = "{\"nome\":\"Rodrigo\",\"idade\":20}";

        Gson gson = new GsonBuilder().setLenient().create();

        Pessoa pessoa = gson.fromJson(pessoas, Pessoa.class);

        System.out.println(pessoa);
    }
}