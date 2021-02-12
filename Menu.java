package packageschedatelefonica;

import java.time.LocalDateTime;
import java.time.format.*;
import java.util.*;

public class Menu {
        
    Rubrica rub = new Rubrica();
    Persona pers = new Persona("",0L);
    String risp = "";
    Scanner input = new Scanner(System.in);
    
    public Menu(){
      
      Persona p1 = new Persona("Mio numero",3929469637L);         //IL MIO NUMERO
      rub.mionum(p1);
      LocalDateTime it = LocalDateTime.now();          
      DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.MEDIUM);
      System.out.println("***********************************");
      System.out.println(it.format(formatter));
      
    do{
                                                                    //MENU'
        try{
            
            System.out.println("===================================");
            System.out.println(" Digita 1 x inserire nuovo contatto \n Digita 2 x rimuovere un contatto \n "
                    + "Digita 3 x cercare un contatto \n Digita 4 x visualizzare la rubrica \n Digita 5 x chiamare \n "
                    + "Digita 6 x formattare rubrica" );
            System.out.println("===================================");
            
                if((risp.equalsIgnoreCase("y")|| risp.equalsIgnoreCase("si")));
          
           else if((risp.equalsIgnoreCase("n")|| risp.equalsIgnoreCase("no")|| risp.equalsIgnoreCase("fine")))break;

          int scelta= input.nextInt();
          input.nextLine();
        
        switch(scelta){
        
            case 1:
                                                                    //INSERISCI 
                System.out.println("Inserisci nome e cognome");
                pers.setNome(input.nextLine());
                System.out.println("Inserisci numero di tel.");
                pers.setNumero(input.nextLong());
                input.nextLine();
                rub.aggiungi(pers.getNome(),pers.getNumero());
                System.out.println("Continui si/no?");
                risp=input.nextLine();
                
                break;
                
            case 2:
                                                                   //CANCELLA
                System.out.println("Digita il nome da eliminare ");
                rub.elimina(input.nextLine());
                System.out.println("Continui si/no?");
                risp=input.nextLine();

                break;
                
            case 3:
                
                System.out.println("Digita il nome da cercare ");      //RICERCA
                rub.ricerca(input.nextLine());
                System.out.println("Continui si/no?");
                risp=input.nextLine();

                break;
                
            case 4 :
                                                                   //VISUALIZ RUBR
                System.out.println("Rubrica: ");
                rub.mionum(p1);
                rub.mostra();
                System.out.println("Continui si/no?");
                risp=input.nextLine();

                break;
            
            case 5:                                             //X TELEFONARE
                
                System.out.println("Premi invio x chiamare...");
                rub.chiama(pers);
                rub.durataChiamate();
                rub.costoChiamata();
                System.out.println("Continui si/no?");
                risp=input.nextLine();

                break;
                
            case 6:                                          //X SVUOTARE LA RUBRICA
                
                System.out.println("Vuoi cancellare tutto? S/N");
                risp=input.nextLine();
                if(risp.equalsIgnoreCase("s")||risp.equalsIgnoreCase("y")||risp.equalsIgnoreCase("si")){
                    rub.cancella();
                }else if(risp.equalsIgnoreCase("no")||risp.equalsIgnoreCase("n")){
                System.out.println("Ritorna al menù principale si/no?");
                risp=input.nextLine();
                }
                
                break;
                
            default:
                
                System.out.println("Scelta errata ");
                System.out.println("Continui si/no?");
                risp=input.nextLine();
                
                break;                
        
        }
        
        }catch(Exception e){                              //ECEZZIONE PARTE ANCHE NEL CASE 3 MA FUNZIONA UGUALMENTE
        
                System.out.println("Digita un numero");
                System.out.println("Continui si/no?");
                input.nextLine();
            //    risp=input.nextLine();
          
        }
    
    }while((risp.equalsIgnoreCase("s")||risp.equalsIgnoreCase("si")||risp.equalsIgnoreCase("y")));
    
               System.out.println("Ciao...");
    
    }
    
}
