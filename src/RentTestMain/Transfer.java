package RentTestMain;

import java.util.Arrays;
import java.util.List;

public class Transfer extends BankData.Landlord{


		
			public static void main(String[] args) {
				 BankData.Landlord hesapNo1 = new  BankData.Landlord();
				hesapNo1.deposit(500.0);
				 BankData.Landlord hesapNo2 = new  BankData.Landlord();
			    hesapNo2.deposit(200.0);
			    
			    hesapNo1.transfer(100);
			    hesapNo2.withdraw(50.0);
			    hesapNo2.withdraw(600.0);
			    System.out.println(hesapNo2.getBalance());
			    
			    System.out.println();
			    
			    List<Integer> intSeq = Arrays.asList(50,60,70);
			
			 
				intSeq.forEach( x -> { 
					
					x+= yil + yillikEnflasyon;
				 System.out.println("uncontracted annual inflation rate: " +x);
				 });
				
				
				
			 
		}
		}
