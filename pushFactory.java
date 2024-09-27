package factory_method;

public class pushFactory extends notificacaoFactory {
    @Override
    public iNotificacao criarNotificacao(){
        return new notificacaoPush();
    }    
}
