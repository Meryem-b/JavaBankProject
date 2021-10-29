package BankData;

public class Student extends Human{
	
	
	protected static int dept; //borc
	protected static int payment; //odeme
	protected static int balance ; //bakiye
	protected static double inflationRate=0.6;   // enflasyonOranİ
	protected static int year=4;
	public  double cost, unitFee = 3.00;
	
	  

	public void setInfo(String cname, String csurname, int cage, int ctc,int cid, int cdept, int cpayment,int cbalance, double cinflationRate ,
			int cyear ) {
	    super.setInfo(cname, csurname, cage,ctc,cid); 
	    dept = cdept;
	    payment = cpayment;
	    balance= cbalance;
	    inflationRate = cinflationRate;
	    year = cyear;
	   } 


	public void writeInfo() {
		  super.writeInfo();
	    System.out.println("Information about the student in your family:" +" total debt" + dept + " , " + "student's balance " + balance + " , " +
	    		 " year: " + year +  " , " + " The instantaneous inflation rate: " + inflationRate );
	  }
	  

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
		    public void depositMoney (int tutar){ //paraYatir
		       balance +=tutar;
		        System.out.println("Your New Balance:" + balance);
		    }
		    
		    public void withdrawMoney(int tutar){ //PARAC CEKME
		        if(balance - tutar < 0){
		            System.out.println("Not Enough Balance...");
		        }
		        else{
		        	balance-= tutar;
		            System.out.println("Your Current Balance: " + balance);
		        }
		    }

		    
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
		 
		 
		    public static double kykDeptPay(double yatacakMiktar){
		    	return yatacakMiktar;
		        
		    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
			

		 
		   
		   public static int kalanBorc() {
			   return (int) (((balance - dept) * inflationRate * year ) /100);
			}

		   
			public static int year() {
				return year;
			}


			


		
			
}
		 

