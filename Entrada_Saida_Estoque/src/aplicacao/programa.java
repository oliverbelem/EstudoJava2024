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
		
		//	Função de validao adicionada a parte do exercicio por mim mesmo:
		
		int validacao = 1; // Aqui inicia a validacao, com o '1' para que possa entrar no while
		
		while (validacao == 1 || validacao == 2 || validacao !=3) { //while testa as condições de reentrada ou saida do sistema
			System.out.print("Escolha o se quer Adicionar (1) ou Remover (2) o produto, ou sair (3): ");
			validacao = sc.nextInt();
			
			if(validacao == 1) { //não é necessario 'break;' pois o while testará de novo as condições da variavel 'validacao' 
				
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
								
			} else if (validacao != 1 && validacao != 2 && validacao != 3) { //criado para servir de escape caso alguma tecla fora do menu seja selecionada, evitando erros ou fechamento abrupto
				
				System.out.println("");
				System.out.println("Número fora dos padrões, tente novamente...");
				
			}
		
		}
		
		System.out.println();
		System.out.println("Programa Encerrado, os dados atuais do fechamento são: ");
		System.out.println(Produto); //deixa a atulização baseado em todo o tempo que o programa rodou, como um "fechamento"
	}

}
