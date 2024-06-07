package matrizes;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		int matriz[][] = new int[3][3], somaDiagPrin = 0, somaDiagSec = 0;
		Scanner leia = new Scanner(System.in);

		System.out.println("Construa uma matriz. Digite 9 números:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("Digite o número na posição [%d][%d]\n", i, j);
				matriz[i][j] = leia.nextInt();
			}
		}
		System.out.println("\nOs elementos na diagonal principal são:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == j) {
					System.out.println(matriz[i][j]);
					somaDiagPrin += matriz[i][j];
				}
			}
		}
		System.out.println("\nOs elementos na diagonal secundária são:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if ((i == 0 && j == 2) || (i == 1 && j == 1) || (i == 2 && j == 0)) {
					System.out.println(matriz[i][j]);
					somaDiagSec += matriz[i][j];

				}

			}
		}
		System.out.printf("\nSoma da diagonal principal: %d", somaDiagPrin);
		System.out.printf("\nSoma da diagonal secundária: %d", somaDiagSec);
		leia.close();
	}
}