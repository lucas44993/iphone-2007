package celular.io.apps;

public class AparelhoTelefonico extends Verificar {

    public void iniciarAparelhoTelefonico() {
        System.out.println("Iniciando aparelho telefonico");
    }
    public void ligar() {
        verificarSinal();
        System.out.println("Ligando");
    }
    public void atender() {
        System.out.println("Atendeu");
    }
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio Voz");
    }
}
