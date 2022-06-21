
package model;

import java.sql.SQLException;  
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UsuarioDAO {
    private final Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs; 

    public UsuarioDAO() {
        Conexao conexao = new Conexao();
        conn = conexao.conectar();
    }
   
    public boolean verificaLogin(Usuario usuario){
        String sql = "select * from usuarios where usuario = '" + usuario.getLogin() 
                   + "' and senha = '" + usuario.getSenha() + "'";
        try {
            pstmt = conn.prepareStatement(sql);
            // Executando o comando sql e armazenando no ResultSet
            rs = pstmt.executeQuery();
            //Retornando o ResultSet​
            while(rs.next()){
                return true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }
}

