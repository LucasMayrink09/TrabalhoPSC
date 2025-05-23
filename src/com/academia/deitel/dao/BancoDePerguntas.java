package com.academia.deitel.dao;

import com.academia.deitel.model.Pergunta;
import com.academia.deitel.model.TipoPergunta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BancoDePerguntas {

    // Perguntas para Módulo 1 (Capítulos 1 e 3)
    public static List<Pergunta> getPerguntasModulo1() {
        List<Pergunta> perguntas = new ArrayList<>();

        // Pergunta 1: Quiz Teórico - Cap 1
        Map<Character, String> opcoes1 = new HashMap<>();
        opcoes1.put('a', "Um conjunto de instruções para o computador.");
        opcoes1.put('b', "Um tipo de hardware.");
        opcoes1.put('c', "Um compilador de código.");
        perguntas.add(new Pergunta("O que é um programa de computador?", opcoes1, "a",
                "Pense no que um computador faz ao seguir um software.", 14, TipoPergunta.QUIZ_TEORICO));

        // Pergunta 2: Quiz Teórico - Cap 1
        Map<Character, String> opcoes2 = new HashMap<>();
        opcoes2.put('a', "Apenas um sistema operacional.");
        opcoes2.put('b', "Uma linguagem de programação de alto nível.");
        opcoes2.put('c', "Um conjunto de ferramentas para gerenciar memória.");
        perguntas.add(new Pergunta("O que é Java?", opcoes2, "b",
                "Java é uma das linguagens mais populares para desenvolvimento de diversas aplicações.", 17, TipoPergunta.QUIZ_TEORICO));

        // Pergunta 3: Completar Código - Cap 3
        perguntas.add(new Pergunta("Complete a declaração de uma classe chamada 'Carro':\npublic class ____ { }", "Carro",
                "Classes são blocos fundamentais para organizar seu código em Java.", 36, TipoPergunta.COMPLETAR_CODIGO));

        // Pergunta 4: Quiz Teórico - Cap 3
        Map<Character, String> opcoes4 = new HashMap<>();
        opcoes4.put('a', "Variáveis e constantes.");
        opcoes4.put('b', "Objetos e classes.");
        opcoes4.put('c', "Métodos e funções.");
        perguntas.add(new Pergunta("Em POO, o que é um 'objeto'?", opcoes4, "b",
                "Um objeto é uma instância de uma classe, com estado e comportamento.", 38, TipoPergunta.QUIZ_TEORICO));

        // Pergunta 5: Completar Código - Cap 3
        perguntas.add(new Pergunta("Complete a criação de um objeto 'minhaConta' da classe 'Conta':\nConta minhaConta = new ____();", "Conta",
                "O operador 'new' é usado para instanciar objetos.", 40, TipoPergunta.COMPLETAR_CODIGO));

        // Pergunta 6: Quiz Teórico - Cap 3
        Map<Character, String> opcoes6 = new HashMap<>();
        opcoes6.put('a', "Apenas métodos estáticos.");
        opcoes6.put('b', "Atributos (variáveis de instância) e métodos.");
        opcoes6.put('c', "Apenas construtores.");
        perguntas.add(new Pergunta("Uma classe em Java geralmente contém:", opcoes6, "b",
                "Pense nos componentes que definem o estado e o comportamento de um objeto.", 42, TipoPergunta.QUIZ_TEORICO));

        // Pergunta 7: Correção de Código - Cap 3
        perguntas.add(new Pergunta("Corrija o erro na declaração do método 'calcularSoma':\npublic static void calcularSoma (int a, int b) { }", "void calcularSoma(int a, int b)",
                "O tipo de retorno e o nome do método devem estar corretos.", 45, TipoPergunta.CORRECAO_CODIGO));

        // Pergunta 8: Quiz Teórico - Cap 1
        Map<Character, String> opcoes8 = new HashMap<>();
        opcoes8.put('a', "Programa que traduz o código para bytecode.");
        opcoes8.put('b', "Ferramenta para executar o código Java.");
        opcoes8.put('c', "Editor de texto para escrever código.");
        perguntas.add(new Pergunta("O que é o compilador Java (javac)?", opcoes8, "a",
                "Ele transforma o código-fonte legível por humanos em algo que a JVM pode entender.", 18, TipoPergunta.QUIZ_TEORICO));

        // Pergunta 9: Desafio Lógica - Cap 3
        perguntas.add(new Pergunta("Descreva em uma frase o principal benefício de usar classes e objetos na programação.", "Organização e reusabilidade de código.",
                "Pense em como a POO ajuda a gerenciar projetos complexos.", 48, TipoPergunta.DESAFIO_LOGICA));

        // Pergunta 10: Completar Código - Cap 3
        perguntas.add(new Pergunta("Complete a declaração do atributo 'saldo' como privado do tipo double:\nprivate ____ saldo;", "double",
                "Pense no tipo de dado numérico para valores monetários.", 44, TipoPergunta.COMPLETAR_CODIGO));

        // Pergunta 11: Quiz Teórico - Cap 1
        Map<Character, String> opcoes11 = new HashMap<>();
        opcoes11.put('a', "Write Once, Compile Anywhere.");
        opcoes11.put('b', "Write Once, Run Everywhere.");
        opcoes11.put('c', "Write Once, Run Anywhere.");
        perguntas.add(new Pergunta("Qual é o lema do Java em relação à portabilidade?", opcoes11, "b",
                "O 'R' se refere à execução.", 19, TipoPergunta.QUIZ_TEORICO));

        // Pergunta 12: Quiz Teórico - Cap 3
        Map<Character, String> opcoes12 = new HashMap<>();
        opcoes12.put('a', "Um método especial que cria novos objetos.");
        opcoes12.put('b', "Um método que destrói objetos.");
        opcoes12.put('c', "Um método para calcular valores.");
        perguntas.add(new Pergunta("O que é um construtor em Java?", opcoes12, "a",
                "Ele é chamado automaticamente quando um objeto é instanciado.", 46, TipoPergunta.QUIZ_TEORICO));

        // Pergunta 13: Correção de Código - Cap 3
        perguntas.add(new Pergunta("Corrija a declaração do método 'obterNome()' para que ele retorne uma String:\npublic void obterNome() { return \"João\"; }", "public String obterNome()",
                "Métodos que retornam valores devem ter o tipo de retorno especificado.", 45, TipoPergunta.CORRECAO_CODIGO));

        // Pergunta 14: Quiz Teórico - Cap 1
        Map<Character, String> opcoes14 = new HashMap<>();
        opcoes14.put('a', "Somente em navegadores web.");
        opcoes14.put('b', "Em servidores web e aplicativos móveis.");
        opcoes14.put('c', "Em uma vasta gama de dispositivos e plataformas.");
        perguntas.add(new Pergunta("Onde o Java é usado?", opcoes14, "c",
                "Pense na ubiquidade da linguagem Java.", 20, TipoPergunta.QUIZ_TEORICO));

        // Pergunta 15: Completar Código - Cap 3
        perguntas.add(new Pergunta("Complete o código para imprimir o valor da variável 'idade':\nSystem.out.____(idade);", "println",
                "A classe System.out é usada para saída de dados no console.", 50, TipoPergunta.COMPLETAR_CODIGO));

        return perguntas;
    }

    // Perguntas para Módulo 2 (Capítulo 4)
    public static List<Pergunta> getPerguntasModulo2() {
        List<Pergunta> perguntas = new ArrayList<>();

        // Pergunta 1: Quiz Teórico - Cap 4
        Map<Character, String> opcoes1 = new HashMap<>();
        opcoes1.put('a', "Acesso direto a atributos.");
        opcoes1.put('b', "Restrição ao acesso a atributos e métodos, controlando-o por meio de métodos.");
        opcoes1.put('c', "Herança de classes.");
        perguntas.add(new Pergunta("O que significa encapsulamento em POO?", opcoes1, "b",
                "Proteção de dados e interface pública.", 60, TipoPergunta.QUIZ_TEORICO));

        // Pergunta 2: Completar Código - Cap 4
        perguntas.add(new Pergunta("Complete a palavra-chave para tornar um atributo privado:\n____ String nome;", "private",
                "Somente a classe pode acessar diretamente membros privados.", 62, TipoPergunta.COMPLETAR_CODIGO));

        // Pergunta 3: Quiz Teórico - Cap 4
        Map<Character, String> opcoes3 = new HashMap<>();
        opcoes3.put('a', "Métodos que alteram o valor de um atributo.");
        opcoes3.put('b', "Métodos que retornam o valor de um atributo.");
        opcoes3.put('c', "Métodos que são chamados automaticamente.");
        perguntas.add(new Pergunta("O que são métodos 'setters'?", opcoes3, "a",
                "São usados para *definir* valores.", 64, TipoPergunta.QUIZ_TEORICO));

        // Pergunta 4: Quiz Teórico - Cap 4
        Map<Character, String> opcoes4 = new HashMap<>();
        opcoes4.put('a', "Métodos que alteram o valor de um atributo.");
        opcoes4.put('b', "Métodos que retornam o valor de um atributo.");
        opcoes4.put('c', "Métodos que são chamados automaticamente.");
        perguntas.add(new Pergunta("O que são métodos 'getters'?", opcoes4, "b",
                "São usados para *obter* valores.", 64, TipoPergunta.QUIZ_TEORICO));

        // Pergunta 5: Correção de Código - Cap 4
        perguntas.add(new Pergunta("Corrija o erro no método 'setSaldo' para que ele receba um parâmetro 'valor':\npublic void setSaldo() { saldo = valor; }", "public void setSaldo(double valor)",
                "Métodos setters precisam de parâmetros para receber o novo valor.", 65, TipoPergunta.CORRECAO_CODIGO));

        // Pergunta 6: Completar Código - Cap 4
        perguntas.add(new Pergunta("Complete o código para acessar o atributo 'nome' de um objeto 'pessoa' usando um método getter:\nSystem.out.println(pessoa.____());", "getNome",
                "Pense no padrão de nome para métodos que retornam valores de atributos.", 66, TipoPergunta.COMPLETAR_CODIGO));

        // Pergunta 7: Desafio Lógica - Cap 4
        perguntas.add(new Pergunta("Explique a importância do encapsulamento para a segurança e organização do código.", "Protege os dados internos da classe de acesso e modificação indevidos, além de facilitar a manutenção.",
                "Pense em como esconder a implementação interna pode ser benéfico.", 68, TipoPergunta.DESAFIO_LOGICA));

        // Pergunta 8: Quiz Teórico - Cap 4
        Map<Character, String> opcoes8 = new HashMap<>();
        opcoes8.put('a', "Apenas métodos privados.");
        opcoes8.put('b', "Apenas atributos privados.");
        opcoes8.put('c', "Tanto atributos quanto métodos podem ser privados.");
        perguntas.add(new Pergunta("Em Java, o modificador de acesso 'private' pode ser aplicado a:", opcoes8, "c",
                "Pense na flexibilidade do 'private' para membros da classe.", 62, TipoPergunta.QUIZ_TEORICO));

        // Pergunta 9: Completar Código - Cap 4
        perguntas.add(new Pergunta("Complete o método construtor para inicializar o atributo 'nome':\npublic Aluno(String nome) { ____.nome = nome; }", "this",
                "A palavra-chave 'this' se refere à instância atual do objeto.", 70, TipoPergunta.COMPLETAR_CODIGO));

        // Pergunta 10: Quiz Teórico - Cap 4
        Map<Character, String> opcoes10 = new HashMap<>();
        opcoes10.put('a', "Apenas a classe que o declarou.");
        opcoes10.put('b', "Todas as classes no mesmo pacote.");
        opcoes10.put('c', "Todas as classes do projeto.");
        perguntas.add(new Pergunta("Um membro 'private' é acessível apenas por:", opcoes10, "a",
                "O 'private' é o nível de acesso mais restritivo.", 63, TipoPergunta.QUIZ_TEORICO));

        // Pergunta 11: Correção de Código - Cap 4
        perguntas.add(new Pergunta("Corrija a tentativa de acessar um atributo privado 'saldo' diretamente de fora da classe:\nConta minhaConta = new Conta(); \nSystem.out.println(minhaConta.saldo);", "minhaConta.getSaldo()",
                "Lembre-se que atributos privados precisam de getters para serem lidos.", 66, TipoPergunta.CORRECAO_CODIGO));

        // Pergunta 12: Quiz Teórico - Cap 4
        Map<Character, String> opcoes12 = new HashMap<>();
        opcoes12.put('a', "Sempre devem ser públicos.");
        opcoes12.put('b', "Geralmente são públicos para permitir o acesso controlado aos atributos.");
        opcoes12.put('c', "Devem ser privados para manter o encapsulamento.");
        perguntas.add(new Pergunta("Métodos 'getters' e 'setters':", opcoes12, "b",
                "Eles formam a interface pública da classe.", 64, TipoPergunta.QUIZ_TEORICO));

        // Pergunta 13: Completar Código - Cap 4
        perguntas.add(new Pergunta("Complete o trecho de código para validar que a idade não é negativa no método 'setIdade':\npublic void setIdade(int idade) {\n  if (idade >= 0) {\n    this.idade = idade;\n  } else {\n    System.out.println(\"____ idade inválida!\");\n  }\n}", "Erro:",
                "Pense em uma mensagem de erro apropriada para um valor inválido.", 67, TipoPergunta.COMPLETAR_CODIGO));

        // Pergunta 14: Quiz Teórico - Cap 4
        Map<Character, String> opcoes14 = new HashMap<>();
        opcoes14.put('a', "Ocultamento de informações.");
        opcoes14.put('b', "Modificação direta de atributos.");
        opcoes14.put('c', "Disponibilização de todos os detalhes internos.");
        perguntas.add(new Pergunta("O encapsulamento promove o:", opcoes14, "a",
                "Pense na ideia de 'caixa preta'.", 68, TipoPergunta.QUIZ_TEORICO));

        // Pergunta 15: Desafio Lógica - Cap 4
        perguntas.add(new Pergunta("Se uma classe 'Produto' tem um atributo 'preco' que não pode ser negativo, como você garantiria isso usando encapsulamento?", "Criando um método `setPreco` que verifica se o valor é positivo antes de atribuir ao atributo.",
                "A validação deve ocorrer no ponto de entrada dos dados.", 67, TipoPergunta.DESAFIO_LOGICA));

        return perguntas;
    }

    // Perguntas para Módulo 3 (Capítulo 5 e parte do 6)
    public static List<Pergunta> getPerguntasModulo3() {
        List<Pergunta> perguntas = new ArrayList<>();

        // Pergunta 1: Quiz Teórico - Cap 5
        Map<Character, String> opcoes1 = new HashMap<>();
        opcoes1.put('a', "Uma estrutura de repetição que executa um bloco de código um número fixo de vezes.");
        opcoes1.put('b', "Uma estrutura de decisão.");
        opcoes1.put('c', "Um tipo de dado.");
        perguntas.add(new Pergunta("O que é um laço `for` em Java?", opcoes1, "a",
                "É ideal para iterações com um número conhecido de repetições.", 90, TipoPergunta.QUIZ_TEORICO));

        // Pergunta 2: Completar Código - Cap 5
        perguntas.add(new Pergunta("Complete o laço `while` que imprime números de 1 a 5:\nint i = 1;\nwhile (i ____ 5) {\n  System.out.println(i);\n  i++;\n}", "<=",
                "A condição deve ser verdadeira enquanto `i` for menor ou igual a 5.", 92, TipoPergunta.COMPLETAR_CODIGO));

        // Pergunta 3: Quiz Teórico - Cap 5
        Map<Character, String> opcoes3 = new HashMap<>();
        opcoes3.put('a', "Verifica a condição antes de executar o bloco.");
        opcoes3.put('b', "Executa o bloco pelo menos uma vez antes de verificar a condição.");
        opcoes3.put('c', "É usado apenas para iteração sobre coleções.");
        perguntas.add(new Pergunta("Qual a principal diferença entre `while` e `do-while`?", opcoes3, "b",
                "Pense na garantia de execução mínima.", 94, TipoPergunta.QUIZ_TEORICO));

        // Pergunta 4: Correção de Código - Cap 5
        perguntas.add(new Pergunta("Corrija o erro no laço `for` para que ele itere de 0 a 9:\nfor (int i = 0; i <= 10; i++) { }", "i < 10",
                "Para iterar até 9, a condição deve ser `i < 10` ou `i <= 9`.", 91, TipoPergunta.CORRECAO_CODIGO));

        // Pergunta 5: Desafio Lógica - Cap 5
        perguntas.add(new Pergunta("Você precisa somar todos os números pares de 1 a 100. Qual laço de repetição seria o mais adequado e por quê?", "O laço `for`, pois a quantidade de iterações (números de 1 a 100) é conhecida.",
                "O `for` é geralmente preferível quando o número de iterações é pré-determinado.", 90, TipoPergunta.DESAFIO_LOGICA));

        // Pergunta 6: Quiz Teórico - Cap 6
        Map<Character, String> opcoes6 = new HashMap<>();
        opcoes6.put('a', "Um tipo de dado que armazena apenas um valor.");
        opcoes6.put('b', "Uma coleção de elementos do mesmo tipo, acessíveis por um índice.");
        opcoes6.put('c', "Um conjunto de métodos.");
        perguntas.add(new Pergunta("O que é um array em Java?", opcoes6, "b",
                "Pense em uma lista ordenada de itens.", 120, TipoPergunta.QUIZ_TEORICO));

        // Pergunta 7: Completar Código - Cap 6
        perguntas.add(new Pergunta("Complete a declaração de um array de inteiros de tamanho 5:\nint[] numeros = new ____[5];", "int",
                "O tipo de dado do array deve ser especificado.", 122, TipoPergunta.COMPLETAR_CODIGO));

        // Pergunta 8: Quiz Teórico - Cap 6
        Map<Character, String> opcoes8 = new HashMap<>();
        opcoes8.put('a', "Começa em 1.");
        opcoes8.put('b', "Começa em 0.");
        opcoes8.put('c', "Começa em um número aleatório.");
        perguntas.add(new Pergunta("Em Java, qual é o índice do primeiro elemento de um array?", opcoes8, "b",
                "A indexação em programação geralmente começa do zero.", 123, TipoPergunta.QUIZ_TEORICO));

        // Pergunta 9: Correção de Código - Cap 6
        perguntas.add(new Pergunta("Corrija o acesso ao último elemento de um array 'nomes' de tamanho 10:\nString ultimoNome = nomes[10];", "nomes[9]",
                "O último índice de um array de tamanho N é N-1.", 124, TipoPergunta.CORRECAO_CODIGO));

        // Pergunta 10: Desafio Lógica - Cap 6
        perguntas.add(new Pergunta("Como você percorreria um array de Strings chamado `frutas` e imprimiria cada fruta?", "Usando um laço `for` ou `for-each` para iterar sobre os elementos do array.",
                "Considere as opções de iteração sobre coleções.", 125, TipoPergunta.DESAFIO_LOGICA));

        // Pergunta 11: Quiz Teórico - Cap 5
        Map<Character, String> opcoes11 = new HashMap<>();
        opcoes11.put('a', "Interrompe a execução do laço atual e continua a partir da próxima iteração.");
        opcoes11.put('b', "Sai completamente do laço.");
        opcoes11.put('c', "Reinicia o laço desde o início.");
        perguntas.add(new Pergunta("Qual a função da instrução `continue` em um laço?", opcoes11, "a",
                "Ela 'pula' a iteração atual.", 96, TipoPergunta.QUIZ_TEORICO));

        // Pergunta 12: Completar Código - Cap 5
        perguntas.add(new Pergunta("Complete a instrução para sair de um laço `for` se a variável 'condicao' for verdadeira:\nif (condicao) { ____; }", "break",
                "Essa instrução é usada para terminar laços abruptamente.", 97, TipoPergunta.COMPLETAR_CODIGO));

        // Pergunta 13: Quiz Teórico - Cap 6
        Map<Character, String> opcoes13 = new HashMap<>();
        opcoes13.put('a', "Arrays podem armazenar elementos de tipos diferentes.");
        opcoes13.put('b', "O tamanho de um array é fixo após a criação.");
        opcoes13.put('c', "Arrays são classes.");
        perguntas.add(new Pergunta("Qual das seguintes afirmações sobre arrays em Java é verdadeira?", opcoes13, "b",
                "Pense na natureza estática dos arrays.", 121, TipoPergunta.QUIZ_TEORICO));

        // Pergunta 14: Completar Código - Cap 6
        perguntas.add(new Pergunta("Complete a atribuição de valor à primeira posição de um array de inteiros chamado `numeros`:\nnumeros[____] = 10;", "0",
                "Lembre-se da indexação de arrays.", 123, TipoPergunta.COMPLETAR_CODIGO));

        // Pergunta 15: Desafio Lógica - Cap 5
        perguntas.add(new Pergunta("Quando seria mais apropriado usar um laço `do-while` em vez de um `while`?", "Quando o bloco de código precisa ser executado pelo menos uma vez, independentemente da condição.",
                "Pense em cenários onde a primeira execução é garantida.", 94, TipoPergunta.DESAFIO_LOGICA));

        return perguntas;
    }

    // Perguntas para Módulo 4 (Capítulo 7)
    public static List<Pergunta> getPerguntasModulo4() {
        List<Pergunta> perguntas = new ArrayList<>();

        // Pergunta 1: Quiz Teórico - Cap 7
        Map<Character, String> opcoes1 = new HashMap<>();
        opcoes1.put('a', "Um tipo de dado que armazena números inteiros.");
        opcoes1.put('b', "Um tipo de dado que armazena uma sequência de caracteres.");
        opcoes1.put('c', "Um tipo de dado para valores booleanos.");
        perguntas.add(new Pergunta("O que é o tipo `String` em Java?", opcoes1, "b",
                "Strings são sequências de letras, números e símbolos.", 150, TipoPergunta.QUIZ_TEORICO));

        // Pergunta 2: Completar Código - Cap 7
        perguntas.add(new Pergunta("Complete a criação de uma String chamada 'mensagem' com o valor \"Olá\":\nString mensagem = \"____\";", "Olá",
                "Strings são delimitadas por aspas duplas.", 151, TipoPergunta.COMPLETAR_CODIGO));

        // Pergunta 3: Quiz Teórico - Cap 7
        Map<Character, String> opcoes3 = new HashMap<>();
        opcoes3.put('a', "Compara o conteúdo das Strings.");
        opcoes3.put('b', "Compara as referências de memória das Strings.");
        opcoes3.put('c', "Compara o tamanho das Strings.");
        perguntas.add(new Pergunta("Qual o propósito do método `equals()` ao comparar Strings em Java?", opcoes3, "a",
                "O operador `==` compara referências, `equals()` compara conteúdo.", 152, TipoPergunta.QUIZ_TEORICO));

        // Pergunta 4: Correção de Código - Cap 7
        perguntas.add(new Pergunta("Corrija a comparação incorreta de Strings:\nString s1 = \"Java\";\nString s2 = \"java\";\nif (s1 == s2) { }", "if (s1.equalsIgnoreCase(s2))",
                "Para ignorar maiúsculas/minúsculas, use `equalsIgnoreCase`.", 153, TipoPergunta.CORRECAO_CODIGO));

        // Pergunta 5: Desafio Lógica - Cap 7
        perguntas.add(new Pergunta("Como você verificaria se uma String `frase` contém a palavra \"Deitel\"?", "Usando o método `frase.contains(\"Deitel\")`.",
                "Pense nos métodos da classe String para manipulação de texto.", 154, TipoPergunta.DESAFIO_LOGICA));

        // Pergunta 6: Quiz Teórico - Cap 7
        Map<Character, String> opcoes6 = new HashMap<>();
        opcoes6.put('a', "Retorna o tamanho da String.");
        opcoes6.put('b', "Converte a String para maiúsculas.");
        opcoes6.put('c', "Inverte a String.");
        perguntas.add(new Pergunta("Qual a função do método `length()` para Strings?", opcoes6, "a",
                "Ele indica o número de caracteres.", 155, TipoPergunta.QUIZ_TEORICO));

        // Pergunta 7: Completar Código - Cap 7
        perguntas.add(new Pergunta("Complete o código para converter a String 'texto' para letras maiúsculas:\nString maiusculas = texto.____();", "toUpperCase",
                "Este método é útil para padronizar textos.", 156, TipoPergunta.COMPLETAR_CODIGO));

        // Pergunta 8: Quiz Teórico - Cap 7
        Map<Character, String> opcoes8 = new HashMap<>();
        opcoes8.put('a', "A String é imutável.");
        opcoes8.put('b', "A String pode ser modificada após a criação.");
        opcoes8.put('c', "A String é um tipo primitivo.");
        perguntas.add(new Pergunta("Uma característica importante das Strings em Java é que:", opcoes8, "a",
                "Quando você 'modifica' uma String, na verdade está criando uma nova.", 157, TipoPergunta.QUIZ_TEORICO));

        // Pergunta 9: Correção de Código - Cap 7
        perguntas.add(new Pergunta("Corrija o erro ao tentar extrair uma substring:\nString frase = \"Programação\";\nString sub = frase.substring(10, 5);", "frase.substring(5, 10)",
                "O primeiro argumento deve ser o índice inicial (inclusivo) e o segundo o índice final (exclusivo).", 158, TipoPergunta.CORRECAO_CODIGO));

        // Pergunta 10: Desafio Lógica - Cap 7
        perguntas.add(new Pergunta("Como você removeria todos os espaços em branco de uma String `entrada`?", "Usando o método `entrada.replace(\" \", \"\")` ou `entrada.replaceAll(\"\\\\s\", \"\")`.",
                "Pense em como substituir caracteres.", 159, TipoPergunta.DESAFIO_LOGICA));

        // Pergunta 11: Quiz Teórico - Cap 7
        Map<Character, String> opcoes11 = new HashMap<>();
        opcoes11.put('a', "StringBuilder e StringBuffer.");
        opcoes11.put('b', "StringList e StringMap.");
        opcoes11.put('c', "CharSequence e CharArray.");
        perguntas.add(new Pergunta("Quais classes são usadas para Strings mutáveis em Java?", opcoes11, "a",
                "Essas classes são mais eficientes para muitas modificações.", 160, TipoPergunta.QUIZ_TEORICO));

        // Pergunta 12: Completar Código - Cap 7
        perguntas.add(new Pergunta("Complete o código para concatenar duas Strings `s1` e `s2` usando o método `concat`:\nString resultado = s1.____(s2);", "concat",
                "É um método simples para juntar Strings.", 151, TipoPergunta.COMPLETAR_CODIGO));

        // Pergunta 13: Quiz Teórico - Cap 7
        Map<Character, String> opcoes13 = new HashMap<>();
        opcoes13.put('a', "Verifica se a String começa com um prefixo específico.");
        opcoes13.put('b', "Verifica se a String termina com um sufixo específico.");
        opcoes13.put('c', "Verifica se a String contém um caractere específico.");
        perguntas.add(new Pergunta("Qual a funcionalidade do método `startsWith()` em Strings?", opcoes13, "a",
                "Útil para validação de formatos.", 154, TipoPergunta.QUIZ_TEORICO));

        // Pergunta 14: Completar Código - Cap 7
        perguntas.add(new Pergunta("Complete o código para encontrar o índice da primeira ocorrência da letra 'a' na String 'palavra':\nint indice = palavra.____('a');", "indexOf",
                "Este método retorna a posição de um caractere ou substring.", 155, TipoPergunta.COMPLETAR_CODIGO));

        // Pergunta 15: Desafio Lógica - Cap 7
        perguntas.add(new Pergunta("Imagine que você tem uma lista de nomes e precisa padronizá-los para que todos comecem com letra maiúscula. Qual método da classe String você usaria após pegar o primeiro caractere e o restante da string?", "Primeiro, `substring(0, 1).toUpperCase()` para o primeiro caractere e `substring(1).toLowerCase()` para o restante, e depois concatenar.",
                "Combine métodos para transformar a String.", 156, TipoPergunta.DESAFIO_LOGICA));

        return perguntas;
    }

    // Perguntas para Bosses
    public static List<Pergunta> getPerguntasBossSintaxe() {
        List<Pergunta> perguntas = new ArrayList<>();
        // Exemplos de perguntas de correção de código para Boss de Sintaxe
        perguntas.add(new Pergunta("Corrija o erro de ponto e vírgula:\npublic static void main(String[] args) {\n  System.out.println(\"Olá Mundo\")\n}", "System.out.println(\"Olá Mundo\");",
                "Toda instrução em Java deve terminar com ponto e vírgula.", 40, TipoPergunta.CORRECAO_CODIGO));
        perguntas.add(new Pergunta("Corrija o erro de abertura/fechamento de chaves:\npublic class Exemplo {\n  public static void main(String[] args) \n    System.out.println(\"Erro\");\n}", "public static void main(String[] args) {\n    System.out.println(\"Erro\");\n}",
                "Blocos de código são delimitados por chaves.", 42, TipoPergunta.CORRECAO_CODIGO));
        perguntas.add(new Pergunta("Corrija a declaração de variável com tipo incorreto:\nint numero = \"dez\";", "String numero = \"dez\";",
                "O tipo da variável deve corresponder ao tipo do valor atribuído.", 35, TipoPergunta.CORRECAO_CODIGO));
        perguntas.add(new Pergunta("Corrija o nome de método incorreto:\npublic void meuMetodo() { }\n// Chamada:\nminhaClasse.MeuMetodo();", "minhaClasse.meuMetodo();",
                "Java é case-sensitive. Nomes de métodos devem ser idênticos, incluindo maiúsculas/minúsculas.", 45, TipoPergunta.CORRECAO_CODIGO));
        perguntas.add(new Pergunta("Corrija a falta de parênteses na chamada de método:\nSystem.out.println \"Hello\";", "System.out.println(\"Hello\");",
                "Métodos são chamados com parênteses, mesmo que não tenham argumentos.", 50, TipoPergunta.CORRECAO_CODIGO));
        perguntas.add(new Pergunta("Corrija a palavra-chave `class`:\npublic Clase MinhaClasse { }", "public class MinhaClasse { }",
                "A palavra-chave 'class' é escrita com 'c' minúsculo.", 36, TipoPergunta.CORRECAO_CODIGO));
        return perguntas;
    }

    public static List<Pergunta> getPerguntasBossLogica() {
        List<Pergunta> perguntas = new ArrayList<>();
        // Exemplos de perguntas de Desafio de Lógica para Boss de Lógica
        perguntas.add(new Pergunta("Um programa deve calcular a média de 3 números. Se você somar os números e depois dividir por 3, mas esqueceu os parênteses, qual tipo de erro ocorreria?", "Erro de lógica. A ordem das operações seria incorreta, resultando em um cálculo errado.",
                "Pense na precedência de operadores.", 55, TipoPergunta.DESAFIO_LOGICA));
        perguntas.add(new Pergunta("Você tem um laço `for` que deveria imprimir números de 1 a 5, mas está imprimindo de 1 a 4. Qual o provável erro lógico na condição do laço?", "A condição do laço está usando '<' em vez de '<='.",
                "Verifique os limites da condição de parada do laço.", 91, TipoPergunta.DESAFIO_LOGICA));
        perguntas.add(new Pergunta("Você quer que um `setter` de idade só aceite valores maiores que 0. Se ele aceitar 0 ou valores negativos, qual o tipo de erro e onde ele deveria ser corrigido?", "Erro de lógica. O erro está na validação dentro do método `setIdade`.",
                "Validações de regras de negócio são erros de lógica.", 67, TipoPergunta.DESAFIO_LOGICA));
        perguntas.add(new Pergunta("Se um programa que calcula juros compostos está dando resultados muito altos, mesmo com entradas corretas, qual pode ser a causa do erro?", "Erro de lógica. Pode ser uma fórmula de cálculo de juros incorreta ou variáveis com valores inadequados.",
                "Reveja a matemática ou a sequência de operações.", 55, TipoPergunta.DESAFIO_LOGICA));
        perguntas.add(new Pergunta("Você tem um array de 5 elementos e tenta acessar o índice 5. Qual tipo de erro ocorrerá em tempo de execução?", "Erro de lógica (ou 'ArrayIndexOutOfBoundsException'). O índice 5 está fora dos limites válidos (0 a 4).",
                "Arrays são baseados em zero e têm tamanho fixo.", 124, TipoPergunta.DESAFIO_LOGICA));
        perguntas.add(new Pergunta("Se você tem um código que compara duas Strings e o resultado é sempre `false`, mesmo quando o conteúdo é idêntico, qual é o erro lógico provável?", "Uso do operador `==` para comparar Strings em vez do método `equals()`.",
                "Lembre-se que `==` compara referências, não conteúdo, para objetos.", 152, TipoPergunta.DESAFIO_LOGICA));
        return perguntas;
    }

    public static List<Pergunta> getPerguntasBossObjetos() {
        List<Pergunta> perguntas = new ArrayList<>();
        // Exemplos de perguntas sobre criação/interação de objetos
        perguntas.add(new Pergunta("Qual o erro ao tentar acessar um método de um objeto que não foi instanciado?\nMinhaClasse obj;\nobj.fazerAlgo();", "O objeto 'obj' não foi inicializado (é null), resultando em `NullPointerException`.",
                "Objetos devem ser instanciados com 'new' antes de serem usados.", 40, TipoPergunta.DESAFIO_LOGICA)); // Adaptação de erro para lógica
        perguntas.add(new Pergunta("Você tenta acessar um atributo privado de uma classe diretamente de outra classe. Qual o erro e como corrigir?", "Erro de encapsulamento. O atributo é privado e não pode ser acessado diretamente; use um método getter.",
                "Encapsulamento protege os dados.", 66, TipoPergunta.CORRECAO_CODIGO)); // Adaptação de erro para correção
        perguntas.add(new Pergunta("Você esqueceu de definir um construtor em sua classe, mas tenta instanciar um objeto passando argumentos para ele. O que acontece?", "Erro de compilação. Não há um construtor que aceite esses argumentos.",
                "O compilador fornece um construtor padrão sem argumentos se nenhum for definido.", 46, TipoPergunta.DESAFIO_LOGICA)); // Adaptação de erro para lógica
        perguntas.add(new Pergunta("Se um método `set` está definido como `private`, qual o impacto para a manipulação dos atributos de fora da classe?", "O atributo não poderá ser alterado de fora da classe usando esse setter, pois o método `set` não será acessível.",
                "O modificador `private` restringe o acesso.", 62, TipoPergunta.DESAFIO_LOGICA));
        perguntas.add(new Pergunta("Explique o problema de ter muitos métodos públicos que expõem detalhes internos de uma classe que deveriam ser encapsulados.", "Viola o encapsulamento, tornando a classe mais difícil de manter e sujeita a erros externos, pois os detalhes internos podem ser modificados diretamente.",
                "O encapsulamento busca esconder a implementação interna.", 68, TipoPergunta.DESAFIO_LOGICA));
        perguntas.add(new Pergunta("Qual o erro ao tentar criar uma instância de uma classe abstrata diretamente?\nClasseAbstrata obj = new ClasseAbstrata();", "Classes abstratas não podem ser instanciadas diretamente; elas devem ser estendidas por uma subclasse concreta.",
                "Classes abstratas servem como modelos para outras classes.", 80, TipoPergunta.DESAFIO_LOGICA)); // Cap 8, mas pode ser simplificado para "Não instanciar"
        return perguntas;
    }

    public static List<Pergunta> getPerguntasBossOO() {
        List<Pergunta> perguntas = new ArrayList<>();
        // Exemplos de perguntas gerais de POO
        perguntas.add(new Pergunta("Qual dos pilares da POO está relacionado à capacidade de um objeto assumir muitas formas?", "Polimorfismo",
                "Pense na palavra-chave 'muitas formas'.", 75, TipoPergunta.QUIZ_TEORICO)); // Cap 8, mas pode ser simplificado
        perguntas.add(new Pergunta("Qual o pilar da POO que se refere à criação de novas classes a partir de classes existentes, reutilizando código?", "Herança",
                "Pense na relação 'é um'.", 72, TipoPergunta.QUIZ_TEORICO)); // Cap 8, mas pode ser simplificado
        perguntas.add(new Pergunta("Explique brevemente a diferença entre uma classe e um objeto.", "Uma classe é um modelo ou projeto, enquanto um objeto é uma instância concreta desse modelo.",
                "Pense na classe como a 'planta' e o objeto como a 'casa'.", 38, TipoPergunta.DESAFIO_LOGICA));
        perguntas.add(new Pergunta("Qual o principal objetivo do encapsulamento em POO?", "Proteger os dados internos de uma classe e controlar o acesso a eles.",
                "Pense na 'caixa preta'.", 60, TipoPergunta.QUIZ_TEORICO));
        perguntas.add(new Pergunta("Em POO, o que são atributos e métodos de uma classe?", "Atributos representam as características (estado) e métodos representam as ações (comportamento) de um objeto.",
                "Pense no que um objeto 'é' e o que um objeto 'faz'.", 42, TipoPergunta.DESAFIO_LOGICA));
        perguntas.add(new Pergunta("Por que a POO é considerada uma abordagem eficiente para o desenvolvimento de software?", "Facilita a organização, reusabilidade, manutenção e escalabilidade do código.",
                "Pense nos benefícios de um design modular.", 48, TipoPergunta.DESAFIO_LOGICA));
        return perguntas;
    }
}
