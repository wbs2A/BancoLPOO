package view.telaspessoa;

import controller.PessoaDAO;
import view.EntradaDeDados;
import view.ExecoesDeEntrada;

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
        
        cpf = ExecoesDeEntrada.trataEntradaCpf();
          
        
        if(PessoaDAO.consultaPessoaTrue(cpf) == false) {
        	PessoaDAO.criarPessoa(ExecoesDeEntrada.trataEntradaNome(), ExecoesDeEntrada.trataEntradaDtNasc(), ExecoesDeEntrada.trataEntradaSexo(), cpf, EntradaDeDados.lerSenha());
        	PessoaDAO.salvarPessoas();
        	System.out.println();
   			System.out.println("\t\t\t\t[Cadastro feito com sucesso]");
    		System.out.println();
        }else {
        	System.out.println();
   			System.out.println("\t\t\t\t[CPF não esta disponivel]");
    		System.out.println();
        }
	}
}
