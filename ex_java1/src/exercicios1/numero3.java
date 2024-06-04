package exercicios1;

import java.util.Scanner;

public class numero3 {

	public static void main(String[] args) {
		float salario, adicional, horasExtras, descontos, salarioFinal;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu salário bruto: ");
		salario = leia.nextFloat();
		System.out.println("Digite seu adicional noturno: ");
		adicional = leia.nextFloat();
		System.out.println("Digite suas horas extras: ");
		horasExtras = leia.nextFloat();
		System.out.println("Digite seus descontos: ");
		descontos = leia.nextFloat();
		
		salarioFinal = salario + adicional + (horasExtras*100) - descontos;
		System.out.printf("Seu salário final é: %.2f", salarioFinal);
	}

}
