package view.telaspessoa;

import controller.Controller;
import view.ClearConsole;
import view.EntradaDeDados;

/**
 * A Classe TelaConsultaDadosPessoa e responsavel por mostrar todas as
 * informacoes pessoais referentes a uma determinada pessoa.
 *
 * @author Adler Cavalcante
 * @author Joao Gabriel
 * @author Joao Victor
 * @author Michael Douglas
 *
 */
public class TelaConsultaDadosPessoa {

    /**
     * O metodo menuConsultaDadosPessoa e responsavel por disponibilizar a
     * visualizacao dos dados pessoais de uma pessoa, utilizando de uma
     * validacao de login para evitar a visualizacao de dados pessoais de outras
     * pessoas, emitindo um aviso de erro caso alguma informacao inserida na
     * verificacao seja invalida.
     */
    public static void menuConsultadoDadosPessoa() {

        new ClearConsole();
        System.out.println();
        System.out.println("\t\t\t*******************************************************");
        System.out.println("\t\t\t*\t           CPAN BANCO CENTER                  *");
        System.out.println("\t\t\t*******************************************************");
        System.out.println("\t\t\t\t\n\t\t\t\t");
        System.out.println("\t\t\t\t**************************************");
        System.out.println("\t\t\t\t*         CONSULTA DADOS PESSOA      *");
        System.out.println("\t\t\t\t**************************************");
        System.out.println("\t\t\t\t\n\t\t\t\t");
        System.out.println();
        System.out.println();
        System.out.println("\t\t\t\t        Confirme sua Senha de Login        ");
        System.out.println();

        if (Controller.getSessao().getSenha().equals(EntradaDeDados.lerSenha())) {
            System.out.println();
            System.out.println(Controller.getSessao());
            System.out.println("\t\t\t\tSenha de Login: " + Controller.getSessao().getSenha());
            System.out.println();

        } else {
            System.out.println();
            System.out.println("\t\t\t\t[Senha Incorreta]");
            System.out.println();
        }

    }
}
