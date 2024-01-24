package FunçõesBásicas;

import java.util.Scanner;

public class FuncoesSintaxe {

	public static void main(String[] args) {
		// Aula voltada para o uso de funções em JAVA
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira 3 números: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		/* essa primeira forma, usamos somente uma clase no programa. 
		Usando os if's para reproduzir o que queremos*/
		/*
		if ( a > b && a > c) {
			System.out.println("Maior valor: " + a);
		} else if ( b > c  ) {
			System.out.println("Maior valor: " + b);
		} else {
			System.out.println("Maior valor: " + c);
		}
		*/
		
		//Essa segunda forma, usaremos funções diferentes dentro dessa classe
		
		int maior = max(a, b, c);
		
		showResult(maior);
		
		sc.close();
	}

	public static int max (int x, int y, int z) {
		int aux;
		
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		
		return aux;
	}
	
	public static void showResult( int value) {
		System.out.println("Maior valor: " + value);
	}
}
