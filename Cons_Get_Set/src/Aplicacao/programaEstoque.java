package Aplicacao;

import Util.produtos;
import java.util.Locale;
import java.util.Scanner;

public class programaEstoque {
    public static void main(String[] args) {
		/*Esse exemplo é semelhante ao utlizado no estudo inicial de POO
		* Agora usando encapsulamento, para melhor segmento do padrão de
		* desenvolvimento em Java  */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados do produto: ");
        System.out.print("Nome do Produto: ");
        String nome = sc.nextLine(); //Recebe o nome do produto.
        System.out.print("Preço do Produto: ");
        double preco = sc.nextDouble();//Recebe o preço do produto.
        System.out.print("Quantidade do Produto: ");
        int quantidade = sc.nextInt();//Recebe a quantidade do produto.
        produtos produto = new produtos(nome, preco,quantidade);
        System.out.println("Dados do produto: " + produto);
        System.out.println();

        /*
        System.out.print("Digite a atualização do produto: ");
        String atualizacao = sc.nextLine();
        atualizacao = sc.nextLine();
        produto.setNome(atualizacao);

        Teste para verificar a forma de atualização usando o método set
        */

        //	Função de validao adicionada a parte do exercicio:
        int validacao = 1; // Aqui inicia a validacao, com o '1' para que possa entrar no while

        while (validacao == 1 || validacao == 2 || validacao !=3) { //while testa as condições de reentrada ou saida do sistema
            System.out.print("Escolha o se quer Adicionar (1) ou Remover (2) o produto, ou sair (3): ");
            validacao = sc.nextInt();

            if(validacao == 1) { //não é necessario 'break;' pois o while testará de novo as condições da variavel 'validacao'
                System.out.println();
                System.out.print("Insira a quantidade de produtos a serem adicionados: ");
                quantidade = sc.nextInt();
                produto.adicaoProdutos(quantidade);
                System.out.println("Atualização dos dados: " + produto);
                System.out.println();
            } else if (validacao == 2) {
                System.out.println();
                System.out.print("Insira a quantidade de produtos a serem excluidos: ");
                quantidade = sc.nextInt();
                produto.remocaoProdutos(quantidade);
                System.out.println("Atualização dos dados: " + produto);
                System.out.println();
            } else if (validacao != 1 && validacao != 2 && validacao != 3) { //criado para servir de escape caso alguma tecla fora do menu seja selecionada, evitando erros ou fechamento abrupto
                System.out.println("");
                System.out.println("Número fora dos padrões, tente novamente...");
            }

        }

        System.out.println();
        System.out.println("Programa Encerrado, os dados atuais do fechamento são: ");
        System.out.println(produto); //deixa a atulização baseado em todo o tempo que o programa rodou, como um "fechamento"
    }
}
