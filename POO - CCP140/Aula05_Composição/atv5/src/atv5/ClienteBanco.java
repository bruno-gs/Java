package atv5;
import java.util.concurrent.ThreadLocalRandom; // importando a classe


public class ClienteBanco {
    private String nome;
    private String cpf;
    private Data ClienteDesde;
    private Corrente contaCC;
    private Poupanca contasPoupancas[] = new Poupanca[2];
    
    ThreadLocalRandom tlr = ThreadLocalRandom.current(); // instanciando

    // construtor gerado    
    public ClienteBanco(String nome, String cpf, Data ClienteDesde){
        this.nome = nome;
        this.cpf = cpf;
        this.ClienteDesde = ClienteDesde;
    }

    public boolean abreConta(TipoConta tipo) {
        if(null == tipo){
            System.out.println("Tipo de conta invalido");
            return false;
        }
        else // Entrando em criação de poupanca
        switch (tipo) {
            case POUPANCA:
                // condição para ver se já tem uma conta poupanca, se não tiver, faz
                if(this.contasPoupancas[0] == null){
                    // inicializar um número de conta aleatório
                    this.contasPoupancas[0] = new Poupanca(tlr.nextInt(1000, 99998 + 1), 0);
                    //System.out.println("Conta Criada.\n");
                    return true;
                }
                else if(this.contasPoupancas[1] == null){
                    // inicializar um número de conta aleatório
                    this.contasPoupancas[1] = new Poupanca(tlr.nextInt(10000, 99998 + 1), 0);
                    //System.out.println("Conta Criada.\n");
                    return true;
                }
                else{
                    System.out.println("Ja possui o numero maximo de contas poupanca.\n");
                    return false;
                }
            case CORRENTE:
                this.contaCC = new Corrente(tlr.nextInt(1000000, 9999998 + 1), 0, 500);
                return true;
            default:
                System.out.println("Tipo de conta invalido");
                return false;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Data getClienteDesde() {
        return ClienteDesde;
    }

    public void setClienteDesde(Data ClienteDesde) {
        this.ClienteDesde = ClienteDesde;
    }

    public Corrente getContaCC() {
        return contaCC;
    }

    public void setContaCC(Corrente contaCC) {
        this.contaCC = contaCC;
    }

    public Poupanca[] getContasPoupancas() {
        return contasPoupancas;
    }

    public void setContasPoupancas(Poupanca[] contasPoupancas) {
        this.contasPoupancas = contasPoupancas;
    }
    
    

    @Override
    public String toString() {
        return "======= Cliente do Banco Fritz =======\n\n"
                + "nome: " + nome
                + "\nCPF: " + cpf + "\n"
                + "Cliente desde: " + ClienteDesde + "\n"
                + "Conta corrente: " + contaCC + "\n"
                + "Conta Poupanca 1: " + contasPoupancas[0]
                + "\nConta Poupanca 2: " + contasPoupancas[1]+"\n";
    }
}
    
        
