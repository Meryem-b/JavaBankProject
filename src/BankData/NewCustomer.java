package BankData;


public class NewCustomer extends Human implements Cloneable{


	 private int interestDiscount; //Faiz indirimi
	

		public void setInfo(String cname, String csurname, int cage, int ctc,int cid, int cinterestDiscount) {
		    super.setInfo(cname, csurname, cage,ctc,cid); 
		    interestDiscount = cinterestDiscount;
		  } 
	
	 
	  public void writeInfo() {
		  super.writeInfo();
		  System.out.println("Newcustomer's interest discount rate is: " + interestDiscount  );
	  }

	 

	  
		//mainde srettigim objeyi klonlÄ±yor
		Object copy() throws CloneNotSupportedException{
			return this.clone();
		}

	boolean equals(NewCustomer rhs) {
		return this.interestDiscount == rhs.interestDiscount;
		//override = ustune bindirmek demek, yani equals fonk aten var yazdırıyor
		
		// equals override ettim yeni fonnksiyonla.
		// equals override ettik. deep copy de ontrol ettigim main ile burası
		
	}


	public int getInterestDiscount() {
		return interestDiscount;
	}


	public void setInterestDiscount(int interestDiscount) {
		this.interestDiscount = interestDiscount;
	}
	
	

}
