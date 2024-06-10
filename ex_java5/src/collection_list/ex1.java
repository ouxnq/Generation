package collection_list;

import java.util.ArrayList;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		ArrayList<String> cores = new ArrayList<String>();
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite 5 cores diferentes: ");
		for (int i = 0; i < 5; i++) {
			System.out.printf("Digite a %dª cor:", i + 1);
			cores.add(leia.nextLine());
		}
		System.out.println("Cores cadastradas: " + cores);
		cores.sort(null);
		System.out.println("Cores cadastradas ordenadas" + cores);
		leia.close();

	}

}
