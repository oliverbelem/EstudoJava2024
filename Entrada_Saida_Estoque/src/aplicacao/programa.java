package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entities.produtos;

public class programa {

	public static void main(String[] args) {
		/*Fazer um programa para ler os dados de um produto em estoque (nome, preço e
		quantidade no estoque). Em seguida:
			• Mostrar os dados do produto (nome, preço, quantidade no estoque, valor total no
			estoque)
			• Realizar uma entrada no estoque e mostrar novamente os dados do produto
			• Realizar uma saída no estoque e mostrar novamente os dados do produto */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		produtos Produto = new produtos();
		
		System.out.println("Entre com os dados do produto: ");
		
		System.out.print("Nome do Produto: ");
		Produto.nome = sc.nextLine(); //Recebe o nome do produto.
		
		System.out.print("Preço do Produto: ");
		Produto.preco = sc.nextDouble();//Recebe o preço do produto.
		
		System.out.print("Nome do Produto: ");
		Produto.quantidade = sc.nextInt();//Recebe a quantidade do produto.
		
		System.out.println(Produto.toString());
		
		sc.close();
		
	}

}
