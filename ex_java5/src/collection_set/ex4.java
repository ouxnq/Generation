package collection_set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ex4 {

	public static void main(String[] args) {
		Set<Integer> nums = new HashSet<Integer>();
		Scanner leia = new Scanner(System.in);
		char i = 's';
		Integer num;
		
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
		
		while (Character.toLowerCase(i)== 's') {
			System.out.println("Digite um número para saber se está na coleção: ");
			num = Integer.valueOf(leia.nextInt());
			if (nums.contains(num)) {
				System.out.printf("O número %d foi encontrado!", num);
			}else {
				System.out.printf("O número %d não foi encontrado!", num);
			}
			System.out.println("\nDeseja digitar outro número? (s) para sim ou (n) para não");
			i = leia.next().charAt(0);
		}
		System.out.println("O programa foi finalizado.");
		leia.close();
	}

}
