package celular.io.apps;

public class NavegadorDeInternet extends Verificar {
    public void iniciarNavegador(){
        verificarInternet();
        System.out.println("Iniciando navagador.");
    }
    public void exibirPagina(){
        System.out.println("Exibindo pagina.");
    }
    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba.");
    }
    public void atualizarAba(){
        System.out.println("Atualizando aba.");
    }
}
