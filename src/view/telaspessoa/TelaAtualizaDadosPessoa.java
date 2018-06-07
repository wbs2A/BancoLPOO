package view.telaspessoa;

import controller.Controller;
import controller.PessoaDAO;
import model.Pessoa;
import view.ClearConsole;
import view.EntradaDeDados;
import view.TratamentodeEntradas;

/**
 * A Classe TelaAtualizaDadosPessoa e responsavel por disponibilizar a tela com
 * as opcaoes de atualizacao de dados de pessoa
 *
 * @author Adler Cavalcante
 * @author Joao Gabriel
 * @author Joao Victor
 * @author Michael Douglas
 */
public class TelaAtualizaDadosPessoa {

    /**
     * Metodo para impressao da tela atulizarcadastro e receber os dados do
     * usuario
     */
    public static void formularioAtualizaCadastro() {
        int opcao;
        boolean sair = false;
        Pessoa pessoa;
        pessoa = Controller.getSessao();

        System.out.println();
        System.out.println("\t\t\t\t        Confirme sua Senha de Login        ");
        System.out.println();

        if (Controller.getSessao().getSenha().equals(EntradaDeDados.lerSenha())) {
            System.out.println();
            do {
                try {
                    new ClearConsole();
                    System.out.println();
                    System.out.println("\t\t\t*******************************************************");
                    System.out.println("\t\t\t*\t           CPAN BANCO CENTER                  *");
                    System.out.println("\t\t\t*******************************************************");
                    System.out.println("\t\t\t\t\n\t\t\t\t");
                    System.out.println("\t \t\t\t**************************************");
                    System.out.println("\t\t\t\t*          ATUALIZAR CADASTRO        *");
                    System.out.println("\t \t\t\t**************************************");
                    System.out.println("\t\t\t\t\n\t\t\t\t");
                    System.out.println("\t\t\t\t**************************************");
                    System.out.println("\t\t\t\t*  " + MenuAtualizaDados.ATUALIZARNOME.opcao
                            + ". Atualizar Nome                 *");
                    System.out.println("\t\t\t\t**************************************");
                    System.out.println(
                            "\t\t\t\t*  " + MenuAtualizaDados.ATUALIZARCPF.opcao + ". Atualizar CPF                  *");
                    System.out.println("\t\t\t\t**************************************");
                    System.out.println("\t\t\t\t*  " + MenuAtualizaDados.ATUALIZARDATANASC.opcao
                            + ". Atualizar Data de Nascimento   *");
                    System.out.println("\t\t\t\t**************************************");
                    System.out.println("\t\t\t\t*   " + MenuAtualizaDados.ATUALIZARSEXO.opcao
                            + ". Atualizar Sexo                *");
                    System.out.println("\t\t\t\t**************************************");
                    System.out.println("\t\t\t\t*   " + MenuAtualizaDados.ATUALIZARSENHA.opcao
                            + ". Atualizar Senha de Login      *");
                    System.out.println("\t\t\t\t**************************************");
                    System.out.println(
                            "\t\t\t\t*   " + MenuAtualizaDados.ATUALIZARTELEFONE.opcao + ". Atualizar Celular             *");
                    System.out.println("\t\t\t\t**************************************");
                    System.out.println(
                            "\t\t\t\t*   " + MenuAtualizaDados.ATUALIZAREMAIL.opcao + ". Atualizar E-mail              *");
                    System.out.println("\t\t\t\t**************************************");
                    System.out.println(
                            "\t\t\t\t*   " + MenuAtualizaDados.SAIR.opcao + ". Voltar                        *");
                    System.out.println("\t\t\t\t**************************************");
                    opcao = TratamentodeEntradas.trataEntradaOpcao();

                    switch (MenuAtualizaDados.menuOpcao(opcao)) {
                        case ATUALIZARNOME:
                            System.out.println();
                            System.out.println("\t\t\t\tNome atual: " + pessoa.getNome());
                            Controller.atualizaNomePessoa(pessoa, TratamentodeEntradas.trataEntradaNome());
                            System.out.println();
                            System.out.println("\t\t\t\t[Nome atualizado com sucesso]");
                            System.out.println();
                            PessoaDAO.salvarPessoas();
                            break;

                        case ATUALIZARCPF:
                            System.out.println();
                            System.out.println("\t\t\t\tCPF atual: " + pessoa.getCpf());
                            Controller.atualizaCpfPessoa(pessoa, TratamentodeEntradas.trataEntradaCpf());
                            System.out.println();
                            System.out.println("\t\t\t\t[CPF atualizado com sucesso]");
                            System.out.println();
                            PessoaDAO.salvarPessoas();
                            break;

                        case ATUALIZARDATANASC:
                            System.out.println();
                            System.out.println("\t\t\t\tData de Nascimento atual: " + pessoa.getDtNasci());
                            Controller.atualizaDtNascPessoa(pessoa, TratamentodeEntradas.trataEntradaDtNasc());
                            System.out.println();
                            System.out.println("\t\t\t\t[Data de Nascimento atualizada com sucesso]");
                            System.out.println();
                            PessoaDAO.salvarPessoas();
                            break;

                        case ATUALIZARSEXO:
                            System.out.println();
                            System.out.println("\t\t\t\tSexo atual: " + pessoa.getSexo());
                            Controller.atualizaSexoPessoa(pessoa, TratamentodeEntradas.trataEntradaSexo());
                            System.out.println();
                            System.out.println("\t\t\t\t[Sexo atualizado com sucesso]");
                            System.out.println();
                            PessoaDAO.salvarPessoas();
                            break;

                        case ATUALIZARSENHA:
                            System.out.println();
                            System.out.println("\t\t\t\tSenha de Login atual: " + pessoa.getSenha());
                            Controller.atualizaSenhaPessoa(pessoa, EntradaDeDados.lerSenha());
                            System.out.println();
                            System.out.println("\t\t\t\t[Senha de Login atualizada com sucesso]");
                            System.out.println();
                            PessoaDAO.salvarPessoas();
                            break;

                        case ATUALIZARTELEFONE:
                            System.out.println();
                            System.out.println("\t\t\t\tTelefone atual: " + pessoa.getTelefone());
                            Controller.atualizaTelefonePessoa(pessoa, EntradaDeDados.lerTelefoneCelular());
                            System.out.println();
                            System.out.println("\t\t\t\t[Telefone atualizado com sucesso]");
                            System.out.println();
                            PessoaDAO.salvarPessoas();
                            break;

                        case ATUALIZAREMAIL:
                            System.out.println();
                            System.out.println("\t\t\t\tE-mail atual: " + pessoa.getEmail());
                            Controller.atualizaEmailPessoa(pessoa, EntradaDeDados.lerEmail());
                            System.out.println();
                            System.out.println("\t\t\t\t[E-mail atualizado com sucesso]");
                            System.out.println();
                            PessoaDAO.salvarPessoas();
                            break;

                        case SAIR:
                            sair = true;
                            break;
                    }
                } catch (Exception e) {
                    System.out.println();
                    System.out.println("\t\t\t\tOpcao Invalida!");
                    System.out.println();
                }
            } while (!sair);
        } else {
            System.out.println();
            System.out.println("\t\t\t\t[Senha Incorreta]");
            System.out.println();
        }

    }
}
