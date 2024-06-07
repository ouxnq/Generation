package vetores;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		int vetor[] = {2,5,1,3,4,9,7,8,10,6},num1,cont=0;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número para checar se está no vetor: ");
		num1 = leia.nextInt();
		for(int i=0;i<10;i++) {
			if(num1==vetor[i]) {
				System.out.printf("O número %d está na posição [%d] do vetor.",num1,i);
			}else {
				cont++;
			}
		if(cont==10) {
			System.out.println("Seu número não foi encontrado!");
		}
		}
		leia.close();
	}

}
