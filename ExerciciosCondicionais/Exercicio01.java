package ExerciciosCondicionais;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		//Fazer um programa para ler um número inteiro, e depois dizer  se este número é Ímpar ou Par.
		
		Scanner sc = new Scanner(System.in);
		
		int NumeroInteiro, Resultado;
		
		System.out.print("Digite um numero inteiro: ");
		NumeroInteiro = sc.nextInt();
		
		//Resultado = NumeroInteiro % 2;
		
		if (NumeroInteiro % 2 == 0) { //Dessa forma posso usar somente uma variável.
			System.out.println("O número é par");
		}
		else {
			System.out.println("O número é ímpar");
		}
		
		sc.close();
	}

}
