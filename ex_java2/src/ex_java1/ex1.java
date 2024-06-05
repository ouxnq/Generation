package ex_java1;
/*Faça um algoritmo em Java que leia 3 valores inteiros A, B e C e imprima na tela se a soma de A + 
B é maior, menor ou igual a C.*/
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		int a, b, c;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite 3 números inteiros: ");
		a = leia.nextInt();
		b = leia.nextInt();
		c = leia.nextInt();
		leia.close();
		if(a+b>c) {
			System.out.println("A soma do primeiro mais o segundo é MAIOR que o terceiro.");
		}else if(a+b==c){
			System.out.println("A soma do primeiro mais o segundo é IGUAL ao terceiro");
		}else {
			System.out.println("A soma do primeiro mais o segundo é MENOR que o terceiro");
		}
	}
}
