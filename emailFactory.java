package factory_method;

public class emailFactory extends notificacaoFactory{
    @Override
    public iNotificacao criarNotificacao(){
        return new notificacaoEmail();
    }    
}
