package ex02;

public class SaudeBemEstar implements Produto {
    public float aliquota = 0.015f;

    @Override
    public float calcularImposto(float valor) {
        return valor * aliquota;
    }
}
