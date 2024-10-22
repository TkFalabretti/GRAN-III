package Arvores;

import java.util.Scanner;

// Classe para gerenciar a inserção de valores na árvore pelo usuário.
class InsercaoUsuario {
    public static void inserirNumeros(Arvore ar, Scanner scanner) {
        while (true) {
            // Solicita ao usuário um número para inserir na árvore ou digitar "sair" para encerrar.
            System.out.println("Digite um número para inserir na árvore (ou 'sair' para finalizar):");
            String input = scanner.next();

            if (input.equalsIgnoreCase("sair")) {
                break;  // Interrompe o loop caso o usuário digite "sair".
            }

            try {
                int valor = Integer.parseInt(input);  // Tenta converter o input para um número inteiro.
                ar.inserir(valor, ar.raiz);  // Insere o valor na árvore.
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida, por favor insira um número ou 'sair' para finalizar.");
            }
        }
    }
}
