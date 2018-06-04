package view.telaspessoa;

/**
 * Classe responsavel por disponiblizar uma tela de ajuda ao usuario, que mostra
 * o que cada opcao da tela Gerenciar Dados de Cadastro faz faz.
 *
 * @author Joao Gabriel
 * @author Michael Douglas
 * @author Adler Cavalcante
 * @author Joao Victor
 */
public class TelaAjudaPessoa {

    /**
     * O metodo AjudaPessoa e cria uma tela onde cada opcao do menu Gerenciar
     * Dados de Cadastro e descrita, mostrando ao usuario de que maneira ela
     * funciona e quais os dados que devem ser inseridos.
     */
    public static void AjudaPessoa() {
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
        System.out.println("\t\t\t*Opcao 1-Atualizar dados de cadastro : Opcao que faz a*"
        		+ "\n\t\t\t*atualizacao de seus dados cadastrais. Voce pode      *"
        		+ "\n\t\t\t*escolher para atualizar seu Nome, CPF,Data de        *"
        		+ "\n\t\t\t*Nascimento, Sexo, Senha de Login,Celular e E-mail.   *"
        		+ "\n\t\t\t*Quando uma opcao e escolhida, e mostrado o dado atual*"
        		+ "\n\t\t\t*e pede-se para digitar o novo dado.                  *");
        System.out.println("\t\t\t*******************************************************");
        System.out.println("\t\t\t*Opcao 2-Excluir Pessoa: Opcao que exclui o seu       *"
        		+ "\n\t\t\t*cadastro do banco, com todo os seus dados excluidos, *"
        		+ "\n\t\t\t*assim como todas as suas contas bancarias criadas.   *"
        		+ "\n\t\t\t*Antes de excluir e preciso confirmar se realmente    *"
        		+ "\n\t\t\t*deseja excluir seu cadastro, caso escolha sim basta  *"
        		+ "\n\t\t\t*confirmar sua senha.                                 *");
        System.out.println("\t\t\t*******************************************************");
        System.out.println("\t\t\t*Opcao 3-Mostrar dados Cadastrados Pessoa: Opcao que  *"
        		+ "\n\t\t\t*mostra todos os dados que foram cadastrados. Para ver* "
        		+ "\n\t\t\t*seus dados, basta confirmar sua senha, e todos os    *"
        		+ "\n\t\t\t*seus dados serao exibidos.                           *");
        System.out.println("\t\t\t*******************************************************");
        System.out.println("\t\t\t*Opcao 4-Sair: Opcao que sai do menu Gerenciar Dados  *"
        		+ "\n\t\t\t*de Cadastro.                                         *");
        System.out.println("\t\t\t*******************************************************");
    }
}
