package modelo;

public class ClasseVendedor extends ClasseUsuario{
    private int numeroDeVendas;
    public ClasseVendedor(String nome, String email, String senha) {
        super(nome, email, false, senha);
    }
}
