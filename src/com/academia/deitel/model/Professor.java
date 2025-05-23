package com.academia.deitel.model;

public class Professor {
    private String nome;

    public Professor(String nome) {
        this.nome = nome;
    }

    public void darBoasVindas(Jogador jogador) {
        System.out.println("\n-----------------------------------------------------");
        System.out.println("Professor Deitel: Seja Bem Vindo à Gloriosa Academia Deitel, " + jogador.getNome() + "!");
        System.out.println("-----------------------------------------------------");
    }

    public void explicarGameplay() {
        System.out.println("\nProfessor Deitel: Sua jornada será repleta de desafios conceituais e práticos.");
        System.out.println("Você passará por módulos temáticos e enfrentará os 'Bug Mestres'.");
        System.out.println("Seu objetivo é obter o diploma de 'Mestre em Orientação a Objetos Java'!");
        System.out.println("Responda corretamente as perguntas e complete os códigos para avançar.");
        System.out.println("Não se preocupe, eu estarei aqui para guiá-lo e dar algumas dicas limitadas!");
        System.out.println("-----------------------------------------------------");
    }

    public void darFeedback(boolean correto) {
        if (correto) {
            System.out.println("Professor Deitel: Resposta correta! Excelente trabalho!");
        } else {
            System.out.println("Professor Deitel: Resposta incorreta. Não desanime, continue tentando!");
        }
    }

    public void darDica(Pergunta pergunta) {
        System.out.println("Professor Deitel: Aqui vai uma dica valiosa: " + pergunta.getDica());
    }
}