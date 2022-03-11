public class Televisao{
    private int canal;
    private int som;
    private boolean ligada;
    
    // criando o construtor
		public Televisao(){
			this.ligada = false;
      this.som = 8;
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

  // métodos pedidos
		public void aumentarVolume(){
				if (som == 10){
						System.out.println("Volume no máximo - 10");
				}
				else{
					this.som += 1;
          System.out.println("Som: "+this.som);
				}
		}

    public void diminuirVolume(){
  		if (som == 0){
  			System.out.println("Volume no mínimo - 0");
  			}
  		else{
  			this.som -= 1;
        System.out.println("Som: "+this.som);
  		  }
  		}

    public void subirCanal(){
  		if (canal >= 64){
        System.out.println("Retornando ao canal 1");
  			this.canal = 1;
        }
  		else{
  			this.canal += 1;
        System.out.println("Canal: "+this.canal);
  			}
  		}

    public void descerCanal(){
  		if (canal <= 1){
        System.out.println("Retornando ao canal 64");
  			this.canal = 64;
        }
  		else{
  			this.canal -= 1;
        System.out.println("Canal: "+this.canal);
  			}
  		}

    public void LigaOuDesligaTV(){
  		if (ligada == true){
        System.out.println("Desligando a Televisão");
  			this.ligada = false;
        }
  		else{
  			this.ligada = true;
        System.out.println("Ligando a Televisão");
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
      System.out.println(this.ligada);
      return this.ligada;
    }
    
    // set 
    public void setCanal(int canal){
      if(canal > 64){
        System.out.println("Canal inválido - colocando no maior - 64");
        this.canal = 64;
      }
      else if(canal<1){
        System.out.println("Canal inválido - colocando no menor - 1");
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