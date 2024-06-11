package com.dio.desafio.poo.view;

import com.dio.desafio.poo.controller.IphoneController;

public class IphoneView {
    private IphoneController controller;

    public IphoneView(IphoneController controller) {
        this.controller = controller;
    }

    // Métodos de visualização para interação com o usuário
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
        controller.selecionarMusica(musica);
    }

    public void reproduzirMusica() {
        System.out.println("Reproduzindo música");
        controller.reproduzirMusica();
    }

    public void pausarMusica() {
        System.out.println("Pausando música");
        controller.pausarMusica();
    }

    public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada para: " + numero);
        controller.fazerChamada(numero);
    }

    public void atenderChamada() {
        System.out.println("Atendendo chamada");
        controller.atenderChamada();
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
        controller.iniciarCorreioVoz();
    }

    public void navegarInternet(String url) {
        System.out.println("Navegando para: " + url);
        controller.navegarInternet(url);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
        controller.adicionarNovaAba();
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página");
        controller.atualizarPagina();
    }
}