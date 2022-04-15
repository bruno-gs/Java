package atv07;

public class Corrente extends Conta{
    private double limite;

    public Corrente(double limite, int numConta, double saldo) {
        super(numConta, saldo);
        this.limite = limite;
    }
    
    
    public boolean debitarSaldo(double quantidade){
        double saldo_atual = super.getSaldo();
        if(saldo_atual - (1.01*quantidade) >= -limite){
            System.out.println("Saldo sera debitado em "+quantidade*1.01+"\n");
            saldo_atual -= (1.01 * quantidade);
            super.setSaldo(saldo_atual);
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
        //return super.toString() + " ** Conta corrente: " + "NumConta=" + super.getNumConta() + ", saldo=" + super.getSaldo() + ", limite=" + limite + '\n';
        return " ** " + "NumConta=" + super.getNumConta() + ", saldo=" + super.getSaldo() + ", limite=" + limite + '\n';
    }
}