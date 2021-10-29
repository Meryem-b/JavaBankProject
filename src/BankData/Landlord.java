//EV SAHİBİ PAKETİ
package BankData;

public class Landlord extends Human {

	
	   private double balance;
		private float hesapNo;
		private int phoneNumber;

		protected static int yil=1;
		protected static int yillikEnflasyon=50;
		
		
		 public int counter1;
		public int counter2;
		public int season;
		    double cost, unitFee = 3.00;
	
		 public void setInfo(String cadi, String csoyadi, int cyasi,int ctc,int cid,int cphoneNumber,double cbalance,float chesapNo) {
		    super.setInfo(cadi, csoyadi, cyasi, ctc,cid); 
		    		 
		    phoneNumber = cphoneNumber;
		    balance = cbalance;
		    hesapNo= chesapNo;
		   } 



		public void writeInfo() {
			super.writeInfo();
			 System.out.println("Information about the landlord in your family:" +" total balance: " + balance + " , " + "account number: " + hesapNo + " , " +
			    		 " phone number: " + phoneNumber  );
			  }
			  
 
	
	public void callNumber() {
		phoneNumber = 542;  //  field protected yaptÄ±m eriÅŸti
		System.out.println("After paying the rent, call the line " + phoneNumber );
	}	
	
	public void Account(float hesapNo) {
		this.hesapNo = hesapNo;
		balance = 0.0; // not necessary
	}

	public double getBalance() {
		return balance;
	}
	public float getName() {
		return hesapNo;
	}
	
	public void deposit(double amount) {
		balance += amount;
		System.out.println(hesapNo + " has $ " + balance);
	
	}
	
	
	public void withdraw(double amount) {
		if(amount < balance) {
			balance -= amount;
			System.out.println(hesapNo + " has $" + balance);
		}else {
			System.out.println("witdrawal by " + hesapNo + " fails");
		}
	}
		
		public void transfer(double amount ) {
			if(this.balance< amount) {
				System.out.println("transfer fails");
			}else {
				this.balance -= amount;
				
				System.out.println("account of " + this.hesapNo + "becomes $ " + this.balance);
			}
			}
			
}

	  