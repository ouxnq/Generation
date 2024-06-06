package ex_DoWhile;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		int num1, soma = 0, i = 1;
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite números inteiros positivos ou negativos. Irei somar apenas os positivos.");
		do {
			System.out.printf("Digite o %dº número (digite 0 para finalizar o programa):\n", i);
			num1 = leia.nextInt();
			if (num1 > 0) {
				soma += num1;
			}
			i++;
		} while (num1 != 0);
		System.out.printf("Programa finalizado.\nA soma total dos positivos é %d", soma);
		leia.close();
	}

}
