package atv07;

public class Conta {
    private int numConta;
    private double saldo;

    public Conta(int numConta, double saldo) {
        this.numConta = numConta;
        this.saldo = saldo;
    }
    
    public boolean creditarSaldo(double quantidade) {
        System.out.println("Saldo sera creditado em "+quantidade+"\n");
        this.saldo += quantidade;
        return true;
    }

    public int getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    void setSaldo(double saldo) { // está como package -- não consegue usar no main
        this.saldo = saldo;
    }
    
    //@Override
    //public String toString() {
    //    return "** Conta:\n" + "NumConta: " + numConta + ", saldo: " + saldo + '\n';
    //}
    
    
}
