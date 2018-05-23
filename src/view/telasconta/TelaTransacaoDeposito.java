package view.telasconta;

import java.util.Date;

import controller.Banco;
import controller.ContaDAO;
import controller.Transacao;
import model.Conta;
import view.ClearConsole;
import view.TratamentodeEntradas;

public class TelaTransacaoDeposito {

    public static void menuDeposito() {
        int opcao;
        boolean sair = false;
        Conta conta;
        float valor;

        do {
            try {
                new ClearConsole();
                System.out.println();
                System.out.println("\t\t\t*******************************************************");
                System.out.println("\t\t\t*\t           CPAN BANCO CENTER                  *");
                System.out.println("\t\t\t*******************************************************");
                System.out.println("\t\t\t\t\n\t\t\t\t");
                System.out.println("\t \t\t\t**************************************");
                System.out.println("\t\t\t\t*             DEPOSITO                *");
                System.out.println("\t \t\t\t**************************************");
                System.out.println("\t\t\t\t\n\t\t\t\t");
                System.out.println("\t \t\t\t**************************************");
                System.out.println("\t\t\t\t*   " + MenuDeposito.DEPOSITARCONTAPADRAO.opcao + ".Depositar na Conta Padrao    *");
                System.out.println("\t\t\t\t***************************************");
                System.out.println("\t\t\t\t*   " + MenuDeposito.DEPOSITAROUTRACONTA.opcao + ".Depositar em outra Conta    *");
                System.out.println("\t\t\t\t***************************************");
                System.out.println("\t\t\t\t*   " + MenuDeposito.SAIR.opcao + ".Voltar    *");
                System.out.println("\t\t\t\t***************************************");
                opcao = TratamentodeEntradas.trataEntradaOpcao();

                switch (MenuDeposito.menuOpcao(opcao)) {
                    case DEPOSITARCONTAPADRAO:

                        break;

                    case DEPOSITAROUTRACONTA:
                        System.out.println();
                        System.out.printf("\t\t\t\tInforme o numero da conta para deposito: ");
                        System.out.println();
                        conta = ContaDAO.consultaConta(TratamentodeEntradas.trataEntradaNumeroConta());

                        if (conta != null) {
                            valor = TratamentodeEntradas.trataEntradaSaldoConta();
                            Transacao.realizarTransacao(new Date(), conta, "Deposito em Conta", valor, Banco.DEPOSITR);
                            //Banco.deposito(conta, valor);
                            //System.out.println();
                            //System.out.println("\t\t\t\t[Deposito realizado com sucesso]");
                            //System.out.println();
                        } else {
                            //System.out.println();
                            //System.out.println("\t\t\t\t[Conta não encontrada]");
                            System.out.println();
                        }

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
