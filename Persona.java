package packageschedatelefonica;

public class Persona {
    
    private String nome;
//    private String indirizzo;
    private Long numero;
    
    public Persona(String nome,long numero){
    
    this.nome=nome;
 //   this.indirizzo=indirizzo;
    this.numero=numero;
    
    }
    
    public void setNome(String nome){
    
    this.nome=nome;
    }
    
 /*   public void setIndirizzo(String indirizzo){
    
    this.indirizzo=indirizzo;
    }*/
    
    public void setNumero(Long numero){
    
    this.numero=numero;
    }
    public String getNome(){
    
    return this.nome;
    }
    
 /*   public String getIndirizzo(){
    
    return this.indirizzo;
    }*/
    
    public Long getNumero(){
    
    return this.numero;
    }
    
}

