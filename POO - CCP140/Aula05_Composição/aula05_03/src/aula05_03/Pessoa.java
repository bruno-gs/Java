package aula05_03;

public class Pessoa {
    private String nome;
    private String cpf;
    private Data nascimento;

    public Pessoa(String nome, String cpf, Data nascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
    }
    
    public Pessoa(String nome, String cpf, int dia, int mes, int ano) {
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = new Data(dia, mes, ano); // aqui quer receber um objeto
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Data getNascimento() {
        return nascimento;
    }

    public void setNascimento(Data nascimento) {
        this.nascimento = nascimento;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", cpf=" + cpf + ", nascimento=" + nascimento + '}';
    }
    
    
}
