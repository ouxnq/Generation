package ex_java1;

import java.util.Scanner;

/* Escreva um algoritmo em Java, que leia 3 palavras (String), que definem as características de um tipo de animal possível 
 * segundo o diagrama abaixo, que deve ser lido da esquerda para a direita.
 */
public class ex4 {

	public static void main(String[] args) {
		String class1, class2, class3;
		Scanner leia = new Scanner(System.in);

		System.out.println(
				"Vou te mostrar um animal com 3 características. Escolha a primeira: vertebrado ou invertebrado");
		class1 = leia.next();
		class1 = class1.toLowerCase();
		if (class1=="vertebrado") {
			System.out.println("Agora escolha outra característica: ave ou mamifero");
			class2 = leia.next();
			class2 = class2.toLowerCase();

			if (class2.equals("ave")) {
				System.out.println("Por último, escolha uma das 2 opções: carnivoro ou onivoro");
				class3 = leia.next();
				class3 = class3.toLowerCase();

				if (class3.equals("carnivoro")) {
					System.out.println("Um animal com essas características é a Águia!");
				} else if (class3.equals("onivoro")) {
					System.out.println("Um animal com essas características é a Pomba!");
				} else {
					System.out.println("Opção inválida.");
				}
			} else if (class2.equals("mamifero")) {
				System.out.println("Por último, escolha uma das 2 opções: onivoro ou herbivoro");
				class3 = leia.next();
				class3 = class3.toLowerCase();

				if (class3.equals("onivoro")) {
					System.out.println("Um animal com essas características é o Homem!");
				} else if (class3.equals("herbivoro")) {
					System.out.println("Um animal com essas características é a Vaca!");
				} else {
					System.out.println("Opção inválida.");
				}
			}
		} else if (class1.equals("invertebrado")) {
			System.out.println("Agora escolha outra característica: inseto ou anelideo");
			class2 = leia.next();
			class2 = class2.toLowerCase();

			if (class2.equals("inseto")) {
				System.out.println("Por último, escolha uma das 2 opções: hematofago ou herbivoro");
				class3 = leia.next();
				class3 = class3.toLowerCase();

				if (class3.equals("hematofago")) {
					System.out.println("Um animal com essas características é a Pulga!");
				} else if (class3.equals("herbivoro")) {
					System.out.println("Um animal com essas características é a Lagarta!");
				} else {
					System.out.println("Opção inválida.");
				}
			} else if (class2.equals("anelideo")) {
				System.out.println("Por último, escolha uma das 2 opções: hematofago ou onivoro");
				class3 = leia.next();
				class3 = class3.toLowerCase();

				if (class3.equals("hematofago")) {
					System.out.println("Um animal com essas características é a Sanguessuga!");
				} else if (class3.equals("onivoro")) {
					System.out.println("Um animal com essas características é a Minhoca!");
				} else {
					System.out.println("Opção inválida.");
				}
			}

		}else {
			System.out.println("Escolha uma opção válida!");
		}
		leia.close();
	}
}
