package clientes;

/**
 *
 * @author ilidio
 */
public class CadastrarNF extends CashBack{
    private String Numnota;
    private double valor;
    private String online;
    private String data;
    private String status;
    private double nfSaldo;
    private double valorC;
    private DAO dao;

    public CadastrarNF(String Numnota, double valor, String online, String data, String status, double nfSaldo, double valorC, String cpf, double saldo) {
        super(cpf, saldo);
        this.valor = valor;
        this.online = online;
        this.data = data;
        this.status = status;
        this.nfSaldo = nfSaldo;
        this.valorC = valorC;
        this.Numnota = Numnota;
    }

    public CadastrarNF(Cliente cliente) {
        super(cliente);
    }   
    
    public CadastrarNF(String cpf, double saldo) {
        super(cpf, saldo);
    }
    
    public double CashbackOnline(double saldo, double valor){
        double cashback;
        cashback = 0.05*valor;
        return cashback;
    }
    
    public double CashbackFisica(double saldo, double valor){
        double cashback;
        cashback = 0.02*valor;
        return cashback;
    }
    
    
    public double CreditarOnline(String cpf, double saldo, double valor){
        dao = new DAO();
        double saldo_atual;
        saldo_atual = saldo + 0.05*valor;
        //super.setSaldo(saldo_atual);
        dao.atualizaSaldo(saldo_atual, cpf);
        return saldo_atual;
    }
    
    public double CreditarFisica(String cpf, double saldo, double valor){
        dao = new DAO();
        double saldo_atual;
        saldo_atual = saldo + 0.02*valor;
        //super.setSaldo(saldo_atual);
        dao.atualizaSaldo(saldo_atual, cpf);
        return saldo_atual;
    }
    
    
    
}
