package view.telasconta;

/**
 * Classe responsavel por disponibilizar as opcoes do Enum MenuSaque
 *
 * @author Michael Douglas
 * @author Joao Gabriel
 * @author Joao Victor
 * @author Adler Cavalcante
 */
public enum MenuSaque {
    SACARCONTAPADRAO(1), SACAROUTRACONTA(2), SAIR(0);

    int opcao;

    /**
     *
     * @param op
     */
    MenuSaque(int op) {
        this.opcao = op;
    }

    /**
     *
     * @param opcao int - Valor da opcao escolhida
     * @return enum opcao - Opcao com o nome correspondente
     */
    public static MenuSaque menuOpcao(int opcao) {
        if (opcao == 1) {
            return MenuSaque.SACARCONTAPADRAO;
        } else if (opcao == 2) {
            return MenuSaque.SACAROUTRACONTA;
        } else if (opcao == 0) {
            return MenuSaque.SAIR;
        }
        return null;
    }
}
