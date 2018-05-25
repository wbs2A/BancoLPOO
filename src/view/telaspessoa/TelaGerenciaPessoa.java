package view.telaspessoa;

import view.ClearConsole;
import view.TratamentodeEntradas;

public class TelaGerenciaPessoa {
<<<<<<< HEAD
	
	public static void menuGerenciaPessoas(){
		int opcao;
		boolean sair = false;
		
		do {
			try {
				new ClearConsole();
				System.out.println();
				System.out.println("\t\t\t*******************************************************");
				System.out.println("\t\t\t*\t           CPAN BANCO CENTER                  *");
				System.out.println("\t\t\t*******************************************************");
				System.out.println("\t\t\t\t\n\t\t\t\t");
				System.out.println("\t \t\t\t**************************************");
				System.out.println("\t\t\t\t*    GERENCIAR DADOS DE CADASTRO      *");
				System.out.println("\t \t\t\t**************************************");
				System.out.println("\t\t\t\t\n\t\t\t\t");
				System.out.println("\t\t\t\t**************************************");
				System.out.println("\t\t\t\t*   "+MenuPessoa.ATUALIZARDADOS.opcao+". Atualizar Dados de Cadastro   *");
				System.out.println("\t\t\t\t**************************************");
				System.out.println("\t\t\t\t*   "+MenuPessoa.EXLUCIRPESSOA.opcao". Excluir Conta                 *");
				System.out.println("\t\t\t\t**************************************");
				System.out.println("\t\t\t\t*   "+MenuPessoa.SAIR+". Voltar                          *");
				System.out.println("\t\t\t\t**************************************");
		        opcao = ExecoesDeEntrada.trataEntradaOpcao();
		        
		        switch(MenuPessoa.menuOpcao(opcao)){
		        	case ATUALIZARDADOS:
		        		TelaAtualizaDadosPessoa.formularioAtualizaCadastro();
		        		break;
		        	
		        	case EXLUCIRPESSOA:
		        		TelaExcluiPessoa.menuExcluirPessoa();
		        		break;
		        	
		        	case SAIR:
		        		sair = true;
		        		break;
		        }
			}catch(Exception e) {
				System.out.println();
				System.out.println("\t\t\t\tOpcao Invalida!");
				System.out.println();
			}
		}while(!sair);
	}
}
=======

    public static void menuGerenciaPessoas() {
        int opcao;
        boolean sair = false;

        do {
            try {
                new ClearConsole();
                System.out.println();
                System.out.println("\t\t\t*******************************************************");
                System.out.println("\t\t\t*\t           CPAN BANCO CENTER                  *");
                System.out.println("\t\t\t*******************************************************");
                System.out.println("\t\t\t\t\n\t\t\t\t");
                System.out.println("\t \t\t\t**************************************");
                System.out.println("\t\t\t\t*    GERENCIAR DADOS DE CADASTRO      *");
                System.out.println("\t \t\t\t**************************************");
                System.out.println("\t\t\t\t\n\t\t\t\t");
                System.out.println("\t\t\t\t**************************************");
                System.out.println("\t\t\t\t*   1. Atualizar Dados de Cadastro   *");
                System.out.println("\t\t\t\t**************************************");
                System.out.println("\t\t\t\t*   2. Excluir Conta                 *");
                System.out.println("\t\t\t\t**************************************");
                System.out.println("\t\t\t\t*   0. Voltar                          *");
                System.out.println("\t\t\t\t**************************************");
                opcao = TratamentodeEntradas.trataEntradaOpcao();

                switch (MenuPessoa.menuOpcao(opcao)) {
                    case ATUALIZARDADOS:
                        TelaAtualizaDadosPessoa.formularioAtualizaCadastro();
                        break;

                    case EXLUCIRPESSOA:
                        TelaExcluiPessoa.menuExcluirPessoa();
                        break;

                    case SAIR:
                        sair = true;
                        break;
                }
            } catch (Exception e) {
                System.out.println();
                System.out.println("\t\t\t\tOpcao Invalida!");
                System.out.println();
            }
        } while (!sair);
    }
}
>>>>>>> 84556cf0b193c18f1b64b2077c9955e9108d91d1
