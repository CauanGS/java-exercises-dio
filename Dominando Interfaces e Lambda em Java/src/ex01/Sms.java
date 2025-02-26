package ex01;

public class Sms implements Mensageiro{
    public Sms() {
    }

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando mensagem via Sms:"+ mensagem);
    }
}
