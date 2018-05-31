package view.telasconta;

/**
 * Classe responsavel por disponiblizar as opcoes do Enum MenuExtratoConta
 *
 * @author Joao Gabriel
 * @author Michael Douglas
 * @author Joao Victor
 * @author Adler Moraes
 */
public enum MenuExtratoConta {
    EXTRATOCONTAPADRAO(1), EXTRATOOUTRACONTA(2), SAIR(0);
    int opcao;

    /**
     *
     * @param op
     */
    MenuExtratoConta(int op) {
        this.opcao = op;

    }

    /**
     * Metodo para retorno da opcao escolhida
     *
     * @param opcao int - Valor da opcao escolhida
     * @return enum opcao - Opcao com o nome correspondente
     */
    public static MenuExtratoConta menuOpcao(int opcao) {
        if (opcao == 1) {
            return MenuExtratoConta.EXTRATOCONTAPADRAO;
        } else if (opcao == 2) {
            return MenuExtratoConta.EXTRATOOUTRACONTA;
        } else if (opcao == 0) {
            return MenuExtratoConta.SAIR;
        }
        return null;
    }
}
