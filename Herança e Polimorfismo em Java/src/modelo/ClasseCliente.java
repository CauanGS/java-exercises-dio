package modelo;

public class ClasseCliente extends ClasseUsuario{
    public ClasseCliente(String nome, String email, String senha) {
        super(nome, email, true, senha);
    }
}
