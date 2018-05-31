package banco;

import controller.ContaDAO;
import controller.PessoaDAO;
import view.comum.TelaInicial;

public class Main{

    public static void main(String[] args){
    	PessoaDAO.carregarPessoas();
    	ContaDAO.carregarContas();
    	
        TelaInicial.telaInicial();
    
        PessoaDAO.salvarPessoas();
        ContaDAO.salvarContas();
    }
}