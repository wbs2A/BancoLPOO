package view.telaspessoa;

import view.ClearConsole;
import view.TratamentodeEntradas;

/**
 * Classe responsavel por disponibilizar a tela que ira oferecer as opcoes
 * atualizar dados de cadastro,excluir conta,mostrar dados cadastrados pessoa e
 * ajuda.
 *
 * @author Adler Cavalcante
 * @author Joao Gabriel
 * @author Joao Victor
 * @author Michael Douglas
 */
public class TelaGerenciaPessoa {

    /**
     * Metodo para impressao da tela para gerenciar dados de cadastro e receber
     * a opcao que o usuario escolher
     */
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
                System.out.println("\t\t\t\t*    GERENCIAR DADOS DE CADASTRO     *");
                System.out.println("\t \t\t\t**************************************");
                System.out.println("\t\t\t\t\n\t\t\t\t");
                System.out.println("\t\t\t\t**************************************");
                System.out.println("\t\t\t\t*   " + MenuPessoa.ATUALIZARDADOS.opcao + ". Atualizar Dados de Cadastro   *");
                System.out.println("\t\t\t\t**************************************");
                System.out.println("\t\t\t\t*   " + MenuPessoa.EXLUCIRPESSOA.opcao + ". Excluir Conta                 *");
                System.out.println("\t\t\t\t**************************************");
                System.out.println("\t\t\t\t*   " + MenuPessoa.VERDADOSPESSOA.opcao + ". Mostrar dados Cadastrados     *");
                System.out.println("\t\t\t\t**************************************");
                System.out.println("\t\t\t\t*   " + MenuPessoa.AJUDA.opcao + ". Ajuda                         *");
                System.out.println("\t\t\t\t**************************************");
                System.out.println("\t\t\t\t*   " + MenuPessoa.SAIR.opcao + ". Voltar                        *");
                System.out.println("\t\t\t\t**************************************");

                opcao = TratamentodeEntradas.trataEntradaOpcao();

                switch (MenuPessoa.menuOpcao(opcao)) {
                    case ATUALIZARDADOS:
                        TelaAtualizaDadosPessoa.formularioAtualizaCadastro();
                        break;

                    case EXLUCIRPESSOA:
                        TelaExcluiPessoa.menuExcluirPessoa();
                        break;

                    case VERDADOSPESSOA:
                        TelaConsultaDadosPessoa.menuConsultadoDadosPessoa();
                        break;
                    case AJUDA:
                        TelaAjudaPessoa.AjudaPessoa();
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
