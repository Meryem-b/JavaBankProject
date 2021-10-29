package BillTestMain;

import java.util.Scanner;

//İnsan clasına erişir ve her insanın faturası vardır ve sabittir degişiklik göstermez
//BankData kısmında mainde karısıklık olmaması adına fatura tsti için ayrı paket actım

public class BillTest extends BankData.Human{

	    public static void main(String [] args)
	    {
	        try (Scanner klavye = new Scanner(System.in)) {
				BankData.Human fatura1 = new BankData.Human();
				    System.out.println("Seasonal Billing Account");

				    for(int i=1;i<=3;)
				    {
				        System.out.println("1-Summer\\t2-Spring\\t3-Winter\\t4-Autumn");
				        System.out.print("Enter season for bill: ");
				        fatura1.season = klavye.nextInt();
				        System.out.print("First counter for bill: ");
				        fatura1.counter1 = klavye.nextInt();
				        System.out.print("Last counter for bill: ");
				        fatura1.counter2 = klavye.nextInt();
				        System.out.println("Your bill amount: "+fatura1.sumCost(cost)+" $.\n\n");
				        break;
				    }
			}
	    }
	}