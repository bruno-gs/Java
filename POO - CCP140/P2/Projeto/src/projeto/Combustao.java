package projeto;

/**
 *
 * @author uniebrunosil
 */
public class Combustao extends Veiculo {
    private int km;

    public Combustao(int km, int ano, String marca, String modelo) {
        super(marca, modelo, ano);
        this.km = km;
    }

    @Override
    public String toString() {
        return "Combustão: " +super.getMarca()+" " +super.getModelo()+ " ano="+super.getAno()+" km=" + km;
    }
}
