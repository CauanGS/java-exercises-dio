package ex01;

public class Email implements Mensageiro{
    public Email() {
    }

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando mensagem via Email:"+ mensagem);
    }
}
