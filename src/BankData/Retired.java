package BankData;



public class Retired  extends Human{

         private int retiredSalary;
		 private int bonus;

		
		 
			public void setInfo(String cname, String csurname, int cage, int ctc,int cid, int cretiredSalary, int cbonus) {
			    super.setInfo(cname, csurname, cage,ctc,cid); 
			    retiredSalary =cretiredSalary;
			    bonus = cbonus;
			  } 
		
		 
		  public void writeInfo() {
			  super.writeInfo();
			  System.out.println("Pensioner's salary in your family: " + retiredSalary + " , " + " annual bonus " + bonus );
		  }


		@Override
		public double sumCost(double service) {
			return super.sumCost(service);
		}
		  
		 
		  
	}
