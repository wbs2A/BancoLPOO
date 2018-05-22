package view.telaspessoa;

import controller.PessoaDAO;
import controller.SessaoConta;
import model.Pessoa;
import view.ClearConsole;
import view.EntradaDeDados;
import view.ExecoesDeEntrada;

public class TelaAtualizaDadosPessoa {

	public static void formularioAtualizaCadastro() {
		int opcao;
		boolean sair = false;
		Pessoa pessoa;
		pessoa = SessaoConta.getPessoa();
		
			do {
				try {
					new ClearConsole();
					System.out.println();
					System.out.println("\t\t\t*******************************************************");
					System.out.println("\t\t\t*\t           CPAN BANCO CENTER                  *");
					System.out.println("\t\t\t*******************************************************");
					System.out.println("\t\t\t\t\n\t\t\t\t");
					System.out.println("\t \t\t\t**************************************");
					System.out.println("\t\t\t\t*          ATUALIZAR CADASTRO         *");
					System.out.println("\t \t\t\t**************************************");
					System.out.println("\t\t\t\t\n\t\t\t\t");
					System.out.println("\t\t\t\t**************************************");
					System.out.println("\t\t\t\t*   1. Atualizar Nome                *");
					System.out.println("\t\t\t\t**************************************");
					System.out.println("\t\t\t\t*   2. Atualizar CPF                 *");
					System.out.println("\t\t\t\t**************************************");
					System.out.println("\t\t\t\t*   3. Atualizar Data de Nascimento  *");
					System.out.println("\t\t\t\t**************************************");
					System.out.println("\t\t\t\t*   4. Atualizar Sexo                *");
					System.out.println("\t\t\t\t**************************************");
					System.out.println("\t\t\t\t*   5. Atualizar Senha de Login      *");
					System.out.println("\t\t\t\t**************************************");
					System.out.println("\t\t\t\t*   0. Voltar                        *");
					System.out.println("\t\t\t\t**************************************");
					opcao = TratamentodeEntradas.trataEntradaOpcao();

					switch (MenuAtualizaDados.menuOpcao(opcao)) {
					case ATUALIZARNOME:
						System.out.println();
						System.out.println("\t\t\t\tNome atual: " + pessoa.getNome());
						PessoaDAO.atualizaNomePessoa(pessoa, TratamentodeEntradas.trataEntradaNome());
						System.out.println();
						System.out.println("\t\t\t\t[Nome atualizado com sucesso]");
						System.out.println();
						break;

					case ATUALIZARCPF:
						System.out.println();
						System.out.println("\t\t\t\tCPF atual: " + pessoa.getCpf());
						PessoaDAO.atualizaCpfPessoa(pessoa, TratamentodeEntradas.trataEntradaCpf());
						System.out.println();
						System.out.println("\t\t\t\t[CPF atualizado com sucesso]");
						System.out.println();
						break;

					case ATUALIZARDATANASC:
						System.out.println();
						System.out.println("\t\t\t\tData de Nascimento atual: " + pessoa.getDtNasc());
						PessoaDAO.atualizaDtNascPessoa(pessoa, TratamentodeEntradas.trataEntradaDtNasc());
						System.out.println();
						System.out.println("\t\t\t\t[Data de Nascimento atualizada com sucesso]");
						System.out.println();
						break;

					case ATUALIZARSEXO:
						System.out.println();
						System.out.println("\t\t\t\tSexo atual: " + pessoa.getSexo());
						PessoaDAO.atualizaSexoPessoa(pessoa, TratamentodeEntradas.trataEntradaSexo());
						System.out.println();
						System.out.println("\t\t\t\t[Sexo atualizado com sucesso]");
						System.out.println();
						break;

					case ATUALIZARSENHA:
						System.out.println();
						System.out.println("\t\t\t\tSenha de Login atual: " + pessoa.getSenha());
						PessoaDAO.atualizaSenhaPessoa(pessoa, EntradaDeDados.lerSenha());
						System.out.println();
						System.out.println("\t\t\t\t[Senha de Login atualizada com sucesso]");
						System.out.println();
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
	}
}
