package view.telasconta;

/**
 * Classe responsavel por disponibilizar as opcoes do Enum MenuDeposito
 *
 * @author Michael Douglas
 * @author Joao Gabriel
 * @author Joao Victor
 * @author Adler Cavalcante
 */
public enum MenuDeposito {
    DEPOSITARCONTAPADRAO(1), DEPOSITAROUTRACONTA(2), SAIR(0);

    int opcao;

    /**
     *
     * @param op
     */
    MenuDeposito(int op) {
        this.opcao = op;
    }

    /**
     * Metodo para retorno da opcao escolhida
     *
     * @param opcao int - Valor da opcao escolhida
     * @return enum opcao - Opcao com o nome correspondente
     */
    public static MenuDeposito menuOpcao(int opcao) {
        if (opcao == 1) {
            return MenuDeposito.DEPOSITARCONTAPADRAO;
        } else if (opcao == 2) {
            return MenuDeposito.DEPOSITAROUTRACONTA;
        } else if (opcao == 0) {
            return MenuDeposito.SAIR;
        }
        return null;
    }
}
