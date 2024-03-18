package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class App {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int quantidade = sc.nextInt();
		
		for (int quantidadeDePessoas = 0; quantidadeDePessoas < quantidade; quantidadeDePessoas++) {
			
			System.out.println();
			
			System.out.println("Tax payer #" + (quantidadeDePessoas+1) + "data:");
			
			System.out.print("Pessoa Fisica ou Pessoa Juridica (pf/pj): ");
			String pfOrPj = sc.next();
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Renda Anual: ");
			double rendaAnual = sc.nextDouble();
			
			if (pfOrPj.equals("pf")) {
				System.out.print("Gasto com saúde: ");
				double gastoComSaude = sc.nextDouble();
				Pessoa pessoa = new PessoaFisica(name, rendaAnual, gastoComSaude);
				pessoas.add(pessoa);
			}else if (pfOrPj.equals("pj")) {
				System.out.print("Quantidade de funcionarios na empresa: ");
				int quantidadeDeFuncionarios = sc.nextInt();
				Pessoa pessoa = new PessoaJuridica(name, rendaAnual, quantidadeDeFuncionarios);
				pessoas.add(pessoa);
			}
			
		}
		System.out.println();
		
		int soma = 0;
		
		for (Pessoa p : pessoas) {
			System.out.println(p.toString());
			soma += p.imposto();
		}
		
		System.out.println();
		
		System.out.println("Total Taxes: $ " + soma);
		
		sc.close();

	}

}
