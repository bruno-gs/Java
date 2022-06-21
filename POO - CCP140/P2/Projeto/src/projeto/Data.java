package projeto;

public class Data {
    private int mes;
    private int ano;
    
    public Data(int mes, int ano) {
        this.mes = verificaMes(mes);
        this.ano = ano;
    }
       
    private int verificaMes(int mes){
        return (mes <=12 && mes >=1) ? mes : 1;
    }
  
    public int getMes(){
        return this.mes;
    }
    
    public int getAno(){
        return this.ano;
    }
        public void setMes(int mes){
        this.mes = (mes <=12 && mes >=1) ? mes : 1;
    }
    public void setAno(int ano){
        this.ano = ano;
    }

    @Override
    public String toString() {
        return mes + "/" + ano;
    }
    
    
}
