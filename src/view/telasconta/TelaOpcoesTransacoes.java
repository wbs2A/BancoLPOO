package view.telasconta;

import view.ClearConsole;
import view.TratamentodeEntradas;

public class TelaOpcoesTransacoes {

    public static void menuTransacoes() {
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
                System.out.println("\t\t\t\t*             TRANSAÇÕES              *");
                System.out.println("\t \t\t\t**************************************");
                System.out.println("\t\t\t\t\n\t\t\t\t");
                System.out.println("\t\t\t\t**************************************");
                System.out.println("\t\t\t\t*   " + MenuTransacoes.REALIZARSAQUE.opcao + ".Realizar Saque                *");
                System.out.println("\t\t\t\t**************************************");
                System.out.println("\t\t\t\t*   " + MenuTransacoes.REALIZARDEPOSITO.opcao + ".Realizar Deposito             *");
                System.out.println("\t\t\t\t**************************************");
                System.out.println("\t\t\t\t*   " + MenuTransacoes.REALIZARTRANSFERENCIA.opcao + ".Realizar Transferencia        *");
                System.out.println("\t\t\t\t**************************************");
                System.out.println("\t\t\t\t*   " + MenuTransacoes.SAIR.opcao + ".Voltar             *");
                System.out.println("\t\t\t\t**************************************");
                opcao = TratamentodeEntradas.trataEntradaOpcao();

                switch (MenuTransacoes.menuOpcao(opcao)) {
                    case REALIZARSAQUE:
                        TelaTransacaoSaque.menuSaque();
                        break;

                    case REALIZARDEPOSITO:
                        TelaTransacaoDeposito.menuDeposito();
                        break;

                    case REALIZARTRANSFERENCIA:
                        TelaTransacaoTransferencia.menuTransferencia();
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
