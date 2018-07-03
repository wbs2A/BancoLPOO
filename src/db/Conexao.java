/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author bruno
 */
public class Conexao {

    private Connection conexao;

    /**
     * Conecta a um banco de dados (cria o banco se ele não existir)
     *
     * @return
     */
    public boolean conectar() {

        try {
            URL path=this.getClass().getResource("bancoDB.db");
            String url = "jdbc:sqlite:"+path;

            this.conexao = DriverManager.getConnection(url);

        } catch (SQLException e) {
            System.err.println("+Is Here"+e.getMessage());
            return false;
        }

        System.out.println("conectou!!!");

        return true;
    }

    public boolean desconectar() {

        try {
            if (this.conexao.isClosed() == false) {
                this.conexao.close();
            }

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            return false;
        }
        System.out.println("desconectou!!!");
        return true;
    }

    /**
     * Criar os statements para nossos sqls serem executados
     *
     * @return
     */
    public Statement criarStatement() {
        try {
            
            return this.conexao.createStatement();
        } catch (SQLException e) {
            System.out.println("Foi Acolá"+e);

            return null;
        }
    }
    
    /**
     * Criar os statements para nossos sqls serem executados
     *
     * @return
     */
    public PreparedStatement criarPreparedStatement(String sql) {
        try {
            return this.conexao.prepareStatement(sql);
        } catch (SQLException e) {
            System.out.println(sql);

            System.out.println(e);
            return null;
        }
    }
    
    

    public Connection getConexao() {
        return this.conexao;
    }

}
