package ExercicioEstSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// Faça um programa para ler o valor do raio de um círculo,
		//e depois mostrar o valor da área deste círculo com quatro
		//casas decimais.
		
		//area = π . raio2
		//π = 3.14159
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double Vraio, Resultado;
		double Pi = 3.12159;
		
		System.out.println("Digite o valor do raio do circulo: ");
		Vraio = sc.nextDouble();
		
		Resultado = Pi * Math.sqrt(Vraio);
		
		System.out.printf("O valor da área do círculo é: %.2f", Resultado);
		
		sc.close();

	}

}
