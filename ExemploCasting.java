
public class ExemploCasting {

	public static void main(String[] args) {
		//Exemplo 1
		
		int h = 5;
		int b = 6;
		int B = 8;
		
		double area = ((b+B)/2)*h;
		
		// Poderiamos também elencar todos juntos, da seguinte maneira:
		// double h, b, B, area;
		// Assim todas as variáveis seriam declaradas em uma linha só
		
		System.out.println(area);
		
		//Exemplo 2
		int x = 5;
		int y = 2;
		
		double resultado;
		
		// O "(double)" será nosso Casting
		resultado = (double) x/y;
		
		System.out.println(resultado);
		
	}

}
