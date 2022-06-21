package clientes;

/**
 *
 * @author ilidio
 */
public class Cliente {
    private String cpf;
    private String nome;
    private String senha;
    private double saldo;

    public Cliente() {
    }
    
    public Cliente(String cpf, String nome, String senha) {
        this.cpf = cpf;
        this.nome = nome;
        this.senha = senha;
        this.saldo = 0;
    }
    
    public Cliente(String cpf, String senha) {
        this.cpf = cpf;
        this.senha = senha;
    }

    public Cliente(String cpf, String nome, String senha, double saldo) {
        this.cpf = cpf;
        this.nome = nome;
        this.senha = senha;
        this.saldo = saldo;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public double getSaldo () {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    

    @Override
    public String toString() {
        return "Cliente - " + "CPF: " + cpf + " / Nome: " + nome + " / Senha: " + senha + '\n';
    }
}
