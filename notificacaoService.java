package factory_method;

public class notificacaoService {
    public void enviarNotificacao(notificacaoFactory factory, String mensagem){
        iNotificacao notificacao = factory.criarNotificacao();
        notificacao.enviar(mensagem);
    }
    
}
