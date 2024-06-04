package exercicios1;

import java.util.Scanner;

public class numero4 {

	public static void main(String[] args) {
		float n1, n2, n3, n4, resultado;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite 4 valores quaisquer: ");
		n1 = leia.nextFloat();
		n2 = leia.nextFloat();
		n3 = leia.nextFloat();
		n4 = leia.nextFloat();
		resultado = (n1*n2) - (n3*n4);
		System.out.printf("A diferença entre o produto do primeiro e do segundo"
				+ " pelo produto do terceiro e do quarto é %.2f", resultado);
	}

}
