package BankData;

public class OldCompany implements Company.hisse {


  // Implementing the capabilities of
    // interface.
   
	@Override
	public int calistir(int x, int y) {
		 if(x==y) {
		return x;
		}else {
			 return y;
		 }
	}
	
	
}

