/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpledb;

import java.sql.SQLException;  
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class DAO {
    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;  

    public void inserir(int numero, String nomeDepartamento, String local) {
        // Abrindo a conexão com o banco​
        Conexao conexao = new Conexao();
        conn = conexao.conectar();
        try {
            // Instanciando o objeto preparedStatement (pstmt)​
            pstmt = conn.prepareStatement("INSERT INTO DEPT (DEPTNO, DNAME, LOCAL) VALUES (?, ?, ?)");
            // Setando o valor aos parâmetros
            pstmt.setInt(1, numero);
            pstmt.setString(2, nomeDepartamento);
            pstmt.setString(3, local);
            // Executando o comando sql do objeto preparedStatement​
            pstmt.execute();
            System.out.println("Inserido com Sucesso");
            conexao.desconectar(); // Fechando a conexão com o banco​
        } catch (SQLException e) {
            // Fechando a conexão com o banco​
            conexao.desconectar();
            System.err.println("Falha em Inserir no DB" + e.getMessage());
        }
    }
        
    public void alterar(int numero, String nomeDepartamento) {
        // Abrindo a conexão com o banco​
        Conexao conexao = new Conexao();
        conn = conexao.conectar();
        try {
            // Instanciando o objeto preparedStatement (pstmt)​
            pstmt = conn.prepareStatement("UPDATE DEPT SET DNAME = ? WHERE DEPTNO = ?");
            // Setando o valor ao parâmetro​
            pstmt.setString(1, nomeDepartamento);
            pstmt.setInt(2, numero);
            // Executando o comando sql do objeto preparedStatement​
            pstmt.execute();
            System.out.println("Alterado com Sucesso");
            // Fechando a conexão com o banco​
            conexao.desconectar();
        } catch (SQLException e) {
            // Fechando a conexão com o banco​
            conexao.desconectar();
        }
    }
    
    public void remover(int deptno) {
        // Abrindo a conexão com o banco​
        Conexao conexao = new Conexao();
        conn = conexao.conectar();
        try {
            // Instanciando o objeto preparedStatement (pstmt)​
            String remover = "DELETE FROM DEPT WHERE DEPTNO = ?";
            // Instanciando o objeto preparedStatement (pstmt)​
            pstmt = conn.prepareStatement(remover);
            // Setando o valor ao parâmetro​
            pstmt.setLong(1, deptno);
            // Executando o comando sql do objeto preparedStatement​
            pstmt.execute();
            System.out.println("Removido com Sucesso");
            conexao.desconectar(); // Fechando a conexão com o banco​
        } catch (SQLException e) {
            conexao.desconectar(); // Fechando a conexão com o banco​
        }
    }
    
    public ResultSet buscar() {
        // Abrindo a conexão com o banco​
        Conexao conexao = new Conexao();
        conn = conexao.conectar();
        try {
            // Instanciando o objeto preparedStatement (pstmt)​
            pstmt = conn.prepareStatement("SELECT * FROM DEPT ORDER BY DEPTNO");
            // Executando o comando sql e armazenando no ResultSet
            rs = pstmt.executeQuery();
            //Retornando o ResultSet​
             return rs;
        } catch (SQLException e) {
            conexao.desconectar();
            return null;
        }
    }
    
    public ResultSet buscarPorNome(String nome) {
        // Abrindo a conexão com o banco​
        Conexao conexao = new Conexao();
        conn = conexao.conectar();
        try {
            // Instanciando o objeto preparedStatement (pstmt)​
            pstmt = conn.prepareStatement("SELECT * FROM DEPT WHERE DNAME = ? ORDER BY DEPTNO");
            pstmt.setString(1, nome);
            // Executando o comando sql e armazenando no ResultSet
            rs = pstmt.executeQuery();
            //Retornando o ResultSet​
             return rs;
        } catch (SQLException e) {
            conexao.desconectar();
            return null;
        }
    }
    
}
