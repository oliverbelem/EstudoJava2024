package EstruturasCondicionais;

import java.util.Scanner;

public class ExemploEstCondicional {

	public static void main(String[] args) {
		// Uma operadora de telefonia cobra R$ 50.00 por um plano básico que
		//dá direito a 100 minutos de telefone. Cada minuto que exceder a
		//franquia de 100 minutos custa R$ 2.00. Fazer um programa para ler a
		//quantidade de minutos que uma pessoa consumiu, daí mostrar o valor
		//a ser pago.
		
		double Minutos, ValorTotal, Conta;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a Quantidade de Minutos Consumidos: ");
		Minutos = sc.nextInt();
		
		//if (Minutos <= 100) {
			//ValorTotal = Limite;
		//}
		//else {
			//ValorTotal = (Minutos - 100) * 2 + 50;
		//}
		
		//System.out.printf("O valor da sua franquia será de: R$%.2f", ValorTotal);
		
		Conta = 50;
		if (Minutos > 100) {
			Conta += (Minutos - 100) * 2;
		}
		
		System.out.printf("O valor da sua franquia será de: R$%.2f", Conta);
	}

}
