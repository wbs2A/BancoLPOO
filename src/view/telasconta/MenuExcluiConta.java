package view.telasconta;

/**
 * Classe responsavel por disponibilizar as Opcoes do Enum MenuExcluiConta
 *
 * @author Michael Douglas
 * @author Joao Gabriel
 * @author Joao Victor
 * @author Adler Cavalcante
 */
public enum MenuExcluiConta {
    NAO(1), SIM(2);

    int opcao;

    /**
     *
     * @param op
     */
    MenuExcluiConta(int op) {
        this.opcao = op;
    }

    /**
     * Metodo para retorno da opcao escolhida
     *
     * @param opcao int - Valor da opcao escolhida
     * @return enum opcao - Opcao com o nome correspondente
     */
    public static MenuExcluiConta menuConfirma(int opcao) {
        if (opcao == 1) {
            return MenuExcluiConta.NAO;
        } else if (opcao == 2) {
            return MenuExcluiConta.SIM;
        }
        return null;
    }
}
