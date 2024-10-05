import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        String text1 = "Boa noite";
        String text2 = "Boa tarde";
        String text3 = "Bom dia";

        ArrayList<String> lista = new ArrayList<>();
        lista.add(text1);
        lista.add(text2);
        lista.add(text3);

        for (String item : lista){
            System.out.println(item);
        }
    }
}
