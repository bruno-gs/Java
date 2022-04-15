package atv07;

public class Poupanca extends Conta {

    public Poupanca(int numConta, double saldo) {
        super(numConta, saldo);
    }
    
    public boolean debitarSaldo(double quantidade) {
        double saldo_atual = super.getSaldo();
        if(quantidade > saldo_atual){
            System.out.println("Saldo Indisponivel\n");
            return false;
        } 
        else {
            System.out.println("Saldo sera debitado em "+quantidade+"\n");
            saldo_atual -= quantidade;
            super.setSaldo(saldo_atual);
            return true;
        }
    }
    
    
    // ToString gerado

    @Override
    public String toString() {
        //return super.toString() + "** Conta poupanca: " + "numConta=" + super.getNumConta() + ", saldo=" + super.getSaldo() + '\n';
        return "** " + "numConta=" + super.getNumConta() + ", saldo=" + super.getSaldo() + '\n';

        
    }
    
}
