package ex01;

public class RedesSociais implements Mensageiro {
    public RedesSociais() {
    }

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando mensagem via Redes Sociais:"+ mensagem);
    }
}
