package iphone_sistema;

import iphone_interface.AparelhoTelefonico;
import iphone_interface.NavegadorInternet;
import iphone_interface.ReprodutorMusical;

public class iPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    @Override
    public void ligar(String numero) {
        System.out.println("Você está ligando para o número: " + numero);

    }

    @Override
    public void atender() {
        System.out.println("Você atendeu o telefone.");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Você ira ouvir sua mensagem agora.");

    }

    @Override
    public void exibirPagina(String nomeDaPagina) {
        System.out.println("Você está acessando a página: " +nomeDaPagina);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionado uma nova aba. ");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("A página foi atualizada.");

    }

    @Override
    public void tocar() {
        System.out.println("Inicializando o reprodutor de Música e tocando playList");
    }

    @Override
    public void pausar() {
        System.out.println("Reprodutor de Música está pausado.");

    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Tocando a Música: "+musica);

    }
}
