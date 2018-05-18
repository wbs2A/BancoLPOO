package view.telasconta;

import java.util.ArrayList;

import controller.SessaoConta;
import model.Conta;
import model.Pessoa;

public class TelaConsultaConta {
	public static void consultaConta() {
		ArrayList<Conta> contas = new ArrayList<Conta>();
		Pessoa pessoa;
		
		System.out.println();
		System.out.println("\t\t\t*******************************************************");
	    System.out.println("\t\t\t*\t           CPAN BANCO CENTER                  *");
		System.out.println("\t\t\t*******************************************************");
		System.out.println("\t\t\t\t\n\t\t\t\t");
		System.out.println("\t\t\t\t****************************************");
        System.out.println("\t\t\t\t*    CONSULTA CONTA(S) BANCARIA(S)     *");
        System.out.println("\t\t\t\t****************************************");
        System.out.println("\t\t\t\t ");
        System.out.println();
		pessoa = SessaoConta.getPessoa();
		contas = pessoa.getContas();
		
   		if(contas != null) {
   			for(Conta contaspessoa: contas) {
   				System.out.println(contaspessoa);
   				System.out.println();
   			}	
   		}else {
   			System.out.println();
   			System.out.println("\t\t\t\t[Você não possui nenhuma conta bancaria]");
    		System.out.println();
    	}
        
	}
}