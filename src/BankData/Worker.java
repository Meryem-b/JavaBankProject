// insan sınıfı özellikleri de erişir kalıtım yoluyla.
package BankData;

public class Worker  extends Human {

	 private int salary;
	 private String department; //departmanı
	 private int service; //hizmet yılı

	

	 
	public void setInfo(String cname, String csurname, int cage, int ctc,int cid, int csalary, String cdepartment, int cservice) {
	    super.setInfo(cname, csurname, cage,ctc,cid); 
	    salary = csalary;
	    department = cdepartment;
	    service=cservice;
	  } 

	  
	  public void writeInfo() {
	    super.writeInfo();
	    System.out.println("Your salary information: Salary= " + salary + " , " +  " Department: " + department + " , " + " seniority year= " + service);
	  }  
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	 
	 public  int raise(int rate) { //raise yani zam oranı
			 return rate;
		} 
	  
	  
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		public int getSalary() {
			return salary+raise(150);
		}


		public void setSalary(int salary) {
			this.salary = salary;
		}


		public String getDepartment() {
			return department;
		}


		public void setDepartment(String department) {
			this.department = department;
		}


		public int getService() {
			return service;
		}


		public void setService(int service) {
			this.service = service;
		}


	
		

	

		
	}

