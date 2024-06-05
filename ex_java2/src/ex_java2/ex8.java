package ex_java2;

import java.util.Scanner;

public class ex8 {
	public static void main(String[] args) {
		float saldo = 1000, novoSaldo, saque, deposito;
		int cod;
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o código para a operação:\n1- Saldo\n2- Saque\n3- Depósito");
		cod = leia.nextInt();

		switch (cod) {
		case 1:
			System.out.printf("Seu saldo é  R$%.2f", saldo);
			break;
		case 2:
			System.out.printf("Seu saldo é R$%.2f. Digite quanto quer sacar: ", saldo);
			saque = leia.nextFloat();
			if (saque > saldo) {
				System.out.println("Saldo insuficiente!");
				break;
			} else {
				novoSaldo = saldo - saque;
				System.out.printf("Operação - Saque\nNovo Saldo: R$%.2f", novoSaldo);
			}
			break;
		case 3:
			System.out.printf("Seu saldo é R$%.2f. Digite quanto quer depositar: ", saldo);
			deposito = leia.nextFloat();
			novoSaldo = saldo + deposito;
			System.out.printf("Operação - Depósito\nSeu novo saldo é R$%.2f", novoSaldo);
			break;
		default:
			System.out.println("Operação Inválida!");
		}
		leia.close();
	}
}
