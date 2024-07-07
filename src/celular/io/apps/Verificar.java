package celular.io.apps;

public class Verificar {
    protected void verificarSinal(){
        System.out.println("O aparelho está com sinal");
    }
    protected void verificarInternet(){
        verificarSinal();
        System.out.println("O aparelho está conectado a intenet");
    }
}
