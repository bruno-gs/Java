package atv8;

public class main {

    public static void main(String[] args) {
//        Conecta conexao = new Conecta();
//        if(conexao.conectar() == null)
//            System.out.println("Erro ao conectar");
//        else
//            System.out.println("Conectado com sucesso");

        Agenda agenda = new Agenda();
        
        //agenda.inserir(new Pessoa("Bruno", "(11) 90000-1000"));
        //agenda.inserir(new Pessoa("Ju", "(11) 90000-1000"));
        agenda.remover("Ju");
    }
    
}
