package Employee;


//bu paket daha fazla yapılcak vaktim kalmadı
//BankData worker clasına baglanıp daha fazla işlem yapılacak


public class GeneralManager extends Manager{ // yani genel sekreter de bir sekreter calısan
		
		
		/*
		public void yetki() {
			System.out.println("en yetkili benim");
			//sekreter dedi ki final olarak işte sen bunu override edemezsin 
			//hata verdi
			}
		*/
		
		
		/* GETTER AND SETTER */ 
		 public static int getOy() { // dısarının alabilcegi fonk
			//yani dısardan biri bu fonk ile alıcak
			return oy;
		}
		
		
		public void yetki(String yetki) {
			System.out.println("Genel sekreter olarak burada en yetkili benim");
			//final için
			//ama overloading yapabilir.cünkü farklı özellik tanımlanıyor.
			//override edemezsin.
			}
			
		
		//override
		public void maas() {
			System.out.println("Genel Sekreterin net maası 5000");
		}

	}


