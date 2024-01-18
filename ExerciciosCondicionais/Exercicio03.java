package ExerciciosCondicionais;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em ordem crescente ou decrescente.
		
		Scanner sc = new Scanner(System.in);
		
		int ValorA, ValorB;
		String Multiplo = null;
		
		System.out.println("Escreva dois números inteiros: ");
		ValorA = sc.nextInt();
		ValorB = sc.nextInt();
		
		if (ValorA > ValorB) {
			Multiplo = (ValorA % ValorB == 0)?"Múltiplo":"Não Múltiplo"; 
		}else {
			Multiplo = (ValorB % ValorA == 0)?"Múltiplo":"Não Múltiplo";
		}
		
		System.out.println(Multiplo);
		
		sc.close();
	}

}
