package BankData;

public class CreditCard {
	private String color;
    private double credit;
	private double bankRate;

	// private oldugu icin mainde erisilemiyor bu yüzden bazı metodlar belirleyip onların aracılıgı ile erisicem
	// public metod yapacagım.


	//CONSTRUCTOR metod sadece acredit ve bankrate icin denemek istedim.digerleri farklı  metodlarla

	public CreditCard ( double bankRate, double credit) { 
	//class ismi ile birebir aynı olcak constructor
	//icine color ve credi eklicem  mainde onlara deger verdim.
	//islemi daha hızlı yapmak icin consturcot kullanıyorum
		this.bankRate=bankRate;
		this.credit=credit;
 }
	
	
	public static double limit(double credit, double bankRate) {
			return (credit * bankRate);
	     }
		
	// NEW metod, ekrana bastırmak icin:
		public void showInfos() {
			// bu yukardaki 2 degeri yazdırmak istiyorum.main kısmından sysout sildim 
			// bu oldugu icin ona ihtiyac kalmadı. ve this ile erisicem
				System.out.println("bank interest rate: " +this.bankRate);
				System.out.println("maximum limit you can get: " + this.credit);
		}
			
			//TEKRAR CIAGIRMAK YAZDIRMAK iSTERSEM OVERLOADING İŞLEMİ OLUR
		public CreditCard () {
			this(25,6000); 
			}


			// SET GET METODU
		public void setColor(String color) {
			this.color = color;
		}
		
		public String getColor() {
		// colora dıssardan erismek istersem.sadece degerini almak istersem.
		// Deger vermek istemesem bu sekilde:
			return color;
		}
		

		
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		public String start(String a) {
			return a;
		}

	
		public void stop() {
			System.out.println("Your account has been closed.");
		}


	}

	
	

