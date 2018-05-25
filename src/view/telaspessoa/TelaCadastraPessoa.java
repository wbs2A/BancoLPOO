package view.telaspessoa;

import controller.PessoaDAO;
import view.EntradaDeDados;
import view.TratamentodeEntradas;

/**
 * Classe responsavel por disponibilizar a informacao do status do cadastro do cpf
 *
 * @author Michael Douglas
 * @author Joao Gabriel
 * @author Joao Victor
 * @author Adler Cavalcante
 */
public class TelaCadastraPessoa {
	

    /**
     * Metodo para a comparacao e  impressao do status de cadastro do cpf
     */

    public static void formularioCadastroPessoa() {
        String cpf;
        System.out.println();
        System.out.println("\t\t\t*******************************************************");
        System.out.println("\t\t\t*\t           CPAN BANCO CENTER                  *");
        System.out.println("\t\t\t*******************************************************");
        System.out.println("\t\t\t\t\n\t\t\t\t");
        System.out.println("\t\t\t\t****************************************");
        System.out.println("\t\t\t\t*               CADASTRO               *");
        System.out.println("\t\t\t\t****************************************");
        System.out.println("\t\t\t\t ");

        cpf = TratamentodeEntradas.trataEntradaCpf();

        if (PessoaDAO.consultaPessoaTrue(cpf) == false) {
            PessoaDAO.criarPessoa(TratamentodeEntradas.trataEntradaNome(), TratamentodeEntradas.trataEntradaDtNasc(), TratamentodeEntradas.trataEntradaSexo(), cpf, EntradaDeDados.lerSenha());
            PessoaDAO.salvarPessoas();
            System.out.println();
            System.out.println("\t\t\t\t[Cadastro feito com sucesso]");
            System.out.println();
        } else {
            System.out.println();
            System.out.println("\t\t\t\t[CPF não esta disponivel]");
            System.out.println();
        }
    }
}
