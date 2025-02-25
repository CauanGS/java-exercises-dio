package modelo.ex01;

public class IngressoFamilia extends Ingresso{
    private int numeroPessoas;

    public IngressoFamilia(float valor, String nomeFilme, boolean isDublado) {
        super(valor, nomeFilme, isDublado);
    }


    @Override
    public double calcularValorReal() {
        double valorReal = getValor() * numeroPessoas;
        if(numeroPessoas > 3){
            return valorReal * 0.95;
        }
        return valorReal;
    }
}
