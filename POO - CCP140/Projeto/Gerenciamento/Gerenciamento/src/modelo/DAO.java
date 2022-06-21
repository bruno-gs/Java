/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.SQLException;  
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAO {
    private Connection conn;
    private PreparedStatement pstm;
    private ResultSet rs;
      
    public String excluirCadastro (String cpf){
        Conexao conexao = new Conexao();
        conn = conexao.conectar();
        if (conn==null)
            System.out.println("Erro na conexão");
        else
            System.out.println("Conectado com sucesso");
        try{
            pstm = conn.prepareStatement("DELETE FROM CLIENTES WHERE CPF = ?");
            pstm.setString(1, cpf);
            pstm.execute();
            System.out.println("Removido com sucesso");
            conexao.desconectar();            
            return "ok";
            
        }
        catch(SQLException ex) {
            String retorno = "Falha ao remover no DB: " + ex.getMessage();
            System.out.println(retorno);
            return retorno;
        }
    }
    
    public String excluirCadastro_nf (String cpf){
        Conexao conexao = new Conexao();
        conn = conexao.conectar();
        if (conn==null)
            System.out.println("Erro na conexão");
        else
            System.out.println("Conectado com sucesso");
        try{
            pstm = conn.prepareStatement("DELETE FROM NF WHERE CPF = ?");
            pstm.setString(1, cpf);
            pstm.execute();
            System.out.println("Removido com sucesso");
            conexao.desconectar();           
            return "ok";
            
        }
        catch(SQLException ex) {
            String retorno = "Falha ao remover no DB: " + ex.getMessage();
            System.out.println(retorno);
            return retorno;
        }
    }
        
   
    public ResultSet exibirTodas () { // Exibir todas as contas do Aplicativo / Exibir saldo das contas dos Clientes
        // Abrindo a conexão com o banco​
        Conexao conexao = new Conexao();
        conn = conexao.conectar();
        try {
            // Instanciando o objeto preparedStatement (pstm)​
            pstm = conn.prepareStatement("SELECT * FROM CLIENTES ORDER BY CPF");
            // Executando o comando sql e armazenando no ResultSet
            rs = pstm.executeQuery();
            //Retornando o ResultSet​
            return rs;
        } catch (SQLException e) {
            conexao.desconectar();
            return null;
        }
    }
    
    // Outro Banco
    public ResultSet buscarCashbackPorCPF(String cpf) {
        // Abrindo a conexão com o banco​
        Conexao conexao = new Conexao();
        conn = conexao.conectar();
        try {
            // Instanciando o objeto preparedStatement (pstm)​
            //pstm = conn.prepareStatement("SELECT * FROM AGENDA WHERE NOME = ? ORDER BY NOME");
            // Teste com AND
//            pstm = conn.prepareStatement("SELECT CASHBACK AND CPF FROM NF WHERE CPF = ? ORDER BY CPF");
            pstm = conn.prepareStatement("SELECT * FROM NF WHERE CPF = ? ORDER BY CPF");

            pstm.setString(1, cpf);
            // Executando o comando sql e armazenando no ResultSet
            rs = pstm.executeQuery();
            //Retornando o ResultSet​
             return rs;
        } catch (SQLException e) {
            conexao.desconectar();
            return null;
        }
    }
    
    public ResultSet buscarInfosClientes(String cpf) {
        // Abrindo a conexão com o banco​
        Conexao conexao = new Conexao();
        conn = conexao.conectar();
        try {
            // Instanciando o objeto preparedStatement (pstm)​
            //pstm = conn.prepareStatement("SELECT * FROM DEPT WHERE DNAME = ? ORDER BY DEPTNO");
            pstm = conn.prepareStatement("SELECT * FROM CLIENTES WHERE CPF = ? ORDER BY CPF");

            pstm.setString(1, cpf);
            
            // Executando o comando sql e armazenando no ResultSet
            rs = pstm.executeQuery();
            //Retornando o ResultSet​
            return rs;
        } catch (SQLException e) {
            conexao.desconectar();
            return null;
        }
    }
    
    public ResultSet buscarNFPorCPF(String cpf) {
        // Abrindo a conexão com o banco​
        Conexao conexao = new Conexao();
        conn = conexao.conectar();
        try {
            // Instanciando o objeto preparedStatement (pstm)​
            //pstm = conn.prepareStatement("SELECT * FROM AGENDA WHERE NOME = ? ORDER BY NOME");
            // Teste com AND
//            pstm = conn.prepareStatement("SELECT NUMNOTA AND CPF FROM NF WHERE CPF = ? ORDER BY CPF");
            pstm = conn.prepareStatement("SELECT * FROM NF WHERE CPF = ? ORDER BY CPF");

            pstm.setString(1, cpf);
            // Executando o comando sql e armazenando no ResultSet
            rs = pstm.executeQuery();
            //Retornando o ResultSet​
             return rs;
        } catch (SQLException e) {
            conexao.desconectar();
            return null;
        }
    }
    
    public boolean buscarCpf(String cpf) {
        // Abrindo a conexão com o banco​
        Conexao conexao = new Conexao();
        conn = conexao.conectar();
        try {
            // Instanciando o objeto preparedStatement (pstm)​
            //pstm = conn.prepareStatement("SELECT * FROM DEPT WHERE DNAME = ? ORDER BY DEPTNO");
            pstm = conn.prepareStatement("SELECT * FROM CLIENTES WHERE CPF = ? ORDER BY CPF");

            pstm.setString(1, cpf);
            
            // Executando o comando sql e armazenando no ResultSet
            rs = pstm.executeQuery();
            //Retornando o ResultSet​
            while(rs.next()){
                return true;
            }
        } catch (SQLException e) {
            conexao.desconectar();
        }
        return false;
    }
}
