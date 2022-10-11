package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Empregado;
import entities.terceirizarFuncionario;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Empregado> list = new ArrayList<>();

		System.out.print("Quantidade de funcionários: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Dados do #" + i + " funcionário: ");
			System.out.print("Terceirizado (s/n)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Horas: ");
			int horas = sc.nextInt();
			System.out.print("Valor por hora: ");
			double valorPorHora = sc.nextDouble();
			if (ch == 's') {
				System.out.print("Valor adicional: ");
				double cobrancaAdicional = sc.nextDouble();
				list.add(new terceirizarFuncionario(nome, horas, valorPorHora, cobrancaAdicional));
			}

			else {
				list.add(new Empregado(nome, horas, valorPorHora));
			}

		}

		System.out.println();
		System.out.println("Pagamento");
		for (Empregado emp : list) {
			System.out.println(emp.getNome() + " - $ " + String.format("%.2f", emp.pagamento()));
		}

		sc.close();
	}

}
