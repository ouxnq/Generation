package ex_DoWhile;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		int num1, i = 1,j=0;
		float total,soma=0;
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite números inteiros positivos ou negativos. Irei mostrar a média dos múltiplos de 3.");
		do {
			System.out.printf("Digite o %dº número (digite 0 para finalizar o programa):\n", i);
			num1 = leia.nextInt();
			if (num1 %3== 0&&num1!=0) {
				soma += num1;
				j++;
			}
			i++;
		} while (num1 != 0);
		total=(soma/j);
		System.out.printf("Programa finalizado.\nA média dos valores múltiplos de 3 é: %.2f", total);
		leia.close();
	}

}
