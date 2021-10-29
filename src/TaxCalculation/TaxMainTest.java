package TaxCalculation;
import java.util.Scanner;

public class TaxMainTest extends BankData.Human{

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Adiniz, soyadiniz?");
			String insan= input.nextLine(); 
			System.out.println(" Sayın " + insan + " , ");
			     
			
			System.out.println(" Yillik verginzin hesaplanmasi icin Gelirinizi Giriniz?");
			gelir=input.nextDouble();
		}
		
        if(gelir<=15000)
		{
			vergi=gelir*0.25;
		}
		else if(gelir>15000 && gelir<=30000)
		{
			vergi=gelir*0.30;
		}
		else if(gelir>30000 && gelir<=60000)
		{
			vergi=gelir*0.35;	
		}
		else if(gelir>60000 && gelir<=120000)
		{
			vergi=gelir*0.40;
		}
		else if(gelir>120000)
		{
			vergi=gelir*0.50;
		}
		System.out.println("Devlete odemeniz gereken vergi miktari : "+ vergi);
		System.out.println("Verginiz maasınızdan kesildigi zaman odeyeceginiz tutar : "+ (gelir-vergi));
	}
 
}
 

