package ex_while;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		int idade, idGenero, codFuncao, backEnd = 0, mulheres = 0, homens40 = 0, nbFull30 = 0, total = 0,
				idadeMedia = 0;
		Scanner leia = new Scanner(System.in);
		char i = 's';

		while (i == 's') {
			total++;
			System.out.println("Primeiro, digite a idade de colaboradore:");
			idade = leia.nextInt();
			System.out.println(
					"Agora, digite o código do gênero de colaboradore:\n1- Mulher Cis\n2- Homem Cis\n3- Não Binarie\n4- Mulher Trans\n5- Homem Trans\n6- Outro");
			idGenero = leia.nextInt();
			System.out.println(
					"Agora, digite o código da função de colaboradore:\n1- Backend\n2- Frontend\n3- Mobile\n4- Fullstack");
			codFuncao = leia.nextInt();
			idadeMedia += idade;
			if (codFuncao == 1) {
				backEnd++;
			} else if ((idGenero == 1 || idGenero == 4) && codFuncao == 2) {
				mulheres++;
			} else if ((idGenero == 2 || idGenero == 5) && codFuncao == 3 && idade > 40) {
				homens40++;
			} else if (idGenero == 3 && codFuncao == 4 && idade < 30) {
				nbFull30++;
			}
			System.out.println("Deseja inserir os dados de mais um colaboradore? Digite (s) para sim ou (n) para não:");
			i = Character.toLowerCase(leia.next().charAt(0));
		}
		leia.close();
		idadeMedia = idadeMedia / total;
		System.out.printf("O número de pessoas desenvolvedoras backend é: %d\n", backEnd);
		System.out.printf("O número de mulheres desenvolvedoras frontend é: %d\n", mulheres);
		System.out.printf("O número de homens desenvolvedores mobile acima de 40 anos é: %d\n", homens40);
		System.out.printf("O número de pessoas não binaries desenvolvedoras fullstack com menos de 30 anos é: %d\n",
				nbFull30);
		System.out.printf("O número total de pessoas que responderam a pesquisa foi: %d\n", total);
		System.out.printf("A idade média das pessoas que responderam a pesquisa é: %d\n", idadeMedia);
	}

}
