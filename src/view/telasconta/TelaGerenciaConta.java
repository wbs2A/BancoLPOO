package view.telasconta;

import view.ClearConsole;
import view.ExecoesDeEntrada;

public class TelaGerenciaConta {

    public static void menuGerenciaContas() {
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
                System.out.println("\t\t\t\t*           GERENCIAR CONTA           *");
                System.out.println("\t \t\t\t**************************************");
                System.out.println("\t\t\t\t\n\t\t\t\t");
                System.out.println("\t\t\t\t**************************************");
                System.out.println("\t\t\t\t*   " + MenuConta.REALIZARTRANSACAO.opcao + ".Transacoes                     *");
                System.out.println("\t\t\t\t**************************************");
                System.out.println("\t\t\t\t*   " + MenuConta.EXIBIREXTRATO.opcao + ".Exibir Extrato de uma Conta    *");
                System.out.println("\t\t\t\t**************************************");
                System.out.println("\t\t\t\t*   " + MenuConta.CADASTRARCONTA.opcao + ".Cadastrar Conta                *");
                System.out.println("\t\t\t\t**************************************");
                System.out.println("\t\t\t\t*   " + MenuConta.EXCLUIRCONTA.opcao + ".Excluir Conta                  *");
                System.out.println("\t\t\t\t**************************************");
                System.out.println("\t\t\t\t*   " + MenuConta.CONSULTARCONTA.opcao + ".Consultar Conta(s) em seu Nome *");
                System.out.println("\t\t\t\t**************************************");
                System.out.println("\t\t\t\t*   " + MenuConta.SAIR.opcao + ".Voltar                           *");
                System.out.println("\t\t\t\t**************************************");
                opcao = TratamentodeEntradas.trataEntradaOpcao();

                switch (MenuConta.menuOpcao(opcao)) {
                    case REALIZARTRANSACAO:
                        TelaOpcoesTransacoes.menuTransacoes();
                        break;

                    case EXIBIREXTRATO:
                        TelaExtratoConta.extratoConta();
                        break;

                    case CADASTRARCONTA:
                        TelaCadastraConta.formularioCadastroConta();
                        break;

                    case EXCLUIRCONTA:
                        TelaExcluiConta.menuExcluirConta();
                        break;

                    case CONSULTARCONTA:
                        TelaConsultaConta.consultaConta();
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
