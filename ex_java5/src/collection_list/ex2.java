package collection_list;

import java.util.ArrayList;
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Integer num;
		char i = 's';
		Scanner leia = new Scanner(System.in);
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(2);
		nums.add(5);
		nums.add(1);
		nums.add(3);
		nums.add(4);
		nums.add(9);
		nums.add(7);
		nums.add(8);
		nums.add(10);
		nums.add(6);

		while (Character.toLowerCase(i) == 's') {
			System.out.println("Digite um número para saber se ele está na coleção: ");
			num = Integer.valueOf(leia.nextInt());
			if (nums.contains(num)) {
				System.out.printf("O número %d está na posição %d", num, nums.indexOf(num));

			} else {
				System.out.printf("O número %d não foi encontrado", num);
			}
			System.out.println("\nDeseja digitar outro número? (s) para sim ou (n) para não");
			i = leia.next().charAt(0);
		}
		System.out.println("Programa finalizado.");
		leia.close();

	}

}
