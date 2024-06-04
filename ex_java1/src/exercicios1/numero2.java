package exercicios1;

import java.util.Scanner;

public class numero2 {

	public static void main(String[] args) {
		float n1, n2, n3, n4, notaFinal;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite sua primeira nota: ");
		n1 = leia.nextFloat();
		System.out.println("Digite sua segunda nota: ");
		n2 = leia.nextFloat();
		System.out.println("Digite sua terceira nota: ");
		n3 = leia.nextFloat();
		System.out.println("Digite sua quarta nota: ");
		n4 = leia.nextFloat();
		notaFinal = (n1+n2+n3+n4)/4;
		System.out.printf("Sua nota final é: %.2f", notaFinal);
	}

}
