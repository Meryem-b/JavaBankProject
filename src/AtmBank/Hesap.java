package AtmBank;

//bu paket daha fazla yapılcak vaktim kalmadı
//BankData worker clasına baglanıp daha fazla işlem yapılacak

public class Hesap {
    private String parola;
   
    // counstroctur fonksiyonunu tanÄ±mladÄ±m burada.
    public Hesap( String parola){
    
        
        this.parola =  parola;
       
    }
    
	
   public String getParola(){
       return parola;
   }
   public void setParola(String parola){
       this.parola = parola;
   }
  


   
}