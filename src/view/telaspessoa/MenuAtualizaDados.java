package view.telaspessoa;

/**
 * A Classe MenuAtualizaDados e responsavel por disponibilizar as opcoes do Enum
 * MenuAtualizaDados
 *
 * @author Adler Cavalcante
 * @author Joao Gabriel
 * @author Joao Victor
 * @author Michael Douglas
 */
public enum MenuAtualizaDados {
    ATUALIZARNOME(1), ATUALIZARCPF(2), ATUALIZARDATANASC(3), ATUALIZARSEXO(4), ATUALIZARSENHA(5), ATUALIZARTELEFONE(
            6), ATUALIZAREMAIL(7), SAIR(0);
    int opcao;

    /**
     * O metodo MenuAtualizaDados e responsavel por atribuir a variavel opcao o
     * parametro que e passado quando uma variavel do tipo MenuAtualizaDados e
     * declarada.
     *
     * @param op
     */
    MenuAtualizaDados(int op) {
        this.opcao = op;
    }

    /**
     * Metodo para retorno da opcao escolhida
     *
     * @param opcao int - Valor da opcao escolhida
     * @return enum opcao - Opcao com o nome correspondente
     */
    public static MenuAtualizaDados menuOpcao(int opcao) {
        if (opcao == 1) {
            return MenuAtualizaDados.ATUALIZARNOME;
        } else if (opcao == 2) {
            return MenuAtualizaDados.ATUALIZARCPF;
        } else if (opcao == 3) {
            return MenuAtualizaDados.ATUALIZARDATANASC;
        } else if (opcao == 4) {
            return MenuAtualizaDados.ATUALIZARSEXO;
        } else if (opcao == 5) {
            return MenuAtualizaDados.ATUALIZARSENHA;
        } else if (opcao == 6) {
            return MenuAtualizaDados.ATUALIZARTELEFONE;
        } else if (opcao == 7) {
            return MenuAtualizaDados.ATUALIZAREMAIL;
        } else if (opcao == 0) {
            return MenuAtualizaDados.SAIR;
        }
        return null;
    }
}
