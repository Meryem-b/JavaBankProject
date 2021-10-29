package BankData;

public class Human {
	
	  public String name;   
	  public String surname;
	  public int age;    
	  protected int tc;
	  private int id;
	  public  int counter1, counter2, season;
	  public static   double cost;
	  public double unitFee = 3.00;
	
	  protected static double  gelir;
	  protected static double vergi=0;
	 
		public void setInfo(String cname, String csurname, int cage, int ctc,int cid) {
	    name = cname;
	    surname = csurname;
	    age = cage;
	    tc = ctc;
	    id = cid;
	  } 

	  public void writeInfo() {
	    System.out.println("Data recorded by you and your family in our bank: " + " Name: " + name + "." + " Surname: " + surname + ". " + " Age: " + 
	    		age + ". " + " Turkish Identity Number: " + tc + ". " + " password: " + id);
	  }  
	
	 
	  public double sumCost(double service)
	    {
	        cost = (Math.abs(counter2-counter1)*unitFee);
	        switch(season)
	        {
	            case 1:
	            	service = service - service*10/100;
	                break;

	            case 2:
	            	service = service - service*1/100;
	                break;

	            case 3:
	            	service = service;
	                break;

	            case 4:
	            service = service - service*7/100;
	                break;
	        }
	        return service;
}


	  
	  public Human() {  //constructor
		//constructor class ile aynÄ± isme sahip ve return type yok 
		System.out.println("Opened to new data.");
	   }

	  /*
	  public Insan(String adi,String soyadi) { // parametreli constructor
		  this.adi=adi;
		  this.soyadi=soyadi;
		//polymorpism ile alakalÄ± tekrar parametereli constructor tanÄ±mlamak.
		//bunu yapÄ±nca default constructorÄ±n iÃ§ine deger verebilicem yani:
		// Insan sema = new Insan(20,80,20); yazabilim
		//parametreli constructor tanÄ±mlarsam boÅŸ aynÄ±sÄ±nÄ± da tanÄ±mla (yukardaki gibi)
	}
	*/
		///////////////////////////////////////////////////////////////////////////////////

		void increase(int i) {
					age++;
			//insanl±n yaptıgı fiiller yani metotlar
		  	// yemek yeme sonunda iÃ§bir ÅŸey Ã¼retmiyor olsun
		  	// tek yaptÄ±gÄ± kilomuzu artÄ±rmak olsun 
		 }

		///////////////////////////////////////////////////////////////////////////////////

		//toString'i override edicem
		public String toString() {
			return "user of this bank" + this.name;
		}

		///////////////////////////////////////////////////////////////////////////////////
		
		public void setId(int id) {
			System.out.println("The bank id number can only be the following passwords.");
         }
	     public int getId() {
			return id;
		}
	     
	    ///////////////////////////////////////////////////////////////////////////////////
		
		 
	

	
}
