package com.dio.desafio.poo.model;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String modelo;
    private String cor;
    private int capacidadeArmazenamento;
    private String musicaAtual;

    // Construtor
    public Iphone(String modelo, String cor, int capacidadeArmazenamento) {
        this.modelo = modelo;
        this.cor = cor;
        this.capacidadeArmazenamento = capacidadeArmazenamento;
        this.musicaAtual = "";
    }

    // Métodos da interface ReprodutorMusical
    @Override
    public void tocar() {
        if (!musicaAtual.isEmpty()) {
            System.out.println("Tocando música: " + musicaAtual);
        } else {
            System.out.println("Nenhuma música selecionada.");
        }
    }

    @Override
    public void pausar() {
        if (!musicaAtual.isEmpty()) {
            System.out.println("Pausando música: " + musicaAtual);
        } else {
            System.out.println("Nenhuma música está tocando.");
        }
    }

    @Override
    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;
        System.out.println("Selecionando música: " + musica);
    }

    // Métodos da interface AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    // Métodos da interface NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }
}