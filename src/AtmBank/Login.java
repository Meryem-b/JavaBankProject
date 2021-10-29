package AtmBank;

//bu paket daha fazla yapılcak vaktim kalmadı
//BankData worker clasına baglanıp daha fazla işlem yapılacak

import  java.util.Scanner;

public class Login {
    public boolean  login(Hesap hesap){
        
        try (Scanner input = new Scanner(System.in)) {
			String parola;
			
    
			System.out.print("Enter your password: ");
			parola = input.nextLine();
			
			if ( hesap.getParola().equals(parola)) {
			  
			  return true;
			}
			else{
			    return false;
			}
		}
    
    } 
}