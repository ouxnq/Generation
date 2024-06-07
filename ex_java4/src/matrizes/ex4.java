package matrizes;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		float matriz[][] = new float[10][4], media;
		float vetor[] = new float[10];
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite as notas dos alunes");
		for (int i = 0; i < 10; i++) {
			media = 0;
			System.out.printf("\nDigite as notas do %dº aluno\n", i + 1);
			for (int j = 0; j < 4; j++) {
				System.out.printf("%dª nota: ", j + 1);
				matriz[i][j] = leia.nextFloat();
				media += matriz[i][j];
			}
			vetor[i] = media / (float) 4;
		}
		System.out.println("\nA media dos alunos foram:\n");
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("%dº Aluno: %.2f\n", i + 1, vetor[i]);
		}
		leia.close();
	}

}
