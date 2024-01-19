package ExerciciosCondicionais;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
		
		double HoraInicial, HoraFinal, Resultado = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva, nessa sequência, a Hora Inicial de jogo e a Hora Final: ");
		HoraInicial = sc.nextDouble();
		HoraFinal = sc.nextDouble();
		
		if (HoraFinal < HoraInicial) {
			Resultado = (24 - HoraInicial) + HoraFinal;
		}
		else {
			Resultado = HoraFinal - HoraInicial;
		}
			
		System.out.printf("O jogo durou %.0f Horas",Resultado);
		sc.close();		
	}

}
