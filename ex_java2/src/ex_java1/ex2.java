package ex_java1;

import java.util.Scanner;

/*Escreva um algoritmo em Java, que leia um número inteiro via teclado e mostre na tela uma mensagem indicando se 
 * este número é par ou ímpar e se o número é positivo ou negativo. Veja os exemplos abaixo
 */
public class ex2 {

	public static void main(String[] args) {
		int num1;
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um numero inteiro positivo ou negativo qualquer: ");
		num1 = leia.nextInt();
		leia.close();
		if (num1 % 2 == 0) {
			if (num1 >= 0) {
				System.out.println("Seu número é PAR e POSITIVO!");
			} else {
				System.out.println("Seu número é PAR e NEGATIVO");
			}
		} else {
			if (num1 >= 0) {
				System.out.println("Seu número é IMPAR e POSITIVO");
			} else {
				System.out.println("Seu número é IMPAR e NEGATIVO");
			}
		}
	}
}
