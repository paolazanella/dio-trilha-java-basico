package com.dio.desafio.poo;

import com.dio.desafio.poo.controller.IphoneController;
import com.dio.desafio.poo.view.IphoneView;

public class Main {
    public static void main(String[] args) {
        IphoneController controller = new IphoneController("iPhone 13", "Preto", 256);
        IphoneView view = new IphoneView(controller);

        // Teste de funcionalidades
        view.selecionarMusica("Imagine - John Lennon");
        view.reproduzirMusica();
        view.pausarMusica();

        view.fazerChamada("123456789");
        view.atenderChamada();
        view.iniciarCorreioVoz();

        view.navegarInternet("https://www.apple.com");
        view.adicionarNovaAba();
        view.atualizarPagina();
    }
}