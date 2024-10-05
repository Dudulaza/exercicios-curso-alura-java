package Modelos;

import java.util.ArrayList;

public class PrincipalProduto {
    public static void main(String[] args) {
        Produto p1 = new Produto("Laranja", 1.99);
        Produto p2 = new Produto("Banana", 0.40);
        Produto p3 = new Produto("Leite", 7.45);
        Produto p4 = new Produto("Chocolate", 7.00);

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(p1);
        listaDeProdutos.add(p2);
        listaDeProdutos.add(p3);
        listaDeProdutos.add(p4);

        double somaPrecos = 0;

        for(Produto produto : listaDeProdutos){
            somaPrecos += produto.getPreco();
        }

        double precoMedio = somaPrecos / listaDeProdutos.size();
        System.out.println("Preço médio dos produtos: " + precoMedio);

    }
}
