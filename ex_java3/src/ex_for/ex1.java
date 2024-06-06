package ex_for;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		int num1, num2, i;
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite dois números, onde o segundo é maior que o primeiro: ");
		num1 = leia.nextInt();
		System.out.println("Agora o segundo: ");
		num2 = leia.nextInt();
		leia.close();
		System.out.printf("\nOs números divisíveis entre %d e %d são:\n", num1, num2);
		if (num1 < num2) {

			for (i = num1; i <= num2; i++) {
				if (i % 3 == 0 && i % 5 == 0) {
					System.out.printf("%d é divisível por 3 e 5\n", i);
				}
			}
		} else {

			System.out.println("o SEGUNDO número deve ser MAIOR que o PRIMEIRO!");
		}

	}

}
