package ex02;

public class Cultura implements Produto {
    public float aliquota = 0.04f;

    @Override
    public float calcularImposto(float valor) {
        return valor * aliquota;
    }
}
