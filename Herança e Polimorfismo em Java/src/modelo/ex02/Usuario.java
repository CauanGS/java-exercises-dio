package modelo.ex02;

public abstract class Usuario {
    private String nome;
    private String email;
    private String senha;
    private boolean isAdministrador;

    public Usuario(String nome, String email, boolean isAdministrador, String senha) {
        this.nome = nome;
        this.email = email;
        this.isAdministrador = isAdministrador;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAdministrador() {
        return isAdministrador;
    }

    public void setAdministrador(boolean administrador) {
        isAdministrador = administrador;
    }

    public void realizarLogin(){

    }

    public void realizarLogoff(){

    }

    public void alterarDados(){

    }

    public void alterarSenha(){

    }
}
