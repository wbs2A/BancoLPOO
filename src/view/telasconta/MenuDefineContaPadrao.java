package view.telasconta;

/**
 * Classe responsavel por disponibilizar as opcoes do Enum MenuDefineContaPadrao
 *
 * @author Michael Douglas
 * @author Joao Gabriel
 * @author Joao Victor
 * @author Adler Cavalcante
 */
public enum MenuDefineContaPadrao {
    SIM(1), NAO(2);
    int opcao;

    /**
     *
     * @param op
     */
    private MenuDefineContaPadrao(int op) {
        this.opcao = op;
    }

    /**
     * Metodo para retorno da opcao escolhida
     *
     * @param opcao int - Valor da opcao escolhida
     * @return enum opcao - Opcao com o nome correspondente
     */
    public static MenuDefineContaPadrao menuOpcao(int opcao) {
        if (opcao == 1) {
            return MenuDefineContaPadrao.SIM;
        } else if (opcao == 2) {
            return MenuDefineContaPadrao.NAO;
        }
        return null;
    }
}
