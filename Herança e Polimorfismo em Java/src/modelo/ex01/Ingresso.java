package modelo.ex01;

public abstract class Ingresso {
    private float valor;
    private String nomeFilme;
    private boolean isDublado;

    public Ingresso(float valor, String nomeFilme, boolean isDublado) {
        this.valor = valor;
        this.nomeFilme = nomeFilme;
        this.isDublado = isDublado;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public boolean isDublado() {
        return isDublado;
    }

    public void setDublado(boolean dublado) {
        isDublado = dublado;
    }

    public abstract double calcularValorReal();
}
