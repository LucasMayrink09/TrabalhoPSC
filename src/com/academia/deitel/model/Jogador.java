package com.academia.deitel.model;

public class Jogador {
    private String nome;
    private int idade;
    private String sexo;
    private int pontos; // Para acompanhar a pontuação do jogador
    private int modulosCompletos; // Para controlar o progresso

    public Jogador(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.pontos = 0;
        this.modulosCompletos = 0;
    }

    // Métodos Getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }

    public int getPontos() {
        return pontos;
    }

    public int getModulosCompletos() {
        return modulosCompletos;
    }

    // Métodos Setters (se necessário, para atualização de dados)
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarPontos(int pontos) {
        this.pontos += pontos;
    }

    public void completarModulo() {
        this.modulosCompletos++;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", Sexo: " + sexo;
    }
}