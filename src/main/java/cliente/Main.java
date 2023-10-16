package cliente;

import iphone_sistema.iPhone;

public class Main {
    public static void main(String[] args) {

        iPhone phone = new iPhone();

        phone.ligar("2233445566778899");
        phone.iniciarCorreioVoz();
        phone.atender();

        phone.tocar();
        phone.selecionarMusica("qualquer música");
        phone.pausar();

        phone.exibirPagina("google");
        phone.adicionarNovaAba();
        phone.atualizarPagina();



    }
}