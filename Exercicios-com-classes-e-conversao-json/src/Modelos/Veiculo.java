package Modelos;

public class Veiculo {

    private String marca;
    private String modelo;
    private int anoFabricacao;
    private double preco;

    public Veiculo(String marca, String modelo, Integer anoFabricacao, Double preco){
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.preco = preco;
    }
}
