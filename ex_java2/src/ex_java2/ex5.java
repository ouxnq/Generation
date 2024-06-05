package ex_java2;

import java.util.Scanner;

/* 
Com base na tabela abaixo, escreva um algoritmo em Java que leia o código de um item (número inteiro de 1 a 6) e a quantidade comprada deste item (número inteiro). A seguir, 
mostre na tela o valor total da conta e o nome do produto que foi comprado.
*/

public class ex5 {

	public static void main(String[] args) {
		int cod, quantidade;
		float valor;
		Scanner leia = new Scanner(System.in);

		System.out.println(
				"Digite o código do produto: \n1- Cachorro quente \n2- X-Salada \n3- X-Bacon \n4- Bauru \n5- Refrigerante \n6- Suco de Laranja ");
		cod = leia.nextInt();

		System.out.println("Agora digite a quantidade: ");
		quantidade = leia.nextInt();

		switch (cod) {
		case 1:
			valor = quantidade * 10;
			System.out.printf("Seu produto foi cachorro quente e o valor total foi: %.2f", valor);
			break;
		case 2:
			valor = quantidade * 15;
			System.out.printf("Seu produto foi X-Salada e o valor total foi: %.2f", valor);
			break;
		case 3:
			valor = quantidade * 18;
			System.out.printf("Seu produto foi X-Bacon e o valor total foi: %.2f", valor);
			break;
		case 4:
			valor = quantidade * 12;
			System.out.printf("Seu produto foi Bauru e o valor total foi: %.2f", valor);
			break;
		case 5:
			valor = quantidade * 8;
			System.out.printf("Seu produto foi Refrigerante e o valor total foi: %.2f", valor);
			break;
		case 6:
			valor = quantidade * 13;
			System.out.printf("Seu produto foi Suco de laranja e o valor total foi: %.2f", valor);
			break;
		default:
			System.out.println("Escolha um número válido");
		}
		leia.close();
	}

}
