package vetores;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		int vetor[] = new int[10], soma = 0;
		Scanner leia = new Scanner(System.in);
		float media;

		System.out.println("Digite 10 números para criamos um vetor.");
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("Digite o %dº número:\n", i + 1);
			vetor[i] = leia.nextInt();
		}
		System.out.println("Os elementos nos índices ímpares são:\n");
		for (int i = 0; i < vetor.length; i++) {
			if (i % 2 != 0) {
				System.out.println(vetor[i]);
			}
			soma += vetor[i];
		}
		System.out.println("Os elementos pares são:\n");
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
				System.out.println(vetor[i]);
			}
		}
		media = (float)soma / (vetor.length);
		System.out.printf("A soma de todos os valores do vetor é %d\nA média dos valores do vetor é %.2f", soma, media);
		leia.close();
	}

}
