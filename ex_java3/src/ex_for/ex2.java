package ex_for;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		int n1, i, par = 0, impar = 0;
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite 10 números inteiros: ");

		for (i = 1; i <= 10; i++) {
			System.out.printf("Digite o %dº número\n", i);
			n1 = leia.nextInt();
			if (n1 % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
		leia.close();
		System.out.printf("Você digitou %d números pares e %d números ímpares.", par, impar);
	}
}
