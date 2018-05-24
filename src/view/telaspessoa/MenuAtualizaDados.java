package view.telaspessoa;

/**
 * Classe responsavel por disponibilizar as opcoes do Enum MenuAtualizaDados
 *
 * @author Michael Douglas
 * @author Joao Gabriel
 * @author Joao Victor
 * @author Adler Cavalcante
 */
public enum MenuAtualizaDados {
    ATUALIZARNOME(1), ATUALIZARCPF(2), ATUALIZARDATANASC(3), ATUALIZARSEXO(4), ATUALIZARSENHA(5), SAIR(0);
    int opcao;

    /**
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
        } else if (opcao == 0) {
            return MenuAtualizaDados.SAIR;
        }
        return null;
    }
}
