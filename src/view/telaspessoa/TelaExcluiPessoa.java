package view.telaspessoa;

import controller.ContaDAO;
import controller.Login;
import controller.PessoaDAO;
import model.Pessoa;
import view.ClearConsole;
import view.EntradaDeDados;
import view.TratamentodeEntradas;


/**
 * Classe responsavel por disponibilizar a tela que ira oferecer as opcaoes de exclusao de conta 
 *
 * @author Michael Douglas
 * @author Joao Gabriel
 * @author Joao Victor
 * @author Adler Cavalcante
 */


public class TelaExcluiPessoa {
<<<<<<< HEAD
/**
 * Metodo para impressao da tela excluirconta e receber a opcao escolhida pelo usuario
 */
	public static void menuExcluirPessoa() {
		int opcao;
		boolean sair = false;
		Pessoa pessoa;
		
		System.out.println();
		System.out.println("\t\t\t\t          Confirme sua Identidade                ");
		pessoa = Login.validaLogin(ExecoesDeEntrada.trataEntradaCpf(), EntradaDeDados.lerSenha());
		
		if(pessoa != null) {
			do {
				try {
					new ClearConsole();
					System.out.println();
					System.out.println("\t\t\t*******************************************************");
					System.out.println("\t\t\t*\t           CPAN BANCO CENTER                  *");
					System.out.println("\t\t\t*******************************************************");
					System.out.println("\t\t\t\t\n\t\t\t\t");
					System.out.println("\t \t\t\t**************************************");
					System.out.println("\t\t\t\t*            EXCLUIR CONTA           *");
					System.out.println("\t \t\t\t**************************************");
					System.out.println();
					System.out.println("\t\t\t\t  Deseja realmente excluir sua Conta?  ");
					System.out.println("\t\t\tAo excluir, seus dados serão perdidos permanentemente");
					System.out.println("\t\t\t  Todas as suas Contas Bancarias também serão perdidas");
					System.out.println();
					System.out.println("\t \t\t\t**************************************");
					System.out.println("\t\t\t\t*    ("+MenuExcluirConta.NAO.opcao+")Não                *");
					System.out.println("\t\t\t\t**************************************");
					System.out.println("\t\t\t\t*    ("+MenuExcluirConta.SIM.opcao+")Sim                *");
					System.out.println("\t\t\t\t**************************************");
					System.out.println("\t\t\t\t\n\t\t\t\t");
					opcao = ExecoesDeEntrada.trataEntradaOpcao();
					
					switch(MenuExcluirConta.menuConfirma(opcao)) {
						case NAO:
							sair = true;
							break;
						
						case SIM:
							PessoaDAO.removerPessoa(pessoa);
							PessoaDAO.salvarPessoas();
							ContaDAO.salvarContas();
							System.out.println();
							System.out.println("\t\t\t\t[Conta Excluida com sucesso]");
							System.out.println();
							System.exit(0);
							sair = true;
							break;
							
					}
			        
				}catch(Exception e) {
					System.out.println();
					System.out.println("\t\t\t\tOpcao Invalida!");
					System.out.println();
				}
			}while(!sair);
		}else{
			System.out.println();
			System.out.println("\t\t\t\t[Usuario e/ou Senha Incorreto(s)]");
			System.out.println();
		}   
	}
=======

    public static void menuExcluirPessoa() {
        int opcao;
        boolean sair = false;
        Pessoa pessoa;

        System.out.println();
        System.out.println("\t\t\t\t          Confirme sua Identidade                ");
        pessoa = Login.validaLogin(TratamentodeEntradas.trataEntradaCpf(), EntradaDeDados.lerSenha());

        if (pessoa != null) {
            do {
                try {
                    new ClearConsole();
                    System.out.println();
                    System.out.println("\t\t\t*******************************************************");
                    System.out.println("\t\t\t*\t           CPAN BANCO CENTER                  *");
                    System.out.println("\t\t\t*******************************************************");
                    System.out.println("\t\t\t\t\n\t\t\t\t");
                    System.out.println("\t \t\t\t**************************************");
                    System.out.println("\t\t\t\t*            EXCLUIR CONTA           *");
                    System.out.println("\t \t\t\t**************************************");
                    System.out.println();
                    System.out.println("\t\t\t\t  Deseja realmente excluir sua Conta?  ");
                    System.out.println("\t\t\tAo excluir, seus dados serão perdidos permanentemente");
                    System.out.println("\t\t\t  Todas as suas Contas Bancarias também serão perdidas");
                    System.out.println();
                    System.out.println("\t \t\t\t**************************************");
        			System.out.println("\t\t\t\t*   ("+MenuExcluirConta.NAO.opcao+")Não                *");
                    System.out.println("\t\t\t\t**************************************");
                    System.out.println("\t\t\t\t*   ("+MenuExcluirConta.SIM.opcao+")Sim                *");
                    System.out.println("\t\t\t\t**************************************");
                    System.out.println("\t\t\t\t\n\t\t\t\t");
                    opcao = TratamentodeEntradas.trataEntradaOpcao();

                    switch (MenuExcluirConta.menuConfirma(opcao)) {
                        case NAO:
                            sair = true;
                            break;

                        case SIM:
                            PessoaDAO.removerPessoa(pessoa);
                            PessoaDAO.salvarPessoas();
                            ContaDAO.salvarContas();
                            System.out.println();
                            System.out.println("\t\t\t\t[Conta Excluida com sucesso]");
                            System.out.println();
                            System.exit(0);
                            sair = true;
                            break;

                    }

                } catch (Exception e) {
                    System.out.println();
                    System.out.println("\t\t\t\tOpcao Invalida!");
                    System.out.println();
                }
            } while (!sair);
        } else {
            System.out.println();
            System.out.println("\t\t\t\t[Usuario e/ou Senha Incorreto(s)]");
            System.out.println();
        }
    }
>>>>>>> 84556cf0b193c18f1b64b2077c9955e9108d91d1
}
