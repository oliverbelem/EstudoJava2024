package ExercicioEstSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
		
		
		double NumFuncionario, HorasTrabalhadas, ValorHora, Salario;
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite (Na Ordem) o número no Funcionário, as horas trabalhadas e o Valor de sua hora: ");
		NumFuncionario = sc.nextDouble();
		HorasTrabalhadas = sc.nextDouble();
		ValorHora = sc.nextDouble();
		
		Salario = HorasTrabalhadas * ValorHora;
		
		System.out.printf("O funcionário %.0f, receberá o salaário de R$%.2f reais", NumFuncionario, Salario);
		
		sc.close();
	}
}
