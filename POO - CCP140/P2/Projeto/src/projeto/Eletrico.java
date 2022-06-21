package projeto;

/**
 *
 * @author uniebrunosil
 */
public class Eletrico extends Veiculo {
    private Data dataPrevistaEntrega;

    public Eletrico(Data dataPrevistaEntrega, String marca, String modelo, int ano) {
        super(marca, modelo, ano);
        this.dataPrevistaEntrega = dataPrevistaEntrega;
    }

    @Override
    public String toString() {
        return "Elétrico: " +super.getMarca()+" " + super.getModelo() +" com data Prevista de Entrega=" + dataPrevistaEntrega.toString();
    }    
}
