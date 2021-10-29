package KykTestMain;

import java.util.Scanner;

import BankData.Student;

public class Kyk extends  BankData.Student {

//ders paketindeki Ogreci clasını protected ile kullanmak için extends etmem lazım.

	
	 public static void main(String [] args) {
		 System.out.println("Burs bitiminde ek olarak odeyeceginiz faiz miktarini baz alarak sozlesmeyi kabul ettiniz.");
		
		  try (Scanner input = new Scanner(System.in)) {
				System.out.println(" kyk borcunuzun  hesaplanmasi icin aldığınız aylık burs miktarini yaziniz?");
				balance=(int) input.nextDouble();
			}
			if(balance<=200)
			{
				inflationRate=balance*0.35;
			}
			else if(balance>200 && balance<=400)
			{
				inflationRate=balance*0.50;
			}
			else if(balance>400 && balance<=500)
			{
				inflationRate=balance*0.35;	
			}
			else if(balance>500 && balance<=700)
			{
				inflationRate=balance*0.40;
			}
			else if(balance>800)
			{
				inflationRate=balance*0.50;
			}
			System.out.println();
			
			
			System.out.println("Burs bitiminde ISSIZ iken odenecek aylik ekstra faiz miktari : "+ inflationRate);
			System.out.println("Odemezseniz  aylik ekstra faiz miktari : "+ (balance - inflationRate));
		
	        
			
			System.out.println();
			
		     System.out.println("Ali bolata ait kyk bilgileri:" );

	        System.out.println();
	        System.out.println(Student.year() + " yil burs aldiniz.");
	        System.out.println("enflasyonlu toplam borc miktarınız: " + Student.kalanBorc() + " turklirasi.");
	        
	        System.out.println();
		    System.out.println("Aldıginiz aylik burs miktarı: " + Student.balance+ " turklirasi.");
	    //    System.out.println("Hesaptaki bakiye: " + ogr.paraCekme(400) + " turklirasi.");
		
		    System.out.println("Aylik odenmesi gereken borc: " + Student.kykDeptPay(568) + " turklirasi.");
		  

}
}