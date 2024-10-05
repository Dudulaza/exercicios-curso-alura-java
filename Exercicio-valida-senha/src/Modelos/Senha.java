package Modelos;

public class Senha {
    private String senha;

    public Senha(String senha){
        this.senha = senha;

        if(senha.length() < 8){
            throw new SenhaInvalidaException("A senha precisa ter mais que 8 caracteres");
        }
    }

    @Override
    public String toString() {
        return senha;
    }
}
