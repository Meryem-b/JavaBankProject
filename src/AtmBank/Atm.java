package AtmBank;
import java.util.Scanner;

//bu paket daha fazla yapılcak vaktim kalmadı
//BankData worker clasına baglanıp daha fazla işlem yapılacak

public class Atm  extends BankData.Human{

	 public void calis(Hesap hesap){
		 
	        Login login = new Login();
	        
	        Scanner input = new Scanner(System.in);
	        
	        System.out.println("MSB bankaciliga hosgeldiniz");
	        
	        System.out.println("*************************");
	        System.out.println("User Login");
	        System.out.println("*************************");
	        int giris_hakki = 3;
	        
	        while (true) {  
	            if (login.login(hesap)) {
	                System.out.println("Login Successful...");
	                break;
	                
	            }
	            else{
	                System.out.println("Login Failed...");
	                giris_hakki -= 1;
	                System.out.println("Your Remaining Entry Right: " + giris_hakki);
	                
	            }
	            if(giris_hakki == 0){
	            
	                System.out.println("Your Login Expired. Try again later...");
	                return;
	            }
	            
	        }
	       
	        
	    }
	}