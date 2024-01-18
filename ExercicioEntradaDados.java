import java.util.Locale;

public class ExercicioEntradaDados {

	public static void main(String[] args) {
		String Produto1 = "Computador";
		String Produto2 = "Mesa de Escritório";
		
		int age = 30;
		int code = 5290;
		char genero = 'F';
		
		double preço1 = 2100.0;
		double preço2 = 650.50;
		double medida = 53.234567;
		
		System.out.println("Produtos:");
		System.out.printf("Computador, preço: R$%.2f %n", preço1);
		System.out.printf("Mesa de Escritório, preço: R$%.2f %n%n", preço2);
		
			
		System.out.print("Salvo: ");
		System.out.printf("%d anos de idade, codigo %d e genero: %c %n%n", age, code, genero);
			
			
		System.out.printf("Medida com oito casas decimais: %f %n", medida);
		System.out.printf("Medida com três casas decimais: %.3f %n", medida);
			Locale.setDefault(Locale.US);
		System.out.printf("US decimal point %.3f %n", medida);
		
	}

}
