package packageschedatelefonica;

import java.util.*;


public class Rubrica  {
           //     Key   Value
    NavigableMap<String,Long> map = new TreeMap<>();     //HASHMAP ORDINAMENTO CASUALE, TREEMAP INVECE ORDINATE RIFERENDOSI ALLA CHIAVE
    
    Persona persona = new Persona("",0L);
    
    Scanner input = new Scanner(System.in);
    
    String risp = input.nextLine();
    
 //////////////////////////////////////METODI////////////////////////////////////////////////////////////
    public Long aggiungi(String nome,long numero){    //SALVA UN NUMERO IN RUBRICA
    
     return map.put(nome, numero);
    }
    
    public Long mionum (Persona p){               //INSERISCE IL MIO NUM IN RUBRICA
    
    String nome="Mio numero";
    
    long numero=3929469637L;
    
    return map.put(nome,numero);
    }
    
    public void cancella(){                      //SVUOTA L INTERA HASHMAP O TREEMAP
     
     map.clear();
    }
    
    public HashMap elimina(String nome){               //ELIMINA IL NUMERO IN RUBRICA X NOME
        
        map.entrySet().forEach(entry -> {            //for(HashMap.Entry<String,Long>entry :map.entrySet()){ FOR PIU' COMPLESSO, SOSTITUITO CON LAMBDA
            String key = entry.getKey();
            Long value = entry.getValue();
            
            if(key.equalsIgnoreCase(nome)){
                map.remove(key, value);
                System.out.println("Rimosso ");
            }else System.out.println("Contatto non trovato");
        });    
    
    return null;
    }
    
    public HashMap ricerca(String nome){                  //RICERCA UN CONTATTO X NOME
        
        map.entrySet().forEach(entry -> {                   //ESPRESSIONI LAMBDA
            String key = entry.getKey();
            Long value = entry.getValue();
            // if(map.containsKey(key)){
            if(key.equalsIgnoreCase(nome)){
                System.out.println("Contatto :"+map.get(key));
            }else System.out.println("Contatto non trovato");
        });
    
    return null;
    }
    
    public void mostra(){                               //MOSTRA L INERA RUBRICA
        
        map.entrySet().forEach(entry -> {
            String key = entry.getKey();
            Long value = entry.getValue();
            
            System.out.println("Contatto : "+key+"->"+value);
        });
       
    }
    
    public void durataChiamate(){                      //CALCOLA LA DURATA IN MILLESECONDS
	  
      long startTime = System.currentTimeMillis();
      Scanner input= new Scanner(System.in);
      System.out.println("Chiamata in corso...\nPremere un tasto x chiudere!!!");
      input.nextLine();
      long endTime = System.currentTimeMillis();
      long seconds = (endTime - startTime) / 1000;
      System.out.println("La chiamata è durata "+ seconds + " SECONDI");	
  
     }
    
      public void chiama(Persona p){                   //METODO CHE TELEFONA
	  
	String risp1 = input.nextLine();	  
	 while(risp1.equalsIgnoreCase("Y")){  
		System.out.println("Premi invio x chiamare..");
           if (risp.equalsIgnoreCase("N"))
		System.out.println("Chiamata terminata "); break;	  
	 }
  }
      
        public void costoChiamata(){               //NON FUNZIONA DA RIVEDERE !!!!
            
         float credito=0f;      //SE INSERISCO CREDITO LO CONSUMA TUTTO APPENA CHIUDO LA CHIAMATA QUALSIASI SIA LA DURATA
         
	 long startTime = System.currentTimeMillis();
         
	 long endTime = System.currentTimeMillis();  
         
	 long seconds = (endTime - startTime) / 1000;
        
	 float creditoSpeso = (float) (credito -(0.20F) -(0.05F * seconds)); 
        
        // float creditoResiduo = (float) credito - (creditoSpeso);
         
	 System.out.println("Il costo della chiamata è "+ creditoSpeso+" €");
	 
  }


}

