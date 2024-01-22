package ExerciciosEstFor;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
		//Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
		//essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
		Scanner sc = new Scanner (System.in);
		
		int 
		NumParaIns, 
		DentroInter = 0, 
		ForaInter = 0,
		NumeroCont = 0;
		
		NumParaIns = sc.nextInt();
		System.out.println();

		for (int i = 0; i < NumParaIns; i++) {
			
			NumeroCont = sc.nextInt();
			
			if (NumeroCont >= 10 && NumeroCont <=20) {
				DentroInter ++;
			}
			else {
				ForaInter ++;
			}
		}
		
		System.out.printf("Dentro do intervalo: %d%n", DentroInter);
		System.out.printf("Fora do intervalo: %d%n", ForaInter);
		
		sc.close();
	}
	
}
