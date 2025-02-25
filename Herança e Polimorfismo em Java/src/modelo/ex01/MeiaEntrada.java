package modelo.ex01;

public class MeiaEntrada extends Ingresso{
    public MeiaEntrada(float valor, String nomeFilme, boolean isDublado) {
        super(valor, nomeFilme, isDublado);
    }

    @Override
    public double calcularValorReal() {
        return (getValor() / 2);
    }
}
