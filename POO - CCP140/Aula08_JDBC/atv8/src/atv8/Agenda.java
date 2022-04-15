
package atv8;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Agenda {
    private Connection conn;
    private PreparedStatement pstm;
    private PreparedStatement pstmt;

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
}
