import java.io.FileWriter;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {

        FileWriter escrita = new FileWriter("arquivo.txt");
        escrita.write("Conteúdo a ser gravado no arquivo.");
        escrita.close();

    }
}