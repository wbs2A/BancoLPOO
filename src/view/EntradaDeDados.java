package view;

import java.util.Scanner;

public class EntradaDeDados {

	private static Scanner scanner = new Scanner(System.in);

	public static String lerNome() {
		System.out.println();
		System.out.printf("\t\t\t\tNome: ");
		return scanner.nextLine();
	}

	public static String lerDtNasc() {
		System.out.println();
		System.out.printf("\t\t\t\tData de Nascimento dd/mm/yyy: ");
		return scanner.nextLine();
	}

	public static String lerSexo() {
		System.out.println();
		System.out.printf("\t\t\t\tSexo 'm' / 'f': ");
		return scanner.nextLine();
	}

	public static String lerCpf() {
		System.out.println();
		System.out.printf("\t\t\t\tCpf do Titular: ");
		return scanner.nextLine();
	}

	public static String lerSenha() {
		System.out.println();
		System.out.printf("\t\t\t\tSenha de Login: ");
		return scanner.nextLine();
	}

	public static String lerAgencia() {
		System.out.println();
		System.out.printf("\t\t\t\tAgencia: ");
		return scanner.nextLine();
	}

	public static String lerNumeroConta() {
		System.out.println();
		System.out.printf("\t\t\t\tNumero da Conta: ");
		return scanner.nextLine();
	}

	public static String lerSaldo() {
		System.out.println();
		System.out.printf("\t\t\t\tSaldo Inicial: ");
		return scanner.nextLine();
	}

	public static String lerSenhaConta() {
		System.out.println();
		System.out.printf("\t\t\t\tSenha da Conta: ");
		return scanner.nextLine();
	}

	public static String lerOpcao() {
		System.out.println();
		System.out.printf("\t\t\t\tOpcao: ");
		return scanner.nextLine();
	}

	public static String lerTelefoneCelular() {
		System.out.println();
		System.out.printf("\t\t\t\tNumero do seu Celular DDDxxxx-xxxx: ");
		return scanner.nextLine();
	}

	public static String lerEmail() {
		System.out.println();
		System.out.print("\t\t\t\tE-mail: ");
		return scanner.nextLine();
	}
	
	public static String lerValorTransacao() {
		System.out.println();
		System.out.print("\t\t\t\tValor: ");
		return scanner.nextLine();
	}
}
