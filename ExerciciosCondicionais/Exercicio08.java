package ExerciciosCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		// Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. 
		//Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda, 
		//segundo a tabela abaixo.
		
			// R$0 à R$2000,00 ------------ Isento;
			// R$2000,01 à R$3000,00 ------ 8%; 
			// R$3000,01 à R$4500,00 ------ 18%;
			// Acima de R$4500,00 --------- 28%;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double Salario, Imposto = 0;
		
		System.out.print("Digite seu salário aqui: ");
		Salario = sc.nextDouble();
		
		if (Salario <= 2000) {
			Imposto = 0;
		}
		else if(Salario >=2000.01 && Salario <= 3000) {
			Imposto = (Salario - 2000) * 0.08;
		}
		else if(Salario >=3000.01 && Salario <= 4500) {
			Imposto = (Salario - 3000) * 0.18 + 1000 * 0.08 ;
		}
		else if(Salario > 4500) {
			Imposto = (Salario - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
		}
		
		
		System.out.printf("O seu imposto será de: R$%.2f",Imposto);
		sc.close();
	}

}
