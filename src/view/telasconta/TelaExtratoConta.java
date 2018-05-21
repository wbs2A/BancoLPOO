package view.telasconta;

import controller.ContaDAO;
import model.Conta;
import view.ExecoesDeEntrada;

public class TelaExtratoConta {

    public static void extratoConta() {
        Conta conta;
        System.out.println();
        System.out.println("\t\t\t*******************************************************");
        System.out.println("\t\t\t*\t           CPAN BANCO CENTER                  *");
        System.out.println("\t\t\t*******************************************************");
        System.out.println("\t\t\t\t\n\t\t\t\t");
        System.out.println("\t\t\t\t****************************************");
        System.out.println("\t\t\t\t*   EXTRATO DE CONTA(S) BANCARIA(S)    *");
        System.out.println("\t\t\t\t****************************************");
        System.out.println("\t\t\t\t ");
        //System.out.println();
        //System.out.println("\t\t\t\t       Confirme sua Identidade          ");
        //System.out.println();
        //pessoa = Login.validaLogin(ExecoesDeEntrada.trataEntradaCpf(), EntradaDeDados.lerSenha());

        //if(pessoa != null) {
        conta = ContaDAO.consultaConta(TratamentodeEntradas.trataEntradaNumeroConta(), TratamentodeEntradas.trataEntradaSenhaConta());
        if (conta != null) {
            System.out.println();
            System.out.println(conta.getMovimentacoes());
            System.out.println();
        } else {
            System.out.println();
            System.out.println("\t\t\t\t[Conta não encontrada]");
            System.out.println();
        }
        //}else {
        //System.out.println();
        //System.out.println("\t\t\t\t[Usuario e/ou senha incorreto(s)]");
        //System.out.println();
        //}

    }
}
