package Arvores;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o valor da raiz da árvore.
        System.out.println("Digite o número da raiz da árvore:");
        int raizValor = scanner.nextInt();
        Arvore ar = new Arvore(raizValor); // Cria a árvore com o valor da raiz.

        // Insere valores na árvore conforme input do usuário.
        InsercaoUsuario.inserirNumeros(ar, scanner);

        // Exibe os diferentes percursos da árvore binária.
        System.out.println("---------------------------");
        System.out.println("| IMPRESSÃO DOS PERCURSOS |");
        System.out.println("---------------------------");

        System.out.println();
        System.out.println("Percurso em Pré-Ordem");
        ar.preOrdem(ar.raiz); // Percurso pré-ordem (raiz, esquerda, direita).

        System.out.println();
        System.out.println("Percurso em Pós-Ordem");
        ar.posOrdem(ar.raiz); // Percurso pós-ordem (esquerda, direita, raiz).

        System.out.println();
        System.out.println("Percurso em Ordem Simétrica");
        ar.emOrdem(ar.raiz); // Percurso em ordem (esquerda, raiz, direita).
    }
}


