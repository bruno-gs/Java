package atv5;

public class main {
    public static void main(String[] args) {
        ClienteBanco bruno = new ClienteBanco("Bruno Fritz", "351351351", new Data(25,3,2022));
        System.out.println(bruno);
        
        bruno.abreConta(TipoConta.POUPANCA);
        System.out.println(bruno);
        bruno.abreConta(TipoConta.POUPANCA);
        System.out.println(bruno);
        bruno.abreConta(TipoConta.CORRENTE);
        System.out.println(bruno);
        bruno.abreConta(TipoConta.POUPANCA);
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
    } 
}
