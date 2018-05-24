package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Classe responsável por tratar todas as entradas de dados na view. 
 * 
 * @author michael_douglas
 *
 */
public class TratamentodeEntradas {

	/**
	 * Este metodo trata a entrada data de nascimento e retorna essa data no formato dd/MM/yyyy 
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
                format.setLenient(false);
                data = (Date) format.parse(dataTexto);
                success = true;
                return data;
            } catch (ParseException e) {
                System.out.println();
                System.out.println("\t\t\t\t[Formato de Data Invalida]");
                System.out.println();
            }
        }
        return data;
    }
    
    
    /**
     * Este metodo e responsavel por verificar se uma string contem caracteres do tipo char 
     * @return String
     */
    
    public static String trataEntradaNome() {
        String nome;
        boolean valido = false;

        while (!valido) {
            nome = EntradaDeDados.lerNome();
            for (int i = 0; i < nome.length(); i++) {
                if (!Character.isAlphabetic((nome.charAt(i)))) {
                    valido = false;
                    break;
                } else {
                    valido = true;
                }
            }
            if (valido == true) {
                return nome;
            } else {
                System.out.println();
                System.out.println("\t\t\t\t[Formato de Nome Invalido]");
                System.out.println();
            }
        }
        return nome = null;
    }

    /**
     * Este metodo e responsavel por verificar se na string a somente um char "m" ou "f" 
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
     * Este metodo e responsavel por validar se a string contém 11 digitos numericos. 
     * @return String
     */
    
    public static String trataEntradaCpf() {
        String cpf;
        boolean valido = false;

        while (!valido) {
            cpf = EntradaDeDados.lerCpf();
            if (cpf.length() != 11 || cpf.equals("00000000000")) {
                valido = false;
                System.out.println();
                System.out.println("\t\t\t\t[Formato de Cpf Invalido]");
                System.out.println();
            } else {
                for (int i = 0; i < cpf.length(); i++) {
                    if (!Character.isDigit(cpf.charAt(i))) {
                        valido = false;
                        break;
                    } else {
                        valido = true;
                    }
                }
                if (valido == true) {
                    return cpf;
                }
            }
        }
        return cpf = null;
    }
    
    /**
     * Este metodo e responsavel por verificar se na String contém apenas digitos numericos
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
                System.out.println("\t\t\t\t[Só é válido numeros inteiros!]");
                System.out.println();
            }
        }
        return num;
    }

    /**
     * Este metodo e responsavel por verificar se na String contém apenas valores inteiros
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
                System.out.println("\t\t\t\t[Só é válido numeros inteiros!]");
                System.out.println();
            }
        }
        return num;
    }

    /**
     * Este metodo e responsavel por verificar se na string contém apenas valores reais
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
                System.out.println("\t\t\t\t[Só é válido valores reais]");
                System.out.println();
            }
        }
        return num;
    }
    
    /**
     * Este metodo e responsavel por verificar se na String a somente digitos inteiros
     * @return int
     */
    public static int trataEntradaSenhaConta() {
        String numero;
        int num = 0;
        boolean valido = false;
        while (!valido) {
            try {
                numero = EntradaDeDados.lerSenhaConta();
                num = Integer.parseInt(numero);
                valido = true;
            } catch (Exception e) {
                System.out.println();
                System.out.println("\t\t\t\t[Só é válido numeros inteiros]");
                System.out.println();
            }
        }
        return num;
    }

    /**
     * Este metodo e responsavel por verificar se um numero de telefone e valido
     * @return String
     */
    public static String trataEntradaTelefone() {
        String telefone;
        boolean valido = false;
        while (!valido) {
            try {
                telefone = EntradaDeDados.lerTelefoneCelular();
                if (telefone.matches("\\(\\d{2}\\)\\d{4,5}-\\d{4}")) {
                    valido = true;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println();
                System.out.println("\t\t\t\t[Formato de Telefone Incorreto]");
                System.out.println();
            }
        }
        return telefone = null;
    }

    /**
     * Este metodo e responsavel por validar um email
     * @return String
     */
    public static String trataEntradaEmail() {
        String email;
        boolean valido = false;
        while (!valido) {
            try {
                email = EntradaDeDados.lerEmail();
                if (email.matches("^[\\w-]+(\\.[\\w-]+)*@([\\w-]+\\.)+[a-zA-Z]{2,7}$")) {
                    valido = true;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println();
                System.out.println("\t\t\t\t[Formato de E-mail Incorreto]");
                System.out.println();
            }
        }
        return email = null;
    }
}