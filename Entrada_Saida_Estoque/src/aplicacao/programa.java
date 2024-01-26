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
		
		System.out.print("Quantidade do Produto: ");
		Produto.quantidade = sc.nextInt();//Recebe a quantidade do produto.
		
		System.out.println("Dados do produto: " + Produto);
		System.out.println();
		//	Função de escolha adicionada a parte do exercicio por mim mesmo:
		
		int validacao = 1;
		
		while (validacao == 1 || validacao == 2 || validacao !=3) {
			System.out.print("Escolha o se quer Adicionar (1) ou Remover (2) o produto, ou sair (3): ");
			validacao = sc.nextInt();
			
			if(validacao == 1) {
				
				System.out.println();
				System.out.print("Insira a quantidade de produtos a serem adicionados: ");
				int quantidade = sc.nextInt();
				Produto.adicaoProdutos(quantidade);
				
				System.out.println("Atualização dos dados: " + Produto);
				System.out.println();
				
				
			} else if (validacao == 2) {
				
				System.out.println();
				System.out.print("Insira a quantidade de produtos a serem excluidos: ");
				int quantidade = sc.nextInt();
				Produto.remocaoProdutos(quantidade);
				
				System.out.println("Atualização dos dados: " + Produto);
				System.out.println();
								
			} else if (validacao != 1 && validacao != 2 && validacao != 3) {
				
				System.out.println("");
				System.out.println("Número fora dos padrões, tente novamente...");
				
			}
		
		}
		
		System.out.println();
		System.out.println("Programa Encerrado, os dados atuais do fechamento são: ");
		System.out.println(Produto);
	}

}
