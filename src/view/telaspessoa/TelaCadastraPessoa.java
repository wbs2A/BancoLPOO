package view.telaspessoa;

import controller.PessoaDAO;
import view.EntradaDeDados;
import view.TratamentodeEntradas;

public class TelaCadastraPessoa {

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
