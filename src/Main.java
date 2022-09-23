import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		double horas = sc.nextDouble();
		double valor = sc.nextDouble();
		
		double salario = horas * valor;
		
		System.out.println("Numero de funcionario: " + numero);
		System.out.printf("Salario do funcionario: %.2f%n", salario);
		
	}

}
