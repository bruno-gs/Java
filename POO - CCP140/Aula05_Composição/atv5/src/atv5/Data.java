package atv5;

public class Data {
    private int dia;
    private int mes;
    private int ano;
    
    // criando o construtor
    public Data(int dia, int mes, int ano){
        this.dia = verificaDia(dia);
        this.mes = verificaMes(mes);
        this.ano = ano;
    }
    
    private int verificaDia(int dia){
        return (dia <=31 && dia >=1) ? dia : 1;
    }
    
    private int verificaMes(int mes){
        return (mes <=12 && mes >=1) ? mes : 1;
    }
    
    // definindo os get
    public int getDia(){
        return this.dia;
    }
    
    public int getMes(){
        return this.mes;
    }
    
    public int getAno(){
        return this.ano;
    }
    
    // set para nome
    public void setDia(int dia){
        this.dia = (dia <=31 && dia >=1) ? dia : 1;
    }
    public void setMes(int mes){
        this.mes = (mes <=12 && mes >=1) ? mes : 1;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    
    @Override
    public String toString(){
        return dia + "/" + mes + "/" + ano;
    }
}
