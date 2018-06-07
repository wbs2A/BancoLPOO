package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Classe responsavel por tratar todas as entradas de dados na view.
 * 
 * @author Adler_Moraes
 * @author Michael Douglas
 * @author Joao Gabriel
 * @author Joao Victor
 *
 */
public class TratamentodeEntradas {

	/**
	 * Este metodo trata a entrada data de nascimento e retorna essa data no formato
	 * dd/MM/yyyy
	 * 
	 * @return Date
	 */

	public static Date trataEntradaDtNasc() {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Date data = null;
		String dataTexto;
		boolean success = false;

		while (!success) {
			try {
				dataTexto = EntradaDeDados.lerDtNasc();
				if (!dataTexto.equals("")) {
					format.setLenient(false);
					data = (Date) format.parse(dataTexto);
					success = true;
					return data;

				} else if (dataTexto.trim().isEmpty()) {
					System.out.println();
					System.out.println("\t\t\t\t[O campo data de nascimento nao pode ficar em branco]");
					System.out.println();
					success = false;
				}
			} catch (ParseException e) {
				System.out.println();
				System.out.println("\t\t\t\t[Formato de Data Invalida]");
				System.out.println();
			}
		}
		return data;
	}

	/**
	 * Este metodo e responsavel por verificar se uma string contem caracteres do
	 * tipo char
	 * 
	 * @return String
	 */

	public static String trataEntradaNome() {
		String nome;
		boolean valido = false;

		while (!valido) {
			nome = EntradaDeDados.lerNome();
			if (nome.trim().isEmpty()) {
				System.out.println();
				System.out.println("\t\t\t\t[O campo nome nao pode ficar em branco]");
				System.out.println();
				valido = false;
			} else if (nome.length() < 2) {
				System.out.println();
				System.out.println("\t\t\t\t[O campo nome deve conter no minimo 2 caracteres]");
				System.out.println();
			} else {
				if (!nome.matches("^[a-zA-ZÁÂÃÀÇÉÊÍÓÔÕÚÜáâãàçéêíóôõúü\\p{Space}]*$")) {
					System.out.println();
					System.out.println("\t\t\t\t[O campo nome nao deve conter caracteres especiais ou numeros]");
					System.out.println();
					valido = false;
				} else {
					valido = true;
				}
			}
			if (valido == true) {
				return nome;
			}
		}
		return nome = null;
	}

	/**
	 * Este metodo e responsavel por verificar se na string a somente um char "m" ou
	 * "f"
	 * 
	 * @return String
	 */
	public static String trataEntradaSexo() {
		String sexo;
		boolean valido = false;

		while (!valido) {
			sexo = EntradaDeDados.lerSexo();
			if (sexo.length() < 2 && sexo.equals("m")) {
				valido = true;
				return "Masculino";
			} else if (sexo.length() < 2 && sexo.equals("f")) {
				valido = true;
				return "Feminino";
			} else if (sexo.trim().isEmpty()) {
				System.out.println();
				System.out.println("\t\t\t\t[O campo sexo nao pode ficar em branco]");
				System.out.println();
				valido = false;
			} else {
				System.out.println();
				System.out.println("\t\t\t\t[Por Favor, Digite somente a Primeira Letra]");
				System.out.println();
				valido = false;
			}
		}
		return sexo = null;
	}

	/**
	 * Este metodo e responsavel por validar se a string contem 11 digitos
	 * numericos.
	 * 
	 * @return String
	 */

