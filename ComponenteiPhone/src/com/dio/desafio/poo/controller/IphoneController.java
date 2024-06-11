package com.dio.desafio.poo.controller;

import com.dio.desafio.poo.model.Iphone;

public class IphoneController {
    private Iphone iphone;

    public IphoneController(String modelo, String cor, int capacidadeArmazenamento) {
        this.iphone = new Iphone(modelo, cor, capacidadeArmazenamento);
    }

    // Métodos de controle para interagir com o iPhone
    public void selecionarMusica(String musica) {
        iphone.selecionarMusica(musica);
    }

    public void reproduzirMusica() {
        iphone.tocar();
    }

    public void pausarMusica() {
        iphone.pausar();
    }

    public void fazerChamada(String numero) {
        iphone.ligar(numero);
    }

    public void atenderChamada() {
        iphone.atender();
    }

    public void iniciarCorreioVoz() {
        iphone.iniciarCorreioVoz();
    }

    public void navegarInternet(String url) {
        iphone.exibirPagina(url);
    }

    public void adicionarNovaAba() {
        iphone.adicionarNovaAba();
    }

    public void atualizarPagina() {
        iphone.atualizarPagina();
    }
}