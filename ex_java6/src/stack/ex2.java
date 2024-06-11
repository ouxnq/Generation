package stack;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class ex2 {

	public static void main(String[] args) {
		int i = 5;
		Scanner sc = new Scanner(System.in);
		Stack<String> pilha = new Stack<String>();

		while (i != 0) {
			System.out.println(
					"********************************\n\n1- Adicionar Livro na pilha\n2- Listar todos os Livros\n3- Retirar Livro da pilha\n0- Sair\n\n********************************");
			i = sc.nextInt();
			if (i == 1) {
				System.out.println("Digite o nome do Livro: ");
				sc.skip("\\R?");
				pilha.push(sc.nextLine());
				System.out.println("\nLivro Adicionado!");
			} else if (i == 2) {
				if (pilha.isEmpty()) {
					System.out.println("A pilha está vazia!");
				} else {
					Iterator<String> iPilha = pilha.iterator();
					System.out.println("Pilha:");
					while (iPilha.hasNext()) {
						System.out.println(iPilha.next());
					}
				}
			} else if (i == 3) {
				pilha.pop();
				System.out.println("Um Livro foi retirado da pilha!");
			} else if (i == 0) {
				break;
			} else {
				System.out.println("Digite um número válido!");
			}

		}
		sc.close();
		System.out.println("Programa finalizado!");
	}
}
