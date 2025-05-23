package com.academia.deitel.main;

import com.academia.deitel.dao.BancoDePerguntas;
import com.academia.deitel.model.*;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Jogo {
    private Jogador jogador;
    private Professor professor;
    private Scanner scanner;
    private List<Modulo> modulos;
    private List<Boss> bosses; // Bosses para os módulos (Bug Mestre)
    private Boss bossFinal; // Bug Grão-Mestre

    public Jogo() {
        scanner = new Scanner(System.in);
        professor = new Professor("Deitel");
        inicializarModulosEBosses();
    }

    private void inicializarModulosEBosses() {
        modulos = new ArrayList<>();
        // Módulo 1: Capítulos 1 e 3
        modulos.add(new Modulo("Introdução a Java e Fundamentos de Classes", BancoDePerguntas.getPerguntasModulo1(), 3));
        // Módulo 2: Capítulo 4
        modulos.add(new Modulo("Encapsulamento e Modificadores de Acesso", BancoDePerguntas.getPerguntasModulo2(), 3));
        // Módulo 3: Capítulo 5 e parte do 6 (Estruturas de Controle e Arrays)
        modulos.add(new Modulo("Estruturas de Controle e Arrays", BancoDePerguntas.getPerguntasModulo3(), 3));
        // Módulo 4: Capítulo 7 (Strings)
        modulos.add(new Modulo("Manipulando Strings", BancoDePerguntas.getPerguntasModulo4(), 3));

        bosses = new ArrayList<>();
        bosses.add(new Boss("Bug de Sintaxe", "Sintaxe", BancoDePerguntas.getPerguntasBossSintaxe()));
        bosses.add(new Boss("Bug de Lógica", "Lógica", BancoDePerguntas.getPerguntasBossLogica()));
        bosses.add(new Boss("Bug de Objetos", "Objetos", BancoDePerguntas.getPerguntasBossObjetos()));
        bosses.add(new Boss("Bug de POO", "POO", BancoDePerguntas.getPerguntasBossOO())); // Um boss de POO mais geral

        // O Bug Grão-Mestre pode ser uma combinação de todos os tipos ou ter perguntas mais complexas
        bossFinal = new Boss("Bug Grão-Mestre", "Supremo", BancoDePerguntas.getPerguntasBossOO()); // Usando as perguntas de POO geral por simplicidade para o exemplo
    }

    public void iniciarJogo() {
        exibirTitulo();
        int opcao;
        do {
            exibirMenuPrincipal();
            opcao = lerInteiro("\nEscolha uma opção: ");

            switch (opcao) {
                case 1:
                    novoJogo();
                    break;
                case 2:
                    System.out.println("Funcionalidade 'Continuar Jogo' não implementada neste momento.");
                    break;
                case 3:
                    System.out.println("Funcionalidade 'Créditos' não implementada neste momento.");
                    break;
                case 4:
                    sair();
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);
    }

    private void exibirTitulo() {
        System.out.println("*****************************************************");
        System.out.println("* HERÓIS DO JAVA: A CONQUISTA DA ACADEMIA DEITEL     *");
        System.out.println("*****************************************************");
    }

    private void exibirMenuPrincipal() {
        System.out.println("\n--- MENU PRINCIPAL ---");
        System.out.println("1. Iniciar Novo Jogo");
        System.out.println("2. Continuar Jogo (Não implementado)");
        System.out.println("3. Créditos (Não implementado)");
        System.out.println("4. Sair");
    }

    private void novoJogo() {
        System.out.println("\n--- NOVO JOGO ---");
        System.out.print("Digite o nome do seu personagem: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a idade do seu personagem: ");
        int idade = lerInteiroSemErro();
        System.out.print("Digite o sexo do seu personagem (M/F/Outro): ");
        String sexo = scanner.nextLine();

        jogador = new Jogador(nome, idade, sexo);
        professor.darBoasVindas(jogador);
        professor.explicarGameplay();

        System.out.println("\nPressione Enter para começar sua jornada...");
        scanner.nextLine(); // Consumir o Enter

        // Lógica de módulos
        for (int i = 0; i < modulos.size(); i++) {
            Modulo moduloAtual = modulos.get(i);
            System.out.println("\n-----------------------------------------------------");
            System.out.println("PROFESSOR DEITEL: Bem-vindo ao Módulo " + (i + 1) + ": " + moduloAtual.getNome() + "!");
            System.out.println("Você terá " + moduloAtual.getDicasRestantes() + " dicas para este módulo.");
            System.out.println("-----------------------------------------------------");

            boolean moduloConcluido = jogarModulo(moduloAtual);
            if (!moduloConcluido) {
                System.out.println("\nVocê não conseguiu completar o Módulo " + (i + 1) + ". Tente novamente para se tornar um Mestre em Java!");
                sair(); // Ou oferecer opção de reiniciar o módulo
                return;
            }

            jogador.completarModulo();
            System.out.println("\n-----------------------------------------------------");
            System.out.println("PROFESSOR DEITEL: Parabéns, " + jogador.getNome() + "! Você concluiu o Módulo " + (i + 1) + "!");
            System.out.println("Sua pontuação atual: " + jogador.getPontos());
            System.out.println("-----------------------------------------------------");

            // Enfrentar o Bug Mestre após cada módulo
            if (i < bosses.size()) { // Garante que há um boss para o módulo
                Boss bossAtual = bosses.get(i);
                System.out.println("\n-----------------------------------------------------");
                System.out.println("PROFESSOR DEITEL: Cuidado! Um " + bossAtual.getNome() + " surgiu!");
                System.out.println("Prepare-se para um desafio de " + bossAtual.getTipoErro() + "!");
                System.out.println("-----------------------------------------------------");
                boolean bossDerrotado = enfrentarBoss(bossAtual);
                if (!bossDerrotado) {
                    System.out.println("\nO " + bossAtual.getNome() + " te derrotou! Sua jornada termina aqui...");
                    sair();
                    return;
                }
                System.out.println("\nPROFESSOR DEITEL: Impressionante! Você derrotou o " + bossAtual.getNome() + "!");
                System.out.println("Sua pontuação atual: " + jogador.getPontos());
            } else {
                System.out.println("\n(Sem Bug Mestre específico para este módulo no momento.)");
            }

            System.out.println("\nPressione Enter para continuar para o próximo desafio...");
            scanner.nextLine();
        }

        // Desafio Final: Bug Grão-Mestre
        System.out.println("\n-----------------------------------------------------");
        System.out.println("PROFESSOR DEITEL: A batalha final se aproxima! O temido " + bossFinal.getNome() + "!");
        System.out.println("Ele ameaça destruir todo o código da Academia Deitel!");
        System.out.println("Se você o derrotar, o diploma de 'Mestre em Orientação a Objetos Java' será seu!");
        System.out.println("-----------------------------------------------------");
        boolean graoMestreDerrotado = enfrentarBoss(bossFinal);

        if (graoMestreDerrotado) {
            System.out.println("\n*****************************************************");
            System.out.println("* VOCÊ DERROTOU O BUG GRÃO-MESTRE!             *");
            System.out.println("* PARABÉNS, MESTRE EM ORIENTAÇÃO A OBJETOS JAVA!*");
            System.out.println("*****************************************************");
            System.out.println("Sua pontuação final: " + jogador.getPontos());
            System.out.println("A Academia Deitel se orgulha de você, " + jogador.getNome() + "!");
        } else {
            System.out.println("\nO Bug Grão-Mestre foi muito poderoso. Sua jornada termina aqui...");
        }

        sair();
    }

    private boolean jogarModulo(Modulo modulo) {
        modulo.selecionarPerguntas(5); // Seleciona 5 perguntas aleatórias
        int acertosModulo = 0;

        for (Pergunta pergunta : modulo.getPerguntasSelecionadas()) {
            boolean respostaCorreta = false;
            String respostaJogador;
            int tentativas = 0;

            do {
                pergunta.exibirPergunta();
                respostaJogador = scanner.nextLine();

                if (respostaJogador.equalsIgnoreCase("dica") && modulo.getDicasRestantes() > 0) {
                    professor.darDica(pergunta);
                    modulo.usarDica(); // Usa uma dica
                    System.out.println("Dicas restantes neste módulo: " + modulo.getDicasRestantes());
                    System.out.print("Tente responder novamente: ");
                    respostaJogador = scanner.nextLine(); // Lê a resposta após a dica
                } else if (respostaJogador.equalsIgnoreCase("dica") && modulo.getDicasRestantes() == 0) {
                    System.out.println("Professor Deitel: Você não tem mais dicas neste módulo!");
                    System.out.print("Tente responder: ");
                    respostaJogador = scanner.nextLine();
                }

                if (pergunta.verificarResposta(respostaJogador)) {
                    professor.darFeedback(true);
                    jogador.adicionarPontos(10); // Pontuação por acerto
                    acertosModulo++;
                    respostaCorreta = true;
                } else {
                    professor.darFeedback(false);
                    System.out.println("A resposta correta era: " + pergunta.getRespostaCorreta());
                    tentativas++;
                    if (tentativas < 2) { // Permite uma segunda tentativa
                        System.out.println("Você pode tentar mais uma vez ou digite 'dica' se houver dicas disponíveis.");
                    }
                }
            } while (!respostaCorreta && tentativas < 2); // Permite até 2 tentativas (original + 1 extra)

            System.out.println("Pressione Enter para continuar...");
            scanner.nextLine();
        }
        return acertosModulo >= 3; // O jogador precisa acertar pelo menos 3 perguntas para passar o módulo
    }

    private boolean enfrentarBoss(Boss boss) {
        boss.selecionarPerguntas(3); // Seleciona 3 perguntas aleatórias para o boss
        int acertosBoss = 0;

        System.out.println("\n*** DESAFIO DO " + boss.getNome().toUpperCase() + " ***");
        System.out.println("O " + boss.getNome() + " te desafia com 3 perguntas!");

        for (Pergunta pergunta : boss.getPerguntasSelecionadas()) {
            pergunta.exibirPergunta();
            String respostaJogador = scanner.nextLine();

            if (pergunta.verificarResposta(respostaJogador)) {
                professor.darFeedback(true);
                jogador.adicionarPontos(20); // Pontuação maior para boss
                acertosBoss++;
            } else {
                professor.darFeedback(false);
                System.out.println("A resposta correta era: " + pergunta.getRespostaCorreta());
                System.out.println("O " + boss.getNome() + " causa dano em você!"); // Simula dano
            }
            System.out.println("Pressione Enter para continuar...");
            scanner.nextLine();
        }
        return acertosBoss >= 2; // O jogador precisa acertar pelo menos 2 perguntas do boss
    }


    private int lerInteiro(String mensagem) {
        while (true) {
            System.out.print(mensagem);
            try {
                int valor = scanner.nextInt();
                scanner.nextLine(); // Consumir a nova linha
                return valor;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.nextLine(); // Limpar o buffer do scanner
            }
        }
    }

    private int lerInteiroSemErro() {
        int valor;
        while (true) {
            try {
                valor = scanner.nextInt();
                scanner.nextLine(); // Consumir o newline
                return valor;
            } catch (InputMismatchException e) {
                System.out.print("Entrada inválida. Por favor, digite um número inteiro: ");
                scanner.nextLine(); // Limpa o buffer
            }
        }
    }

    private void sair() {
        System.out.println("\nObrigado por jogar Heróis do Java! Até a próxima!");
        scanner.close();
        System.exit(0);
    }

    public static void main(String[] args) {
        Jogo jogo = new Jogo();
        jogo.iniciarJogo();
    }
}
