package BankData;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import BankData.Company.hisse;

public class MainTest {
   int k = 100;
   public static void main(String[] args)throws CloneNotSupportedException{
		
		// kredi kartı hakkında bilgiler verir
		
		
		System.out.println();
		CreditCard card1 = new CreditCard(); //referans olusturdum.
		CreditCard card2 = new CreditCard(20,5000); // constructor icin referans
		CreditCard card3 = new CreditCard();  // overloading icin referans

		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Your Name and Surname?");
			String CardName= scan.nextLine(); // kullanicidan String input alma.
				
			System.out.println("Your TR ID number?");
			int CardTc= scan.nextInt(); // kullanicidan integer input alma.
				
			
			System.out.println("Dear " + CardName + " welcome to our bank ");
			System.out.println("Your ID card number: " + CardTc);
		     System.out.println();
	   
	    	
	    	
		}
			
			
			System.out.println("-----------------------------------------------------------------------------------");
			
			System.out.println("Credit card transactions");
		
		card2.showInfos(); //metodumu cagırıyorum
		card3.showInfos(); 
		
		System.out.println();
		
		System.out.println("Your account is now open, " +card1.start("welcome") ); 
		card1.setColor("gold");
		System.out.println("your card color is: " + card1.getColor());

		System.out.println("Your credit card limit is set: " + CreditCard.limit(3000.7,0.6));
		System.out.println();
		
		System.out.println("-----------------------------------------------------------------------------------");
		
		
	   // CALISAN İSLEMLERİ 
		System.out.println("Employee information of your family");
		Worker work = new Worker();
	    work.setInfo("Meryem", "bolat", 22, 123456, 5, 8500, "Siemens",1); 
		work.writeInfo();
	    System.out.println("raise rate is:" + work.raise(150));
	   
	    System.out.println("Your net salary that will come with an annual increase as of January: " +work.getSalary());  // 100 iken 150 oldu
	    System.out.println();
	    
	    System.out.println("-----------------------------------------------------------------------------------");
		
     
	    //OGRENCİ İSLEMLERİ
	    System.out.println("Student information of your family");
		Student ogr = new Student();
		ogr.setInfo("ali", "bolat", 23, 34566, 9 , 11500 , 1234, 5000 , 3, 4);  
		ogr.writeInfo();
		System.out.println("general kyk debt calculation data is defined in Kyk class in another package.");
		System.out.println();
		  
		System.out.println();
	    
	    System.out.println("-----------------------------------------------------------------------------------");
	    
	    //EMEKLİ İSLEMLERİ
	    System.out.println("Your family's retirement information");
	     Retired  reti = new Retired();
	     reti.setInfo("Sumeyye", "bolat", 26, 1245,3,4000, 945); 
         reti.writeInfo();
         
         System.out.println("-----------------------------------------------------------------------------------");
 		
        
        //YENİ MÜŞTERİ 
       System.out.println("New customer account data.");
	    NewCustomer mst = new NewCustomer();
		System.out.println(mst); // tostring ile bir objeyi stringe cevirdim.
		mst.setInterestDiscount(10);
		
		 NewCustomer mst2 = ( NewCustomer)mst.copy();// deep copy. yani copyalanınca icerigi degismiyor
		System.out.println("Our new customer discount: " + mst.getInterestDiscount());
		System.out.println("You are taking advantage of the customer discount, your current discount rate is: " + mst2.getInterestDiscount());
		if(mst == mst2) {
			System.out.println("fixed customer discounts.");
		}
		else if(mst.equals(mst2)) {
			 NewCustomer obj = new  NewCustomer(); // default constuctor
			 NewCustomer obj2 = obj; //shallow copy
			obj.setInterestDiscount(13);
			// System.out.println(obj.yasi  + " and " + obj.id);
			if(obj.equals(obj2)) {
				System.out.println(" YES ");
			}else {
				System.out.println(" NO");
			}
			System.out.println("Extra customer discounts accepted."
					+ " Your current discount amount " + obj.getInterestDiscount());
		}
		
		
	System.out.println("-----------------------------------------------------------------------------------");
	
			
   		Human obj = new Human(); // default constuctor
		Human obj2 = obj; //shallow copy(sıg kopyalama)
		obj.age=30;
		obj.setId(30);
		// System.out.println(obj.yasi  + " and " + obj.id);
		if(obj.equals(obj2)) {
			System.out.println("your age and id is equal, you can use this id. ");
		}else {
			System.out.println("not equals");
		}
		
		System.out.println();
		
		System.out.println("-----------------------------------------------------------------------------------");
		
		
	    System.out.println(obj.age); 
	     obj.increase(2); //insan clasındaki metodu  cagırdım
	     System.out.println("your new age: " + obj.age); 
	     
		System.out.println("-----------------------------------------------------------------------------------");
		
		 
		System.out.println("You can also select these passwords");
		  List<Integer> intSeq = Arrays.asList(1,2,3);
			// intSeq.forEach(x ->  System.out.println(x));
			MainTest lt = new MainTest();
			int z=10;
			intSeq.forEach( x -> { 
				x+= lt.k - 2- z;
			 System.out.println(x);
			 });
	
			
		
		
		    System.out.println();
			
			System.out.println("-----------------------------------------------------------------------------------");
			

		// COMPANY
		System.out.println("Company information: ");
		hisse l= ((x,y) -> ((x * y )/ 100 ));
		System.out.println("your stock ratio in the new company: " + 
		l.calistir(30, 40) + " $.");
		
		///////////////////////////////////////////////////////
		
		  OldCompany t = new  OldCompany();
	        System.out.println( "your old corporate debt " + t.calistir(9,800) + " $.");
	        
	        System.out.println("new share without paying your old share debt, you cannot buy.");
	        
	      
	      
		
			
	        
	        System.out.println();
	    	card1.stop();
	}
	
	
		 
	
						
}		
