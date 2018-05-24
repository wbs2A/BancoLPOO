package controller;

import model.Pessoa;

public class PessoaDAO extends DAO{
    
    public static void salvarPessoas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void carregarPessoas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static Object getPessoa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Pessoa get(String cpf, String senha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    private static ArrayList<pessoa> arrayPessoa  = new ArrayList<pessoa>();


     /* Metodo instancia objeto do tipo pessoa (criando uma pessoa) e adiciona o objeto pessoa no array de pessoas
     *@author José Sandonas
     *@param String nome que representa o nome da pessoa
     *@param String senha que representa a senha de cadastro
     *@param String cpf que representa o cadastro
     *@param Date data que representa a data de nascimento
     *@param String sexo genero seja ele qual for
     *@return pessoa
     */
    @Override
    public static Object create(String nome,String senha, String cpf, Date data, String sexo, String telefone, String email){
        Pessoa pessoa = new Pessoa(nome, senha, cpf, data, sexo, telefone, email);
        arrayPessoa.add(pessoa);
        return pessoa;
    }

    /* Metodo que realiza a busca de uma pessoa recebendo como parametro o seu CPF
    *@author José Sandonas
    *@return pessoa especificada ou nulo caso nao encontrada  
    */
    @Override
    public static Pessoa read(String cpf){
        for(Pessoa pessoa:arrayPessoa){
            if(pessoa.getCpf().equals(cpf)){
                return pessoa;
            }
        }
        return null;
    }
    /* Metodo que realiza a alteração das informacoes de uma pessoa recebendo como parametro o numero que especifica 
    qual dado que sera alterado, pessoa do tipo Pessoa, obejto info que seria a informação que sera alterada 
    *@author José Sandonas
    *@return pessoa especificada ou nulo caso nao encontrada  
    */
    @Override
    public void update(int operacao, Pessoa pessoa, Object info){
        switch (operacao) {
            case 1:
                pessoa.setNome(info);
                break;
            case 2:
                pessoa.setSenha(info);
                break;
            case 3:
                pessoa.setDtNasci(info);
                break;
            case 4:
                pessoa.setSexo(sexo);
                break;
            case 5:
                pessoa.setTelefone(telefone);
                break;
            case 6:
                pessoa.setEmail(email);
                break;
        }
    
    }
    /*Metodo que executa  a remocao interna que remove a pessoa contida dentro do arraypessoa
    *@param pessoa
    *@author José Sandonas
    */
    private static void delete(Pessoa pessoa){
        arrayPessoa.remove(pessoa);
    }

    /*Metodo que executa  a remocao externa que recebe o cpf e remove a pessoa
    *@param String cpf
    *@author José Sandonas
    */
    @Override
    public static void delete(String cpf){
        Pessoa p = read(cpf);
        delete(p);
    }


}