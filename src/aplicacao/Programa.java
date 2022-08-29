package aplicacao;

import java.util.Locale;
import java.util.Scanner;


public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta account;

		System.out.print("Entre com o numero da conta:");
		Integer numero = sc.nextInt();

		System.out.print("Nome do titular: ");
		sc.nextLine();
		String titular = sc.nextLine();

		System.out.print("Digite o numero do titular: (y/n)");
		char confirm = sc.next().charAt(0);

		if (confirm == 'y') {
			System.out.println("Insira o valor do deposito inicial:");
			double depositoInicial = sc.nextDouble();
			account = new Conta (numero, titular, depositoInicial);
		} else {
			account = new Conta(numero, titular);
		}

		System.out.println();
		System.out.println("Dados da conta:");
		System.out.println(account);

		System.out.println();
		System.out.print("Insira um valor de deposito: ");
		double deposit = sc.nextDouble();
		account.deposit(deposit);

		System.out.print("Dados da conta atualizados:");
		System.out.print(account);
		
		System.out.println();
		System.out.print("Insira um valor da retirada: ");
		double withdrawValue = sc.nextDouble();
		account.withraw(withdrawValue);
		System.out.println("atualizacao da conta:");
		System.out.println(account);


		sc.close();

	}

}