	public static String trataEntradaCpf() {
		String cpf;
		boolean valido = false;
		char dig10, dig11;
		int sm, i, r, num, peso;

		while (!valido) {
			cpf = EntradaDeDados.lerCpf();
			if (cpf.equals("00000000000") || cpf.equals("11111111111") || cpf.equals("22222222222")
					|| cpf.equals("33333333333") || cpf.equals("44444444444") || cpf.equals("55555555555")
					|| cpf.equals("66666666666") || cpf.equals("77777777777") || cpf.equals("88888888888")
					|| cpf.equals("99999999999")) {
				valido = false;
				System.out.println();
				System.out.println("\t\t\t\t[Formato de Cpf Invalido]");
				System.out.println();
			} else if (cpf.trim().isEmpty()) {
				System.out.println();
				System.out.println("\t\t\t\t[O campo cpf nao pode ficar em branco]");
				System.out.println();
				valido = false;
			} else if (cpf.length() < 11 || cpf.length() > 11) {
				System.out.println();
				System.out.println("\t\t\t\t[O campo cpf deve conter 11 digitos]");
				System.out.println();
				valido = false;
			} else {
				sm = 0;
				peso = 10;
				for (i = 0; i < 9; i++) {
					num = (int) (cpf.charAt(i) - 48);
					sm = sm + (num * peso);
					peso = peso - 1;
				}
				r = 11 - (sm % 11);
				if ((r == 10) || (r == 11)) {
					dig10 = '0';
				} else {
					dig10 = (char) (r + 48);
				}
				sm = 0;
				peso = 11;
				for (i = 0; i < 10; i++) {
					num = (int) (cpf.charAt(i) - 48);
					sm = sm + (num * peso);
					peso = peso - 1;
				}

				r = 11 - (sm % 11);
				if ((r == 10) || (r == 1)) {
					dig11 = '0';
				} else {
					dig11 = (char) (r + 48);
				}
				if ((dig10 == cpf.charAt(9)) && (dig11 == cpf.charAt(10))) {
					return cpf;
				} else {
					System.out.println();
					System.out.println("\t\t\t\t[Formato de Cpf Invalido]");
					System.out.println();
					valido = false;
				}
			}
		}
		return cpf = null;

	}

	/**
	 * Este metodo e responsavel por verificar se na String contem apenas digitos
	 * numericos
	 * 
	 * @return int
	 */

	public static int trataEntradaOpcao() {
		String numero;
		int num = 0;
		boolean valido = false;
		while (!valido) {
			try {
				numero = EntradaDeDados.lerOpcao();
				num = Integer.parseInt(numero);
				valido = true;
			} catch (Exception e) {
				System.out.println();
				System.out.println("\t\t\t\t[Sao validos apenas numeros inteiros!]");
				System.out.println();
			}
		}
		return num;
	}

	/**
	 * Este metodo e responsavel por verificar se na String contem apenas valores
	 * inteiros
	 * 
	 * @return int
	 */
	public static int trataEntradaNumeroConta() {
		String numero;
		int num = 0;
		boolean valido = false;
		while (!valido) {
			try {
				numero = EntradaDeDados.lerNumeroConta();
				num = Integer.parseInt(numero);
				valido = true;
			} catch (Exception e) {
				System.out.println();
				System.out.println("\t\t\t\t[Sao validos apenas numeros inteiros!]");
				System.out.println();
			}
		}
		return num;
	}

	/**
	 * Este metodo e responsavel por verificar se na string contém apenas valores
	 * reais
	 * 
	 * @return float
	 */
	public static float trataEntradaSaldoConta() {
		String numero;
		float num = 0;
		boolean valido = false;
		while (!valido) {
			try {
				numero = EntradaDeDados.lerSaldo();
				num = Float.parseFloat(numero);
				valido = true;
			} catch (Exception e) {
				System.out.println();
				System.out.println("\t\t\t\t[Sao validos apenas valores reais]");
				System.out.println();
			}
		}
		return num;
	}

	/**
	 * Este metodo e responsavel por verificar se na String a somente digitos
	 * inteiros
	 * 
	 * @return int
	 */
	public static String trataEntradaSenhaConta() {
		String numero;
		boolean valido = false;
		while (!valido) {
			numero = EntradaDeDados.lerSenha();
			if (numero.trim().isEmpty()) {
				System.out.println();
				System.out.println("\t\t\t\t[O campo senha de login nao pode ficar em branco]");
				System.out.println();
				valido = false;
			} else if (numero.length() < 8) {
				System.out.println();
				System.out.println("\t\t\t\t[O campo senha de login deve conter no minimo 8 caracteres]");
				System.out.println();
				valido = false;
			} else {
				return numero;
			}
			/*
			 * try { numero = EntradaDeDados.lerSenhaConta(); num =
			 * Integer.parseInt(numero); valido = true; } catch (Exception e) {
			 * System.out.println();
			 * System.out.println("\t\t\t\t[Sao validos apenas numeros inteiros]");
			 * System.out.println(); }
			 */
		}
		return numero = null;
	}

