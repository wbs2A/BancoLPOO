package banco;

import controller.ContaDAO;
import controller.PessoaDAO;
import view.comum.TelaInicial;
/*
 * Classe que representa a inicializacao da aplicacao e carregamento e descarregamento de objetos.
 * @author: Nathaly.
 * @author: Wesley B.
 */
public class Main{

    public static void main(String[] args){
    	PessoaDAO.carregarPessoas();
    	ContaDAO.carregarContas();
    	
        TelaInicial.telaInicial();
    
        PessoaDAO.salvarPessoas();
        ContaDAO.salvarContas();
    }
}