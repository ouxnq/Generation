package ex_java1;

import java.util.Scanner;

/*Para doar sangue é necessário ter entre 18 e 69 anos de idade. Pessoas com idade entre 60 e 69 anos, só podem doar 
 * se não for a sua primeira doação. Escreva um Algoritmo em Java que obtenha via teclado o nome do doador (String), a 
 * idade (inteiro) do doador e se é a primeira doação (boolean). De acordo com as Regras para a doação, mostre na tela se o 
 * doador está Apto ou Não Apto para doar sangue. Veja os exemplos abaixo
 */
public class ex3 {

	public static void main(String[] args) {
		String nome;
		char doou;
		int idade;
		boolean jaDoou = true;
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite seu nome: ");
		nome = leia.nextLine();
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();

		

		if (idade >= 60 && idade < 70) {
			System.out.println("Você já doou sangue? Digite (S) para sim ou (N) para não");
			doou = leia.next().charAt(0);
			if (doou == 'N' || doou == 'n') {
				jaDoou = false;
			}
		}

		if (idade >= 18 && idade < 70) {
			if (idade >= 60 && jaDoou) {
				System.out.printf("%s, você está apto para doar sangue!", nome);
			} else if (idade < 60) {
				System.out.printf("%s, você está apto para doar sangue!", nome);
			} else {
				System.out.printf("%s, você não está apto para doar sangue por nunca ter doado antes!", nome);
			}
		} else {
			System.out.printf("%s, você não tem a idade adequada para doar sangue!", nome);
		}
		leia.close();
	}
}
