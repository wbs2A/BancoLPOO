package view.telasconta;

/**
 * Classe responsavel por disponiblizar uma tela de ajuda ao usuario, que mostra
 * o que cada opcao do menu Gerenciar Conta faz.
 *
 * @author Joao Gabriel
 * @author Adler Cavalcante
 * @author Joao Victor
 * @author Michael Douglas
 */
public class TelaAjudaConta {

    /**
     * O metodo AjudaConta e uma tela onde cada opcao do menu Gerenciar Conta e
     * descrita, mostrando ao usuario de que maneira ela funciona e quais os
     * dados que devem ser inseridos.
     */
    public static void AjudaConta() {
        System.out.println();
        System.out.println("\t\t\t*******************************************************");
        System.out.println("\t\t\t*\t           CPAN BANCO CENTER                  *");
        System.out.println("\t\t\t*******************************************************");
        System.out.println("\t\t\t\t\n\t\t\t\t");
        System.out.println("\t \t\t\t**************************************");
        System.out.println("\t\t\t\t*                 AJUDA          *");
        System.out.println("\t \t\t\t**************************************");
        System.out.println("\t\t\t\t\n\t\t\t\t");
        System.out.println("\t\t\t*******************************************************");
        System.out.println("\t\t\t*Opcao 1-Transacao : O banco oferece tres tipos de    *"
        		+ "\n\t\t\t*transacao, sendo elas Saque,Deposito e Transferencia.*"
        		+ "\n\t\t\t*Para realizar uma transacao e necessario ter pelo    *"
        		+ "\n\t\t\t*menos ter uma Conta Padrao ou Outra Conta. Caso      *"
        		+ "\n\t\t\t*escolha Conta Padrao, basta inserir o valor da       *"
        		+ "\n\t\t\t*transacaoo e em seguida inserir a senha.Caso escolha *"
        		+ "\n\t\t\t*Outra Conta, sera necessario inserir o numero e a    *"
        		+ "\n\t\t\t*conta da senha, e em seguida inserir o valor da      *"
        		+ "\n\t\t\t*transacaoo.                                          *");
        System.out.println("\t\t\t*******************************************************");
        System.out.println("\t\t\t*Opcao 2-Exibir Extrato de uma Conta: O banco oferece *"
        		+ "\n\t\t\t*extrato para dois tipos de conta, sendo Extrato da   *"
        		+ "\n\t\t\t*Conta Padrao e o Extrato de Outra Conta. Caso escolha*"
        		+ "\n\t\t\t*Conta Padrao sera mostrado o extrato completo da     *"
        		+ "\n\t\t\t*conta. Caso escolha Outra Conta, e necessario inserir*"
        		+ "\n\t\t\t*o Numero e a Senha da Conta se as credenciais        *"
        		+ "\n\t\t\t*estiverem certas, o extrato da conta sera exibido.   *");
        System.out.println("\t\t\t*******************************************************");
        System.out.println("\t\t\t*Opcao 3-Cadastrar Conta: Para o cadastro de uma Conta*"
        		+ "\n\t\t\t*insira seu CPF e sua Senha, caso as credenciais      *"
        		+ "\n\t\t\t*estejam certas, o banco o Numero da conta, em seguida* "
        		+ "\n\t\t\t*insira uma senha que deseja para a conta.            *");
        System.out.println("\t\t\t*******************************************************");
        System.out.println("\t\t\t*Opcao 4-Excluir Conta: Para a exclusao de uma conta, *"
        		+ "\n\t\t\t*insira o numero e a senha da conta que deseja excluir*"
        		+ "\n\t\t\t*em seguida confirme sua identidade inserindo seu CPF *"
        		+ "\n\t\t\t*e sua Senha, caso as credencias estejam certas e     *"
        		+ "\n\t\t\t*confirme que deseja excluir, a conta sera removida do* "
        		+ "\n\t\t\t*banco. Lembrando que e necessario ter a conta        *"
        		+ "\n\t\t\t*cadastrada no banco para excluir.                    *");
        System.out.println("\t\t\t*******************************************************");
        System.out.println("\t\t\t*Opcao 5-Consultar Conta: A consulta de conta lista   *"
        		+ "\n\t\t\t*todas as contas cadastradas em seu cpf. Sao exibidos *"
        		+ "\n\t\t\t*dados como nome, agencia, numero e saldo da conta.   *");
        System.out.println("\t\t\t*******************************************************");
        System.out.println("\t\t\t*Opcao 6-Definir Conta Padrao: Uma Conta Padrao serve *"
        		+ "\n\t\t\t*para fazer manipulacoes com uma conta de maneira mais*"
        		+ "\n\t\t\t*facil, seja para ver o extrato, fazer transacoes,etc.*"
        		+ "\n\t\t\t*Em todas essas manipulacoes, com a Conta Padrao,     *"
        		+ "\n\t\t\t*basta inserir a senha da conta.                      *");
        System.out.println("\t\t\t*******************************************************");
        System.out.println("\t\t\t*Opcao 7-Atualiza Senha da Conta: Para atualizar a    *"
        		+ "\n\t\t\t*senha de uma conta e necessario escolher o tipo da   *"
        		+ "\n\t\t\t*conta. Caso escolha Conta Padrao, o banco mostrara a *"
        		+ "\n\t\t\t*Senha Atual e pedira a nova Senha que deseja         *"
        		+ "\n\t\t\t*cadastrar. Caso escolha Outra Conta, e necessario    *"
        		+ "\n\t\t\t*inserir o numero e a senha da conta, caso as         *"
        		+ "\n\t\t\t*credenciais esetejam corretas, o banco mostrara a    *"
        		+ "\n\t\t\t*Senha Atual e pedira a nova Senha que deseja         *"
        		+ "\n\t\t\t*cadastrar.                                           *");
        System.out.println("\t\t\t*******************************************************");
        System.out.println("\t\t\t*Opcao 8-Ajuda: Opcao que mostra o que cada opcao no  *"
        		+ "\n\t\t\t*Menu de Gerenciar Conta faz.                         *");
        System.out.println("\t\t\t*******************************************************");
        System.out.println("\t\t\t*Opcao 0-Sair: Sai do Menu de Gerenciar Conta         *"
        		+ "\n\t\t\t*e volta para o Menu Home.                            *");
        System.out.println("\t\t\t*******************************************************");

    }
}
