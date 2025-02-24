package conta.banco;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ContaTerminal conta = new ContaTerminal();
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite seu nome:");
		conta.nomeCliente = teclado.nextLine();
		
		System.out.println("Digite sua agência:");
		conta.agencia = teclado.nextLine();
		
		System.out.println("Digite o número da conta:");
		conta.numero = teclado.nextInt();
		
		System.out.println("Digite o saldo: ");
		conta.saldo = teclado.nextDouble();
		
		conta.exibirMessagem();
		
		

	}

}
