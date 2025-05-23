package com.academia.deitel.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Boss {
    private String nome;
    private String tipoErro; // Ex: "Erro de Sintaxe", "Erro de Lógica"
    private List<Pergunta> perguntasDisponiveis; // Todas as perguntas do boss
    private List<Pergunta> perguntasSelecionadas; // 3 perguntas aleatórias

    public Boss(String nome, String tipoErro, List<Pergunta> perguntasDisponiveis) {
        this.nome = nome;
        this.tipoErro = tipoErro;
        this.perguntasDisponiveis = new ArrayList<>(perguntasDisponiveis);
        this.perguntasSelecionadas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getTipoErro() {
        return tipoErro;
    }

    public List<Pergunta> getPerguntasSelecionadas() {
        return perguntasSelecionadas;
    }

    public void selecionarPerguntas(int quantidade) {
        Collections.shuffle(perguntasDisponiveis, new Random()); // Embaralha as perguntas
        perguntasSelecionadas.clear(); // Limpa as perguntas anteriores (se houver)

        for (int i = 0; i < quantidade && i < perguntasDisponiveis.size(); i++) {
            perguntasSelecionadas.add(perguntasDisponiveis.get(i));
        }
    }
}