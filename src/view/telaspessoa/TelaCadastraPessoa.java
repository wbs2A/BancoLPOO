package view.telaspessoa;

import controller.Controller;
import controller.PessoaDAO;
import view.TratamentodeEntradas;

/**
 * A Classe TelaCadastraPessoa e responsavel por disponibilizar a informacao do
 * status do cadastro do cpf
 *
 * @author Adler Cavalcante
 * @author Joao Gabriel
 * @author Joao Victor
 * @author Michael Douglas
 */
public class TelaCadastraPessoa {

    /**
     * Metodo para a comparacao e impressao do status de cadastro do cpf
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

        if (PessoaDAO.read(cpf) == null) {
            Controller.criarPessoa(TratamentodeEntradas.trataEntradaNome(), TratamentodeEntradas.trataEntradaSenhaConta(), cpf,
                    TratamentodeEntradas.trataEntradaDtNasc(), TratamentodeEntradas.trataEntradaSexo(),
                    TratamentodeEntradas.trataEntradaTelefone(), TratamentodeEntradas.trataEntradaEmail());
            System.out.println();
            System.out.println("\t\t\t\t[Cadastro feito com sucesso]");
            System.out.println();
            PessoaDAO.salvarPessoas();
        } else {
            System.out.println();
            System.out.println("\t\t\t\t[CPF não esta disponivel]");
            System.out.println();
        }
    }
}
