package view.comum;

/**
 * A Classe TelaAjudaInicial e responsavel por disponiblizar uma tela de ajuda
 * ao usuario, que mostra o que cada opcao da tela Inicial faz.
 *
 * @author Adler Cavalcante
 * @author Joao Gabriel
 * @author Joao Victor
 * @author Michael Douglas
 */
public class TelaAjudaInicial {

	/**
	 * O metodo AjudaPessoa e cria uma tela onde cada opcao do menu Inicial e
	 * descrita, mostrando ao usuario de que maneira ela funciona e quais os dados
	 * que devem ser inseridos.
	 */
	public static void AjudaInicial() {
		System.out.println();
		System.out.println("\t\t\t*******************************************************");
		System.out.println("\t\t\t*\t           CPAN BANCO CENTER                  *");
		System.out.println("\t\t\t*******************************************************");
		System.out.println("\t\t\t\t\n\t\t\t\t");
		System.out.println("\t\t\t\t**************************************");
		System.out.println("\t\t\t\t*                 AJUDA              *");
		System.out.println("\t\t\t\t**************************************");
		System.out.println("\t\t\t\t\n\t\t\t\t");
		System.out.println("\t\t\t*******************************************************");
		System.out.println("\t\t\t*Opcao 1-Login : Opcao que faz o acesso ao banco. Para*"
				+ "\n\t\t\t*acessar o banco, basta inserir o CPF e Senha que     *"
				+ "\n\t\t\t*foram cadastrados.                                   *");
		System.out.println("\t\t\t*******************************************************");
		System.out.println("\t\t\t*Opcao 2-Cadastre-se: Opcao que cria um cadastro para *"
				+ "\n\t\t\t*ter acesso ao banco. Para criar um cadastro e        *"
				+ "\n\t\t\t*necessario preencher os campos requeridos, sao eles: *"
				+ "\n\t\t\t*Nome,Senha,CPF. Data de Nascimento, Sexo,Telefone e  *"
				+ "\n\t\t\t*E-Mail.                                              *");
		System.out.println("\t\t\t*******************************************************");
		System.out.println("\t\t\t*Opcao 3-Ajuda: Opcao que mostra o que cada opcao do  *"
				+ "\n\t\t\t*Menu Inicial faz.                                    *");
		System.out.println("\t\t\t*******************************************************");
		System.out.println("\t\t\t*Opcao 4-Sair: Opcao que fecha a aplicacao            *");
		System.out.println("\t\t\t*******************************************************");
	}
}
