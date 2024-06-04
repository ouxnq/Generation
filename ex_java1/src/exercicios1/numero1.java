package exercicios1;
import java.util.Scanner;

public class numero1 {

	public static void main(String[] args) {
		float salario;
		float abono;
		float novoSalario;
		Scanner leia = new Scanner(System.in);

		
		System.out.println("Digite seu salário: ");
		salario = leia.nextFloat();
		System.out.println("Agora digite seu abono: ");
		abono = leia.nextFloat();
		novoSalario = salario + abono;
		System.out.printf("Seu salário total é %.2f", novoSalario);
	}

}
