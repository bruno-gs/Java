package ativ_4;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList <PhoneBook> contato = new ArrayList<>();
        String escolha;
        System.out.println("Bem-Vindo ao gerenciador de agenda");
        while(true){
            System.out.println("\nAs operações são:\n"
                    + "- n: Criar uma nova pessoa na agenda\n"
                    + "- d: Deleta uma pessoa da agenda\n"
                    + "- p: Imprime toda a agenda\n"
                    + "- S: Ver telefone de uma pessoa da agenda\n"
                    + "- q: Finalizar do programa\n");
            System.out.println("Escolha a operação: ");
            escolha = input.next();
            
            if(escolha.equals("n")){
                System.out.println("Digite o nome do contato: ");
                String nome = input.next();
                System.out.println("Digite o número do contato: ");
                int numero = input.nextInt();
                contato.add(new PhoneBook(nome, numero));
            }
            
            else if(escolha.equals("d")){
                System.out.println("Digite o nome do contato que deseja excluir: ");
                String nome = input.next();
                
                int contador = 0;
                for(PhoneBook pessoa : contato){
                    if(pessoa.getNome().equals(nome)){
                        System.out.println("O contato, Nome: " + pessoa.getNome()+" com Número: " + pessoa.getTelefone() + " será excluído");
                        contato.remove(contador);
                        break;
                    }
                    else{
                        contador ++;
                    }
                }
            }
            
            else if(escolha.equals("p")){
                System.out.println("Sua agenda é: \n\n" + "Nome" + "|Telefone");
                
                for(PhoneBook pessoa : contato){
                    System.out.println(pessoa.getNome()+"|"+ pessoa.getTelefone());
                }
            }
            
            else if(escolha.equals("S")){
                System.out.println("Digite o nome do contato que deseja verificar: ");
                String nome = input.next();
                
                int contador = 0;
                for(PhoneBook pessoa : contato){
                    if(pessoa.getNome().equals(nome)){
                        System.out.println("O contato " + pessoa.getNome()+" tem o Número: " + pessoa.getTelefone());
                    }
                    else{
                        contador ++;
                        if(contador == contato.size()){
                            System.out.println("Contato não encontrado!");
                        }
                    }
                }             
            }  
            
            else if(escolha.equals("q")){
                System.out.println("Fechando sua agenda...");
                break;                
            }           
        }
    }
    
}
