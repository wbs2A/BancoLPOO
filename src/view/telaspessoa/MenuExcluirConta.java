package view.telaspessoa;

/**
 * Classe responsavel por disponibilizar as opcoes do Enum MenuExcluirConta
 *
 * @author Michael Douglas
 * @author Joao Gabriel
 * @author Joao Victor
 * @author Adler Cavalcante
 */
public enum MenuExcluirConta {
    NAO(1), SIM(2);
    int opcao;

    /**
     *
     * @param op
     */
    MenuExcluirConta(int op) {
        this.opcao = op;
    }

    /**
     * Metodo para retorno da opcao escolhida
     *
     * @param opcao int - Valor da opcao escolhida
     * @return enum opcao - Opcao com o nome correspondente
     */
    public static MenuExcluirConta menuConfirma(int opcao) {
        if (opcao == 1) {
            return MenuExcluirConta.NAO;
        } else if (opcao == 2) {
            return MenuExcluirConta.SIM;
        }
        return null;
    }
}