	/**
	 * Este metodo e responsavel por verificar se um numero de telefone e valido
	 * 
	 * @return String
	 */
	public static String trataEntradaTelefone() {
		String telefone;
		boolean valido = false;
		while (!valido) {

			telefone = EntradaDeDados.lerTelefoneCelular();
			if (!telefone.equals("")) {
				if (telefone.matches("\\(\\d{2}\\)\\d{4,5}-\\d{4}") || telefone.matches("\\d{4,5}-\\d{4}")) {
					valido = true;
					return telefone;
				} else {
					System.out.println();
					System.out.println("\t\t\t\t[Formato de Telefone Incorreto]");
					System.out.println();
				}
			} else if (telefone.trim().isEmpty()) {
				System.out.println();
				System.out.println("\t\t\t\t[O campo telefone nao pode ficar em branco]");
				System.out.println();
				valido = false;
			}
		}
		return telefone = null;
	}

	/**
	 * Este metodo e responsavel por validar um email
	 * 
	 * @return String
	 */
	public static String trataEntradaEmail() {
		String email;
		boolean valido = false;
		while (!valido) {
			email = EntradaDeDados.lerEmail();
			if (!email.equals("")) {
				if (email.matches("^[\\w-]+(\\.[\\w-]+)*@([\\w-]+\\.)+[a-zA-Z]{2,7}$")) {
					valido = true;
					return email;
				} else {
					System.out.println();
					System.out.println("\t\t\t\t[Formato de E-mail Incorreto]");
					System.out.println();
				}
			} else if (email.trim().isEmpty()) {
				System.out.println();
				System.out.println("\t\t\t\t[O campo email nao pode ficar em branco]");
				System.out.println();
				valido = false;
			}
		}
		return email = null;
	}

	/**
	 * Este metodo e responsavel por validar se um valor contem somente valores
	 * reais
	 * 
	 * @return float
	 */
	public static float trataValorTransacao() {
		String valor;
		float num = 0;
		boolean valido = false;
		while (!valido) {
			try {
				valor = EntradaDeDados.lerValorTransacao();
				num = Float.parseFloat(valor);
				valido = true;
			} catch (Exception e) {
				System.out.println();
				System.out.println("\t\t\t\t[Sao validos apenas valores reais]");
				System.out.println();
			}
		}
		return num;
	}

	/**
	 * Este metodo e responsavel por validar se a senha da conta bancaria contem 6
	 * digitos, sem espaco e somente valores inteiros.
	 * 
	 * @return String
	 */
	public static String trataEntradaSenhaContaBancaria() {
		String numero;
		int num;
		boolean valido = false;
		while (!valido) {
			numero = EntradaDeDados.lerSenhaConta();
			if (numero.trim().isEmpty()) {
				System.out.println();
				System.out.println("\t\t\t\t[O campo senha da conta nao pode ficar em branco]");
				System.out.println();
				valido = false;
			} else if (numero.length() < 6) {
				System.out.println();
				System.out.println("\t\t\t\t[O campo senha da conta deve conter no minimo 6 digitos]");
				System.out.println();
				valido = false;
			} else {
				Pattern pattern = Pattern.compile("\\s");
				Matcher matcher = pattern.matcher(numero);
				if (matcher.find()) {
					System.out.println();
					System.out.println("\t\t\t\t[O campo senha da conta nao pode conter espaco em branco]");
					System.out.println();
					valido = false;
				} else {
					try {
						num = Integer.parseInt(numero);
						valido = true;
						return String.valueOf(num);
					} catch (Exception e) {
						System.out.println();
						System.out.println("\t\t\t\t[Sao validos apenas numeros inteiros!]");
						System.out.println();
					}

				}
			}
		}
		return numero = null;
	}
}
