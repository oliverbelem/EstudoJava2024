package entities;

public class aumentoSalario {
	
	public String nome;
	public double salarioBruto;
	public double taxa;
	

	public double salarioLiquido() {
		return salarioBruto - taxa;
	}
	
	public void aumentoDoSalario(double porcentagem) {
		salarioBruto += salarioBruto * porcentagem / 100;
	}
	
	public String toString() {
		return "Dados do funcionário: " +  nome + ", R$" + String.format("%.2f", salarioLiquido());  
	}
}


