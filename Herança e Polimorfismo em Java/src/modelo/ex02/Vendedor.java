package modelo.ex02;

public final class Vendedor extends Usuario {
    private int numeroDeVendas;
    public Vendedor(String nome, String email, String senha) {
        super(nome, email, false, senha);
    }

    public void consultarVendas(){

    }

}
