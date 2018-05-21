package view.telasconta;

import java.util.Date;

import controller.Banco;
import controller.ContaDAO;
import controller.Transacao;
import model.Conta;
import view.ClearConsole;
import view.ExecoesDeEntrada;

public class TelaTransacaoSaque {

    public static void menuSaque() {
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
                System.out.println("\t\t\t\t*                SAQUE                *");
                System.out.println("\t \t\t\t**************************************");
                System.out.println("\t\t\t\t\n\t\t\t\t");
                System.out.println("\t \t\t\t**************************************");
                System.out.println("\t\t\t\t*   " + MenuSaque.SACARCONTAPADRAO.opcao + ".Sacar da Conta Padrao    *");
                System.out.println("\t\t\t\t***************************************");
                System.out.println("\t\t\t\t*   " + MenuSaque.SACAROUTRACONTA.opcao + ".Sacar de Outra Conta    *");
                System.out.println("\t\t\t\t***************************************");
                System.out.println("\t\t\t\t*   " + MenuSaque.SAIR.opcao + ".Voltar    *");
                System.out.println("\t\t\t\t***************************************");
                opcao = TratamentodeEntradas.trataEntradaOpcao();

                switch (MenuSaque.menuOpcao(opcao)) {
                    case SACARCONTAPADRAO:
                        break;

                    case SACAROUTRACONTA:
                        System.out.println();
                        System.out.println("\t\t\t\tInforme o numero da conta para saque: ");
                        System.out.println();
                        conta = ContaDAO.consultaConta(TratamentodeEntradas.trataEntradaNumeroConta(), TratamentodeEntradas.trataEntradaSenhaConta());

                        if (conta != null) {
                            valor = TratamentodeEntradas.trataEntradaSaldoConta();
                            Transacao.realizarTransacao(new Date(), conta, "Saque de Conta", valor, Banco.SACAR);
                            //Banco.saque(conta, valor);
                            //System.out.println();
                            //System.out.println("\t\t\t\t[Saque realizado com sucesso]");
                            System.out.println();
                        } else {
                            System.out.println();
                            System.out.println("\t\t\t\t[Conta não Encontrada]");
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
