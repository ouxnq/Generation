package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		int i = 5;
		Scanner sc = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();

		while (i != 0) {
			System.out.println(
					"********************************\n\n1- Adicionar Cliente na fila\n2- Listar todos os clientes\n3- Retirar Cliente da fila\n0- Sair\n\n********************************");
			i = sc.nextInt();
			if (i == 1) {
				System.out.println("Digite o nome do Cliente: ");
				sc.skip("\\R?");
				fila.add(sc.nextLine());
				System.out.println("\nCliente Adicionado!");
			} else if (i == 2) {
				if (fila.isEmpty()) {
					System.out.println("A fila está vazia!");
				} else {
					System.out.println("Fila: " + fila);
				}
			} else if (i == 3) {
				fila.poll();
				System.out.println("O Cliente foi chamado!");
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
