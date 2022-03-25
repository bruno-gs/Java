package ativ_4;

public class PhoneBook {
    private String nome;
    private int telefone;
    
    public PhoneBook(String nome, int telefone){
        this.nome = nome;
        this.telefone = telefone;
    }
    public String getNome(){
        return nome;
    }
    public int getTelefone(){
        return telefone;
    }
}
