package exercicio2;

import java.util.Locale;
import java.util.Scanner;

import exercicio2.Funcionario;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		Funcionario func1=new Funcionario();
		
		System.out.println("Informe o nome:");
		func1.nome=sc.nextLine();
		
		System.out.println("Informe o salario:");
        func1.salarioBruto=sc.nextDouble();
              
        System.out.println("Imposto:");
        func1.imposto=sc.nextDouble();
             
        System.out.printf("\nFuncionario: "+func1.nome+","+"R$%.2f",func1.SalarioLiquido());
        System.out.println("\nQuantos porcentos deseja incrementar ao salario: \n");
        func1.porcentagem=sc.nextDouble();
        func1.aumentoSalario();
      
        System.out.println("Salario atualizado: "+ func1.aumentoSalario());
	
        sc.close();

	}

}


