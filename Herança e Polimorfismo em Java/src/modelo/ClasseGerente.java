package modelo;

public class ClasseGerente extends ClasseUsuario{
    public ClasseGerente(String nome, String email, String senha) {
        super(nome, email, true, senha);
    }
}
