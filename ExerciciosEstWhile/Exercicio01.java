package ExerciciosEstWhile;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
		//incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
		//impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
		
		int Senha;
		Scanner senha = new Scanner(System.in);
		
		System.out.println("Após a terceira tentativa o programa encerrará"); // Linha para o teste
		System.out.print("Digite sua senha: ");
		Senha = senha.nextInt();
		
		System.out.println();
		
		// Teste: delimitar tentativas
		for (int i=0; i<3 && Senha != 2002; i++) {
						
			if (Senha != 2002) {
			System.out.print("Senha errada, digite novamente: ");
			Senha = senha.nextInt();
			}
		}
		
		if (Senha == 2002) {
			System.out.println();
			System.out.println("Senha correta!");
			System.out.println("Acesso permitido...");
		}
		else {
			System.out.println();
			System.out.println("Senha Incorreta!");
			System.out.println("Acesso Não Permitido...");
		}
		
		// Usando de forma infita, até acertar a senha
		//while (Senha != 2002) {
		//	System.out.print("Senha errada, digite novamente: ");
		//	Senha = senha.nextInt();
		//}
		
		
		//System.out.println();
		//System.out.println("Senha correta!");
		//System.out.println("Acesso permitido...");
		
		
	}

}
