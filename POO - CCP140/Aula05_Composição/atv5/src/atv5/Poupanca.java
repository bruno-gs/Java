package atv5;

public class Poupanca {
    private int numConta;
    private double saldo;
    
    // construtor gerado
    public Poupanca(int numConta, double saldo) {
        this.numConta = numConta;
        this.saldo = saldo;
    }
    
    
    public boolean debitarSaldo(double quantidade) {
        if(quantidade > this.saldo){
            System.out.println("Saldo Indisponivel\n");
            return false;
        } 
        else {
            System.out.println("Saldo sera debitado em "+quantidade+"\n");
            this.saldo -= quantidade;
            return true;
        }
    }
    
    public boolean creditarSaldo(double quantidade) {
        System.out.println("Saldo sera creditado em "+quantidade+"\n");
        this.saldo += quantidade;
        return true;
    }
    
    // ToString gerado

    @Override
    public String toString() {
        return "Conta poupanca {" + "numConta=" + numConta + ", saldo=" + saldo + '}';
    }
    
}
