package ex02;

public class Alimentacao implements Produto {
    public float aliquota = 0.01f;

    @Override
    public float calcularImposto(float valor) {
        return valor * aliquota;
    }
}
