package view.telaspessoa;

/**
 * A Classe MenuPessoa e responsavel por disponibilizar as opcoes do Enum
 * MenuPessoa
 *
 * @author Adler Cavalcante
 * @author Joao Gabriel
 * @author Joao Victor
 * @author Michael Douglas
 */
public enum MenuPessoa {
    ATUALIZARDADOS(1), EXLUCIRPESSOA(2), VERDADOSPESSOA(3), AJUDA(4), SAIR(0);
    int opcao;

    /**
     * O metodo MenuPessoa e responsavel por atribuir a variavel opcao o
     * parametro que e passado quando uma variavel do tipo MenuPessoa e
     * declarada
     *
     * @param op
     */
    MenuPessoa(int op) {
        this.opcao = op;
    }

    /**
     * Metodo para retorno da opcao escolhida
     *
     * @param opcao int - Valor da opcao escolhida
     * @return enum opcao - Opcao com o nome correspondente
     */
    public static MenuPessoa menuOpcao(int opcao) {
        if (opcao == 1) {
            return MenuPessoa.ATUALIZARDADOS;
        } else if (opcao == 2) {
            return MenuPessoa.EXLUCIRPESSOA;
        } else if (opcao == 3) {
            return MenuPessoa.VERDADOSPESSOA;
        } else if (opcao == 4) {
            return MenuPessoa.AJUDA;
        } else if (opcao == 0) {
            return MenuPessoa.SAIR;
        }
        return null;
    }
}
