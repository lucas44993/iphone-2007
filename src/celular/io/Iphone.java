package celular.io;
import celular.io.apps.AparelhoTelefonico;
import celular.io.apps.NavegadorDeInternet;
import celular.io.apps.ReprodutorMusical;

public class Iphone {
    public static void main(String[] args) {
        AparelhoTelefonico tel = new AparelhoTelefonico();
        tel.iniciarAparelhoTelefonico();
        tel.ligar();
        tel.atender();
        tel.iniciarCorreioVoz();

        NavegadorDeInternet nav = new NavegadorDeInternet();
        nav.iniciarNavegador();
        nav.exibirPagina();
        nav.adicionarNovaAba();
        nav.atualizarAba();

        ReprodutorMusical musica = new ReprodutorMusical();
        musica.iniciarAplicativoMusica();
        musica.selecionarMusica();
        musica.tocar();
        musica.pauseMusica();
    }


}