package aplicacao;

import java.util.Scanner;

import entities.aumentoSalario;

public class Cadastro {

	public static void main(String[] args) {
		/* Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
		seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
		salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
		afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe
		projetada abaixo. */

		Scanner sc = new Scanner(System.in);
		aumentoSalario empregado = new aumentoSalario();
		
		System.out.println("Insira os dados do funcionário: ");
		System.out.print("Nome: ");
		empregado.nome = sc.nextLine();
		System.out.print("Salario Bruto: ");
		empregado.salarioBruto = sc.nextDouble();
		System.out.print("Valor do imposto: ");
		empregado.taxa = sc.nextDouble();
		
		System.out.println();
		System.out.println(empregado);
		System.out.println();
		System.out.print("Qual a porcentagem de aumento do salário? : ");
		double porcentagem = sc.nextDouble();
		empregado.aumentoDoSalario(porcentagem);
		
		System.out.println();
		System.out.println("Atualização dos dados: " + empregado);
		
	}

}
