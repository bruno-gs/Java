package aula05_03;

public class main {

    public static void main(String[] args) {
        Data nasc01 = new Data(31, 01, 2020);
        Pessoa pess01 = new Pessoa("Bruno","322.323.323-1",new Data(20, 04, 2020));
        Data nasc02 = new Data(20, 04, 2022);
        Pessoa pess02 = new Pessoa("Ju","201.333.333-1",new Data(20, 04, 1999));
        Pessoa pess03 = new Pessoa("JAIR", "111.111.111-1", 14, 8, 2000);
        
        System.out.println(pess01);
        System.out.println(pess02);
        System.out.println(pess03);
        
        pess03.setNome("JAIRZAO");
        pess03.setNome("222.222.122-9");
        System.out.println(pess03);
        
        pess02.setNascimento(new Data(20,12,1651));
        System.out.println(pess02);
        System.out.println(pess02.getNascimento());
        System.out.println(pess02.getNascimento().getAno());
        pess02.getNascimento().setAno(1567);
        System.out.println(pess02);
    }
    
}
