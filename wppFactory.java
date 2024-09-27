package factory_method;

public class wppFactory extends notificacaoFactory {
    @Override 
    public iNotificacao criarNotificacao(){
        return new notificacaoWpp();
    }    
}
