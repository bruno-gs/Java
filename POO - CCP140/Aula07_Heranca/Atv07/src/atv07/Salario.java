package atv07;

public class Salario extends Conta {

    public Salario(int numConta, double saldo) {
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
            saldo_atual -= (1.01 * quantidade);
            super.setSaldo(saldo_atual);
            return true;
        }
    }
   
    @Override
    public String toString() {
        //return super.toString() + "** Conta salario: " + "numConta=" + super.getNumConta() + ", saldo=" + super.getSaldo() + '\n';
        return "** " + "numConta=" + super.getNumConta() + ", saldo=" + super.getSaldo() + '\n';
    }
    
}
