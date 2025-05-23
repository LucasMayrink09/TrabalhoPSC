package com.academia.deitel.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Modulo {
    private String nome;
    private List<Pergunta> perguntasDisponiveis; // Todas as perguntas do módulo
    private List<Pergunta> perguntasSelecionadas; // 5 perguntas aleatórias
    private int dicasRestantes;

    public Modulo(String nome, List<Pergunta> perguntasDisponiveis, int dicasIniciais) {
        this.nome = nome;
        this.perguntasDisponiveis = new ArrayList<>(perguntasDisponiveis);
        this.perguntasSelecionadas = new ArrayList<>();
        this.dicasRestantes = dicasIniciais;
    }

    public String getNome() {
        return nome;
    }

    public List<Pergunta> getPerguntasSelecionadas() {
        return perguntasSelecionadas;
    }

    public int getDicasRestantes() {
        return dicasRestantes;
    }

    public void usarDica() {
        if (dicasRestantes > 0) {
            dicasRestantes--;
        }
    }

    public void selecionarPerguntas(int quantidade) {
        Collections.shuffle(perguntasDisponiveis, new Random()); // Embaralha as perguntas
        perguntasSelecionadas.clear(); // Limpa as perguntas anteriores (se houver)

        for (int i = 0; i < quantidade && i < perguntasDisponiveis.size(); i++) {
            perguntasSelecionadas.add(perguntasDisponiveis.get(i));
        }
    }
}