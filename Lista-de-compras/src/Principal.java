import Modelos.Produto;
import Modelos.ProdutoPerecivel;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Produto laranja = new Produto("Laranja", 3.99, 11);
        Produto leiteCondensado = new Produto("Leite condensado", 4.59, 2);
        Produto cafe = new Produto("Café", 12.90, 2);


        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(laranja);
        listaDeProdutos.add(leiteCondensado);
        listaDeProdutos.add(cafe);

        System.out.println("Tamanho da lista: " + listaDeProdutos.size());
        System.out.println("Produto na posição 0: " + listaDeProdutos.get(0).getNome());
        System.out.println(listaDeProdutos.toString());

        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Abacaxi", 12.99, 1, "12-12-2021");
        System.out.println(produtoPerecivel);
    }
}
