package ex_while;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		int idade = 1, i = 1, maior = 0, menor = 0;
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite idades de pessoas, digite uma idade negativa para parar.");

		while (idade > 0) {
			System.out.printf("Digite a %dª idade:\n", i);
			idade = leia.nextInt();
			i++;
			if (idade > 50) {
				maior++;
			} else if (idade < 21 && idade > 0) {
				menor++;
			}
		}
		leia.close();
		System.out.printf("você digitou %d idades maiores que 51 anos e %d idades menores que 21 anos.", maior, menor);
	}

}
