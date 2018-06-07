package view.telaspessoa;

import controller.ContaDAO;
import controller.Controller;
import controller.PessoaDAO;
import view.ClearConsole;
import view.EntradaDeDados;
import view.TratamentodeEntradas;
import view.comum.TelaInicial;

/**
 * A Classe TelaExcluirPessoa e responsavel por disponibilizar a tela que ira
 * oferecer as opcaoes de exclusao de conta
 *
 * @author Adler Cavalcante
 * @author Joao Gabriel
 * @author Joao Victor
 * @author Michael Douglas
 */
public class TelaExcluiPessoa {

    /**
     * Metodo para impressao da tela excluirconta e receber a opcao escolhida
     * pelo usuario
     */
    public static void menuExcluirPessoa() {
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
                System.out.println("\t\t\t\t*            EXCLUIR CONTA           *");
                System.out.println("\t \t\t\t**************************************");
                System.out.println();
                System.out.println("\t\t\t\t  Deseja realmente excluir sua Conta?  ");
                System.out.println("\t\t\t Ao excluir, seus dados serao perdidos permanentemente");
                System.out.println("\t\t\t Todas as suas Contas Bancarias tambem serao perdidas");
                System.out.println();
                System.out.println("\t\t\t\t**************************************");
                System.out.println("\t\t\t\t*    (" + MenuExcluirConta.NAO.opcao + ")Nao                          *");
                System.out.println("\t\t\t\t**************************************");
                System.out.println("\t\t\t\t*    (" + MenuExcluirConta.SIM.opcao + ")Sim                          *");
                System.out.println("\t\t\t\t**************************************");
                System.out.println("\t\t\t\t\n\t\t\t\t");
                opcao = TratamentodeEntradas.trataEntradaOpcao();

                switch (MenuExcluirConta.menuConfirma(opcao)) {
                    case NAO:
                        sair = true;
                        break;

                    case SIM:
                        System.out.println();
                        System.out.println("\t\t\t\t        Confirme sua Senha de Login        ");
                        System.out.println();
                        if (Controller.getSessao().getSenha().equals(EntradaDeDados.lerSenha())) {
                            System.out.println();
                            Controller.removerPessoa(Controller.getSessao());
                            System.out.println();
                            System.out.println("\t\t\t\t[Conta Excluida com sucesso]");
                            System.out.println();
                            PessoaDAO.salvarPessoas();
                            ContaDAO.salvarContas();
                            TelaInicial.telaInicial();
                            sair = true;
                        } else {
                            System.out.println();
                            System.out.println("\t\t\t\t[Senha Incorreta]");
                            System.out.println();
                        }
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
