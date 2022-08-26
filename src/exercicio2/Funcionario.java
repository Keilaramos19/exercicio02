package exercicio2;

public class Funcionario {
	public String nome;
	public double salarioBruto;
	public double imposto;
	public double porcentagem;
	
	public double SalarioLiquido() {
		return salarioBruto-imposto;
	
	}
	
	public double aumentoSalario() {
		double aumento=(salarioBruto-imposto)+(salarioBruto*(porcentagem/100));
		return aumento;
	}

}
