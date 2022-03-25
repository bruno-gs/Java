package atv5;

public class Corrente {
    private int numConta;
    private double saldo;
    private double limite;
    
    // construtor gerado
    public Corrente(int numConta, double saldo, double limite) {
        this.numConta = numConta;
        this.saldo = saldo;
        this.limite = limite;
    }
    
       
    public boolean creditarSaldo(double quantidade){
        System.out.println("Saldo sera creditado em "+quantidade+"\n");
        this.saldo += quantidade;
        return true;
    }
    
    public boolean debitarSaldo(double quantidade){
        if(saldo - (1.01*quantidade) >= -limite){
            System.out.println("Saldo sera debitado em "+quantidade*1.01+"\n");
            this.saldo -= (1.01 * quantidade);
            return true;
        }
        else{
            System.out.println("Saldo nao sera debitado.\nSem saldo e sem limite"+"\n");
            return false;
        }
    }
    
    // ToString gerado

    @Override
    public String toString() {
        return "Conta corrente {" + "numConta=" + numConta + ", saldo=" + saldo + ", limite=" + limite + '}';
    }
}