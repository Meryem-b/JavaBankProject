package Employee;


//bu paket daha fazla yapılcak vaktim kalmadı
//BankData worker clasına baglanıp daha fazla işlem yapılacak


public class Manager  extends BankEmployee{ // ya bu clası da abstract yapıcaksın ya da override yapcaksın yani üztüne yazıcaksın
		
		protected static int oy=0;  //static oldugunda özel bir hafızada oldugu için herkes ona erişiyor.Test clasında iki nesne de aynı seye erişti
		//her bir nesne cagırıypr.kaç tane nesne yaparsam o kadar artıyor
		
		boolean gorev= true; //gorevini yapar mı 
	    
		
		public boolean IsGorev() {  //basına is gelir. yapar mı vs derken
			System.out.println("Sekreter gorevini iyi yapar mı(true or false): " + gorev);
			return gorev;
		}
		
		
		public Manager() { //sayacı artıran constractor var
			 oy++;
		}
		
		
		/* GETTER AND SETTER */ 
		public static void setOy(int x) { //degiştirmek için bazen istersem olmaz
			if(x >0 ) {
				oy = x;
			
	}
		}
		
		public static int getOy() { // dısarının alabilcegi fonk
			//yani dısardan biri bu fonk ile alıcak
			return oy;
		}

		
		//override
		public void maas() {
			System.out.println("Sekreterin net maası 3000");
		}
		
		public final void yetki() {
			System.out.println("Sekreter olarak is akıs yetkimi kimseye devretmem");
		}
		
		
	}
