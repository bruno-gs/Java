package Televisao;

public class Televisao {
    private int canal;
    private int som;
    private boolean ligada;
    
    // criando o construtor
    public Televisao(){
	this.ligada = false;
        this.som = 0;
    }
	
    public Televisao(int canal, int som){
        this.canal= canal;
        this.som= som;
    }
		
    public Televisao(int canal, int som, boolean ligada){
        this.canal= canal;
        this.som= som;
        this.ligada= ligada;
    }

  // metodos pedidos
    public void aumentarVolume(){
            if (som == 10){
                System.out.println("Volume no maximo - 10");
            }   
            else{
                this.som += 1;
                System.out.println("Som: "+this.som);
            }
    }

    public void diminuirVolume(){
            if (som == 0){
                System.out.println("Volume no minimo - 0");
            }
            else{
                this.som -= 1;
                System.out.println("Som: "+this.som);
            }
    }

    public boolean subirCanal(){
            if (canal < 64){
                System.out.println("Passando ao proximo canal");
                this.canal += 1;
                return true;
            }
            else{
                System.out.println("Canal maximo");
                return false;
            }
        
    }

    public boolean descerCanal(){
        if (canal > 1){
            System.out.println("Descendo um canal");
            this.canal -= 1;
            return true;
        }
        else{
            System.out.println("Canal minimo");
            return false;
        }
    }

    public boolean LigaOuDesligaTV(){
      	if (this.ligada == true){
            System.out.println("Desligando a Televisao");
            this.ligada = false;
            this.som=0;
            this.canal=1;
            return false;
        }
  	else{
            this.ligada = true;
            System.out.println("Ligando a Televisao");
            return true;
  	}
    }
    
    // definindo os get
    public int getCanal(){
      System.out.println(this.canal);
      return this.canal;
    }
    
    public int getSom(){
      System.out.println(this.som);
      return this.som;
    }
    
    public boolean getLigada(){
      //System.out.println(this.ligada);
      return this.ligada;
    }
    
    // set 
    public void setCanal(int canal){
      if(canal > 64){
        System.out.println("Canal invalido - colocando no maior - 64");
        this.canal = 64;
      }
      else if(canal<1){
        System.out.println("Canal invalido - colocando no menor - 1");
        this.canal =1;
      }
      else{
        this.canal = canal;
      }
    }
    public void setLigada(boolean ligada){
      
      this.ligada = ligada;
    }
        
    @Override
    public String toString(){
      return "Canal: " + canal + " Volume: " + som + " Status: " + ligada; 
    }
}
