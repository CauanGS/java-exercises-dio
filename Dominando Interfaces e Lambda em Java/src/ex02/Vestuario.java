package ex02;

public class Vestuario implements Produto {
    public float aliquota = 0.025f;

    @Override
    public float calcularImposto(float valor) {
        return valor * aliquota;
    }
}
