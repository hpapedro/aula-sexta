package factory_method;

public class notificacaoWpp implements iNotificacao {
    @Override
    public void enviar(String mensagem){
        System.out.println("Whatsapp" + mensagem);
    }
    
}
