
package atv8;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class Agenda {
    private Connection conn;
    //private PreparedStatement pstm;
    private PreparedStatement pstm;
    private ResultSet rs; 

    public String inserir(Pessoa pessoa){
        Conecta conexao = new Conecta();
        this.conn = conexao.conectar();
        if (conn==null)
            System.out.println("Erro na conexão");
        else
            System.out.println("Conectado com sucesso");
        
        try {
            pstm = conn.prepareStatement("INSERT INTO AGENDA (NOME, TELEFONE) VALUES (?, ?)");
            pstm.setString(1, pessoa.getNome());
            pstm.setString(2, pessoa.getTelefone());
            pstm.execute();
            System.out.println("Inserido com sucesso");
            conexao.desconectar();
            return "ok";
        } catch (SQLException ex) {
            String retorno = "Falha ao inserir no DB: " + ex.getMessage();
            System.out.println(retorno);
            return retorno;
        }
    }
    
    public String remover (String nome){
        Conecta conexao = new Conecta();
        conn = conexao.conectar();
        try{
            String remove = "DELETE FROM AGENDA WHERE NOME = ?";
            pstm = conn.prepareStatement(remove);
            pstm.setString(1, nome);
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
        
   
    public ResultSet buscar () {
        // Abrindo a conexão com o banco​
        Conecta conexao = new Conecta();
        conn = conexao.conectar();
        try {
            // Instanciando o objeto preparedStatement (pstm)​
            pstm = conn.prepareStatement("SELECT * FROM AGENDA ORDER BY NOME");
            // Executando o comando sql e armazenando no ResultSet
            rs = pstm.executeQuery();
            //Retornando o ResultSet​
             return rs;
        } catch (SQLException e) {
            conexao.desconectar();
            return null;
        }
    }
    
    public ResultSet buscarPorNome(String nome) {
        // Abrindo a conexão com o banco​
        Conecta conexao = new Conecta();
        conn = conexao.conectar();
        try {
            // Instanciando o objeto preparedStatement (pstm)​
            //pstm = conn.prepareStatement("SELECT * FROM DEPT WHERE DNAME = ? ORDER BY DEPTNO");
            pstm = conn.prepareStatement("SELECT * FROM AGENDA WHERE NOME = ? ORDER BY NOME");

            pstm.setString(1, nome);
            // Executando o comando sql e armazenando no ResultSet
            rs = pstm.executeQuery();
            //Retornando o ResultSet​
             return rs;
        } catch (SQLException e) {
            conexao.desconectar();
            return null;
        }
    }
    public void alterar(String telefone, String nomeContato) {
        // Abrindo a conexão com o banco​
        Conecta conexao = new Conecta();
        conn = conexao.conectar();
        try {
            // Instanciando o objeto preparedStatement (pstm)​
            pstm = conn.prepareStatement("UPDATE AGENDA SET TELEFONE = ? WHERE NOME = ?");
            // Setando o valor ao parâmetro​
            pstm.setString(1, telefone);
            pstm.setString(2, nomeContato);
            // Executando o comando sql do objeto preparedStatement​
            pstm.execute();
            System.out.println("Alterado com Sucesso");
            // Fechando a conexão com o banco​
            conexao.desconectar();
        } catch (SQLException e) {
            // Fechando a conexão com o banco​
            System.out.println(e.getMessage());
            
            conexao.desconectar();
        }
    }
}
