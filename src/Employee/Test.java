package Employee;


//bu paket daha fazla yapılcak vaktim kalmadı
//BankData worker clasına baglanıp daha fazla işlem yapılacak


public class Test {
	
		
		public static void main(String args[]) {
			Manager skrt= new Manager();
		    GeneralManager gnlskrt = new GeneralManager();
		    System.out.println("iki banka çalısan adayinin oylari: ");
			System.out.println("Sema Hanım: " + Manager.getOy());
			System.out.println("Ayse Hanım: " + GeneralManager.getOy());
			
			
			skrt.IsGorev();
			skrt.yetki();
			gnlskrt.yetki("yetki");
			
			System.out.println();
			
			skrt.maas();
			gnlskrt.maas();
			
			
			
			
			
			
		}

	}

