class Main {
  public static void main(String[] args) {
    Televisao sala = new Televisao();

    sala.setCanal(65);
    sala.setLigada(true);
    sala.getSom();
    sala.getCanal();
    sala.getLigada();
    
    
    for (int contador=0; contador<=11; contador += 1){
	    sala.aumentarVolume();
      }

    for (int contador=1; contador<=68; contador += 1){
	    sala.subirCanal();
      }

    
    for (int x=11; x>=0; x-= 1){
	    sala.diminuirVolume();
      }

    for (int contador=69; contador>=0; contador -= 1){
	    sala.descerCanal();
      }

    sala.LigaOuDesligaTV();
    
    System.out.println(sala);
    
    
    
  }
}