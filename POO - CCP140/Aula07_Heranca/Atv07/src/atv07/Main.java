package atv07;

public class Main {
    public static void main(String[] args) {
        ClienteBanco bruno = new ClienteBanco("Bruno Fritz", "351351351", new Data(25,3,2022));
        System.out.println(bruno);
        
        bruno.abreConta(tipoConta.POUPANCA);
        System.out.println(bruno);
        bruno.abreConta(tipoConta.POUPANCA);
        System.out.println(bruno);
        bruno.abreConta(tipoConta.CORRENTE);
        System.out.println(bruno);
        bruno.abreConta(tipoConta.SALARIO);
        System.out.println(bruno);
        bruno.abreConta(tipoConta.POUPANCA);
        System.out.println(bruno);
        
        bruno.getContasPoupancas()[0].creditarSaldo(2000);
        bruno.getContasPoupancas()[0].creditarSaldo(18000);
        bruno.getContasPoupancas()[1].creditarSaldo(1000);
        
        System.out.println(bruno);
        
        bruno.getContasPoupancas()[1].debitarSaldo(800);
        bruno.getContasPoupancas()[1].debitarSaldo(800);
        bruno.getContasPoupancas()[1].debitarSaldo(200);
        
        System.out.println(bruno);
        
        bruno.getContaCC().debitarSaldo(1000);
        bruno.getContaCC().debitarSaldo(500);
        bruno.getContaCC().debitarSaldo(400);
        
        System.out.println(bruno);
        
        bruno.getContaCC().creditarSaldo(20000);
        
        System.out.println(bruno);
        
        bruno.getContaSalario().debitarSaldo(10);
        bruno.getContaSalario().creditarSaldo(1000);
        bruno.getContaSalario().creditarSaldo(520);
        bruno.getContaSalario().debitarSaldo(1500);
        
        System.out.println(bruno);
    } 
}
