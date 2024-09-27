package factory_method;

public class teste {
    public static void main(String[] args){
        notificacaoService service = new notificacaoService();
        service.enviarNotificacao(new pushFactory(), "teste de mensagem");
    }
    
}
