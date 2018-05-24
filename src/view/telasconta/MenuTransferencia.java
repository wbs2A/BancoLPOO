package view.telasconta;

/**
 * Classe reponsavel por disponibilizar as opcoes do Enum MenuTransferencia
 *
 * @author Michael Douglas
 * @author Joao Gabriel
 * @author Joao Victor
 * @author Adler Cavalcante
 */
public enum MenuTransferencia {
    TRANSFERIRDACONTAPADRAO(1), TRANSFERIRDEOUTRACONTA(2), SAIR(0);

    int opcao;

    /**
     *
     * @param op
     */
    MenuTransferencia(int op) {
        this.opcao = op;
    }

    /**
     * Metodo para retorno da opcao escolhida
     *
     * @param opcao int - Valor da opcao escolhida
     * @return enum opcao - Opcao com o nome correspondente
     */
    public static MenuTransferencia menuOpcao(int opcao) {
        if (opcao == 1) {
            return MenuTransferencia.TRANSFERIRDACONTAPADRAO;
        } else if (opcao == 2) {
            return MenuTransferencia.TRANSFERIRDEOUTRACONTA;
        } else if (opcao == 0) {
            return MenuTransferencia.SAIR;
        }
        return null;
    }
}
