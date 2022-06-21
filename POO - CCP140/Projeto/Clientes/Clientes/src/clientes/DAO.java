package clientes;

/**
 *
 * @author ilidio
 */
import java.sql.SQLException;  
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Date;

public class DAO {
    private Connection conn;
    private PreparedStatement pstm;
    private ResultSet rs; 

    
    public boolean verificaLogin(Cliente cliente){
        Conecta conexao = new Conecta();
        this.conn = conexao.conectar();
        if (conn==null)
            System.out.println("Erro na conexão");
        else
            System.out.println("Conectado com sucesso");
        
        try {
            // Mudar Banco
            pstm = conn.prepareStatement("SELECT * FROM CLIENTES WHERE CPF = ? AND SENHA = ?");
            pstm.setString(1, cliente.getCpf());
            pstm.setString(2, cliente.getSenha());
            
            rs = pstm.executeQuery();
            //Retornando o ResultSet​
            while(rs.next()){
                return true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }
    
    
    public String inserir(Cliente cliente){
        Conecta conexao = new Conecta();
        this.conn = conexao.conectar();
        if (conn==null)
            System.out.println("Erro na conexão");
        else
            System.out.println("Conectado com sucesso");
        
        try {
            // Mudar Banco
            pstm = conn.prepareStatement("INSERT INTO CLIENTES (CPF, NOME, SENHA, SALDO) VALUES (?, ?, ?, ?)");
            pstm.setString(1, cliente.getCpf());
            cliente.setCpf(cliente.getCpf());
            pstm.setString(2, cliente.getNome());
            cliente.setNome(cliente.getNome());
            pstm.setString(3, cliente.getSenha());
            cliente.setSenha(cliente.getSenha());
            pstm.setDouble(4, cliente.getSaldo());
            cliente.setSaldo(cliente.getSaldo());
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
    
    
    public ResultSet buscar () {
        // Abrindo a conexão com o banco​
        Conecta conexao = new Conecta();
        conn = conexao.conectar();
        try {
            // Instanciando o objeto preparedStatement (pstm)​
            pstm = conn.prepareStatement("SELECT * FROM CLIENTES ORDER BY NOME");
            // Executando o comando sql e armazenando no ResultSet
            rs = pstm.executeQuery();
            //Retornando o ResultSet​
             return rs;
        } catch (SQLException e) {
            conexao.desconectar();
            return null;
        }
    }
    
    public ResultSet buscarPorCpfSenha(String cpf, String senha) {
        // Abrindo a conexão com o banco​
        Conecta conexao = new Conecta();
        conn = conexao.conectar();
        try {
            // Instanciando o objeto preparedStatement (pstm)​
            //pstm = conn.prepareStatement("SELECT * FROM DEPT WHERE DNAME = ? ORDER BY DEPTNO");
            pstm = conn.prepareStatement("SELECT * FROM CLIENTES WHERE CPF = ? AND SENHA = ? ORDER BY CPF");

            pstm.setString(1, cpf);
            pstm.setString(2, senha);
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
        Conecta conexao = new Conecta();
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
            return false;
        } catch (SQLException e) {
            conexao.desconectar();
            return false;
        }
    }
    
    public String inserirNF(String Numnota, double valor, String online, String status, double nfSaldo, String cpf, double cashback){
        Conecta conexao = new Conecta();
        this.conn = conexao.conectar();
        if (conn==null)
            System.out.println("Erro na conexão");
        else
            System.out.println("Conectado com sucesso");


        try {
            // Mudar Banco
            pstm = conn.prepareStatement("INSERT INTO NF (CPF,DATA, NUMNOTA, SALDO, STATUS, ONLINE, CASHBACK, VALOR, HORA) VALUES (?, ?, ?, ?, ?,?,?,?,?)");
            pstm.setString(1, cpf);
            pstm.setDate(2, java.sql.Date.valueOf(java.time.LocalDate.now()));
            pstm.setString(3, Numnota);
            pstm.setDouble(4, nfSaldo);
            pstm.setString(5, status);
            pstm.setString(6, online);
            pstm.setDouble(7, cashback);
            pstm.setDouble(8, valor);
            pstm.setTime(9, java.sql.Time.valueOf(java.time.LocalTime.now()));
            
            //setDate
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
    
    public ResultSet extratos(String cpf) {
        // Abrindo a conexão com o banco​
        Conecta conexao = new Conecta();
        conn = conexao.conectar();
        try {
            // Instanciando o objeto preparedStatement (pstm)​
            //pstm = conn.prepareStatement("SELECT * FROM DEPT WHERE DNAME = ? ORDER BY DEPTNO");
            pstm = conn.prepareStatement("SELECT * FROM NF WHERE CPF = ? ORDER BY CPF");
            
            //Retornando o ResultSet​
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
        Conecta conexao = new Conecta();
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
    
    public ResultSet buscarCashbackPorCPF(String cpf) {
        // Abrindo a conexão com o banco​
        Conecta conexao = new Conecta();
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
    
    public void atualizaSaldo(double saldo, String cpf) {
        // Abrindo a conexão com o banco​
        Conecta conexao = new Conecta();
        conn = conexao.conectar();
        try {
            // Instanciando o objeto preparedStatement (pstm)​
            pstm = conn.prepareStatement("UPDATE CLIENTES SET SALDO = ? WHERE CPF = ?");
            // Setando o valor ao parâmetro​
            pstm.setDouble(1, saldo);
            pstm.setString(2, cpf);
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

    public String debitaValor(Cliente cliente, String status, double cashback){
        Conecta conexao = new Conecta();
        this.conn = conexao.conectar();
        if (conn==null)
            System.out.println("Erro na conexão");
        else
            System.out.println("Conectado com sucesso");


        try {
            // Mudar Banco
            pstm = conn.prepareStatement("INSERT INTO NF (CPF, DATA, SALDO, STATUS, CASHBACK, HORA) VALUES (?, ?, ?, ?, ?,?)");
            pstm.setString(1, cliente.getCpf());
            pstm.setDate(2, java.sql.Date.valueOf(java.time.LocalDate.now()));
            pstm.setDouble(3, cliente.getSaldo());
            pstm.setString(4, status);
            pstm.setDouble(5, cashback);
            pstm.setTime(6, java.sql.Time.valueOf(java.time.LocalTime.now()));
            
            //setDate
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
}
