package ex_java2;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		String nome;
		int cod;
		float salario;
		double newSalario;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite seu nome: ");
		nome = leia.next();

		System.out.println(
				"Digite o código do seu cargo: \n1- Gerente \n2- Vendedor \n3- Supervisor \n4- Motorista \n5- Estoquista \n6- Técnico de TI");
		cod = leia.nextInt();

		System.out.println("Agora digite seu salário: ");
		salario = leia.nextFloat();

		switch (cod) {
		case 1:
			newSalario = salario + (salario * 0.1);
			System.out.printf("%s, seu cargo é Gerente e seu novo salário será %.2f", nome, newSalario);
			break;
		case 2:
			newSalario = salario + (salario * 0.07);
			System.out.printf("%s, seu cargo é Vendedor e seu novo salário será %.2f", nome, newSalario);
			break;
		case 3:
			newSalario = salario + (salario * 0.09);
			System.out.printf("%s, seu cargo é Supervisor e seu novo salário será %.2f", nome, newSalario);
			break;
		case 4:
			newSalario = salario + (salario * 0.06);
			System.out.printf("%s, seu cargo é Motorista e seu novo salário será %.2f", nome, newSalario);
			break;
		case 5:
			newSalario = salario + (salario * 0.05);
			System.out.printf("%s, seu cargo é Estoquista e seu novo salário será %.2f", nome, newSalario);
			break;
		case 6:
			newSalario = salario + (salario * 0.08);
			System.out.printf("%s, seu cargo é Técnico de TI e seu novo salário será %.2f", nome, newSalario);
			break;
		}
	leia.close();
	}

}
