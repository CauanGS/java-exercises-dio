package ex01;

public class Whatsapp implements Mensageiro {
    public Whatsapp() {
    }

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando mensagem via Whatsapp:"+ mensagem);
    }
}
