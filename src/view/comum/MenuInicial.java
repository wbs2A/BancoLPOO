package view.comum;

/**
 * Classe responsavel por disponibilizar as opcoes do Enum MenuInicial
 *
 * @author Michael Douglas
 * @author Joao Gabriel
 * @author Joao Victor
 * @author Adler Cavalcante
 */
public enum MenuInicial {
    FAZERLOGIN(1), FAZERCADASTRO(2), AJUDA(3), SAIR(0);
    int opcao;

    /**
     *
     * @param op
     */
    MenuInicial(int op) {
        this.opcao = op;
    }

    /**
     * Metodo para retorno da opcao escolhida
     *
     * @param opcao int - Valor da opcao escolhida
     * @return enum opcao - Opccao com nome correspondente
     */
    public static MenuInicial menuOpcao(int opcao) {
        if (opcao == 1) {
            return MenuInicial.FAZERLOGIN;
        } else if (opcao == 2) {
            return MenuInicial.FAZERCADASTRO;
        } else if (opcao == 3) {
            return MenuInicial.AJUDA;
        } else if (opcao == 0) {
            return MenuInicial.SAIR;
        }
        return null;
    }
}
