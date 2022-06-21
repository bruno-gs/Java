package clientes;

/**
 *
 * @author ilidio
 */
abstract class CashBack {
    private String cpf;
    private double saldo;
    private DAO dao;
    private Cliente cliente;
    
    public CashBack(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public CashBack(String cpf, double saldo) {
        this.cpf = cpf;
        this.saldo = saldo;
    }
    
    public boolean debitarSaldo(Cliente cliente, double valor) {
        cpf = cliente.getCpf();
        saldo = cliente.getSaldo();
        if(valor > saldo){
            System.out.println("Saldo Indisponivel\n");
            return false;
        } 
        else {
            dao = new DAO();
            System.out.println("Saldo sera debitado em "+valor+"\n");
            saldo -= valor;
            cliente.setSaldo(saldo);
            dao.atualizaSaldo(saldo, cpf);
            return true;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    void setSaldo(double saldo) { // está como package -- não consegue usar no main
        this.saldo = saldo;
    }
}
