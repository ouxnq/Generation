package ex_java2;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int operador;
		float n1, n2, resultado;

		System.out.println("Digite 2 número para realizar qualquer operação: ");
		n1 = leia.nextFloat();
		System.out.println("Agora o segundo: ");
		n2 = leia.nextFloat();

		System.out.println(
				"Agora digite o número referente do seu operador:\n1- adição\n2- subtração\n3- multiplicação\n4- divisão");
		operador = leia.nextInt();

		switch (operador) {
		case 1:
			resultado = n1 + n2;
			System.out.printf("%.2f + %.2f = %.2f", n1, n2, resultado);
			break;
		case 2:
			resultado = n1 - n2;
			System.out.printf("%.2f - %.2f = %.2f", n1, n2, resultado);
			break;
		case 3:
			resultado = n1 * n2;
			System.out.printf("%.2f * %.2f = %.2f", n1, n2, resultado);
			break;
		case 4:
			resultado = n1 / n2;
			System.out.printf("%.2f / %.2f = %.2f", n1, n2, resultado);
			break;
		default:
			System.out.println("Operação inválida!");
		}
		leia.close();
	}
}
