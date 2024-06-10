package collection_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ex3 {

	public static void main(String[] args) {
		Set<Integer> nums = new HashSet<Integer>();
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite 10 números diferentes");
		for(int i =0;i<10;i++) {
			System.out.printf("Digite o %dº número: ",i+1);
			nums.add(Integer.valueOf(leia.nextInt()));
		}
		Iterator<Integer> iNums = nums.iterator();
		System.out.println("Os números digitados foram: \n");
		while(iNums.hasNext()) {
			System.out.println(iNums.next());
		}
		leia.close();

	}

}
