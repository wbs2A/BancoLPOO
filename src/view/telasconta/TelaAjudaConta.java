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
        System.out.println("\t\t\t\t* Opcao 1 - Transacao : O banco oferece tres tipos de transacao, sendo elas Saque,Deposito e Transferencia. Para realizar uma transacao e*");
        System.out.println("\t\t\t\t*                       necessario ter pelo menos ter uma Conta Padrao ou Outra Conta. Caso escolha Conta Padrao, basta inserir o valor da transacaoo ");
        System.out.println("\t\t\t\t*                       e em seguida inserir a senha.Caso escolha Outra Conta, sera necessario inserir o numero e a conta da senha, e em ");
        System.out.println("\t\t\t\t*                       seguida inserir o valor da transacaoo. ");
        System.out.println("\t \t\t\t******************************************************************************************************************************************************");
        System.out.println("\t\t\t\t* Opcao 2 - Exibir Extrato de uma Conta: O banco oferece extrato para dois tipos de conta, sendo Extrato da Conta Padrao e o Extrato de Outra Conta. Caso escolha*");
        System.out.println("\t\t\t\t*                                        Conta Padrao sera mostrado o extrato completo da conta. Caso escolha Outra Conta, e necessario inserir o Numero*");
        System.out.println("\t\t\t\t*                                        e a Senha da Conta se as credenciais estiverem certas, o extrato da conta sera exibido.*");
        System.out.println("\t\t\t\t*******************************************************************************************************************************************************");
        System.out.println("\t\t\t\t* Opcao 3 - Cadastrar Conta: Para o cadastro de uma Conta, insira seu CPF e sua Senha, caso as credenciais estejam certas, o banco ira gerar a Agencia e*");
        System.out.println("\t\t\t\t*                            e Numero da conta,em seguida insira uma senha que deseja para a conta.*");
        System.out.println("\t\t\t\t*******************************************************************************************************************************************************");
        System.out.println("\t\t\t\t* Opcao 4 - Excluir Conta: Para a exclusao de uma conta, insira o numero e a senha da conta que deseja excluir, em seguida confirme sua identidade*");
        System.out.println("\t\t\t\t*                          inserindo seu CPF e sua Senha, caso as credencias estejam certas e confirme que deseja excluir, a conta sera removida do banco. Lembran-*");
        System.out.println("\t\t\t\t*                          do que e necessario ter a conta cadastrada no banco para excluir.*");
        System.out.println("\t\t\t\t*******************************************************************************************************************************************************");
        System.out.println("\t\t\t\t* Opcao 5 - Definir Conta Padrao: Uma Conta Padrao serve para fazer manipulacoes com uma conta de maneira mais facil, seja para ver o extrato, fazer*");
        System.out.println("\t\t\t\t*                                 transacoes,etc. Em todas essas manipulacoes, com a Conta Padrao, basta inserir a senha da conta.*");
        System.out.println("\t\t\t\t******************************************************************************************************************************************************");
        System.out.println("\t\t\t\t* Opcao 6 - Atualiza Senha da Conta: Para atualizar a senha de uma conta e necessario escolher o tipo da conta. Caso escolha Conta Padrao, o banco*");
        System.out.println("\t\t\t\t*                                    mostrara a Senha Atual e pedira a nova Senha que deseja cadastrar. Caso escolha Outra Conta, e necessario inserir o numero e a senha da*");
        System.out.println("\t\t\t\t*                                    conta, caso as credenciais esetejam corretas, o banco mostrara a Senha Atual e pedira a nova Senha que deseja cadastrar.*");
        System.out.println("\t\t\t\t******************************************************************************************************************************************************");
        System.out.println("\t\t\t\t* Opcao 7 - Ajuda: Opcao que mostra o que cada opcao no Menu de Gerenciar Conta faz.*");
        System.out.println("\t\t\t\t******************************************************************************************************************************************************");
        System.out.println("\t\t\t\t* Opcao 8 - Sair: Sai do Menu de Gerenciar Conta e volta para o Menu Home*");
        System.out.println("\t\t\t\t*******************************************************************************************************************************************************");

    }
}
