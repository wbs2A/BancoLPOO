package view.telaspessoa;

/**
 * A Classe MenuExcluirConta e responsavel por disponibilizar as opcoes do Enum
 * MenuExcluirConta
 *
 * @author Adler Cavalcante
 * @author Joao Gabriel
 * @author Joao Victor
 * @author Michael Douglas
 */
public enum MenuExcluirConta {
    NAO(1), SIM(2);
    int opcao;

    /**
     * O metodo MenuExcluirConta e responsavel por atribuir a variavel opcao o
     * parametro que e passado quando uma variavel do tipo MenuExcluirConta e
     * declarado.
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
