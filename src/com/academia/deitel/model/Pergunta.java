package com.academia.deitel.model;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class Pergunta {
    private String texto;
    private Map<Character, String> opcoes; // A, B, C, D
    private String respostaCorreta; // Pode ser a letra ou o texto completo para completar código
    private String dica;
    private int paginaLivro;
    private TipoPergunta tipo;

    public Pergunta(String texto, Map<Character, String> opcoes, String respostaCorreta, String dica, int paginaLivro, TipoPergunta tipo) {
        this.texto = texto;
        this.opcoes = opcoes != null ? new LinkedHashMap<>(opcoes) : new LinkedHashMap<>(); // Usar LinkedHashMap para manter a ordem
        this.respostaCorreta = respostaCorreta;
        this.dica = dica;
        this.paginaLivro = paginaLivro;
        this.tipo = tipo;
    }

    // Para perguntas de completar/corrigir código sem opções de múltipla escolha
    public Pergunta(String texto, String respostaCorreta, String dica, int paginaLivro, TipoPergunta tipo) {
        this.texto = texto;
        this.opcoes = new LinkedHashMap<>();
        this.respostaCorreta = respostaCorreta;
        this.dica = dica;
        this.paginaLivro = paginaLivro;
        this.tipo = tipo;
    }

    // Getters
    public String getTexto() {
        return texto;
    }

    public Map<Character, String> getOpcoes() {
        return Collections.unmodifiableMap(opcoes); // Retorna uma cópia imutável
    }

    public String getRespostaCorreta() {
        return respostaCorreta;
    }

    public String getDica() {
        return dica;
    }

    public int getPaginaLivro() {
        return paginaLivro;
    }

    public TipoPergunta getTipo() {
        return tipo;
    }

    public boolean verificarResposta(String respostaDoJogador) {
        if (tipo == TipoPergunta.QUIZ_TEORICO) {
            // Para quiz teórico, a resposta é a letra (a, b, c...)
            return respostaDoJogador.trim().toLowerCase().charAt(0) == respostaCorreta.trim().toLowerCase().charAt(0);
        } else {
            // Para completar/corrigir, a resposta é o texto
            return respostaDoJogador.trim().equalsIgnoreCase(respostaCorreta.trim());
        }
    }

    public void exibirPergunta() {
        System.out.println("\n-----------------------------------------------------");
        System.out.println("Pergunta (Pág. " + paginaLivro + "):");
        System.out.println(texto);

        if (!opcoes.isEmpty()) {
            for (Map.Entry<Character, String> entry : opcoes.entrySet()) {
                System.out.println("(" + entry.getKey() + ") " + entry.getValue());
            }
        }
        System.out.print("Sua resposta: ");
    }
}
