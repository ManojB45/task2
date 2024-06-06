package task2;


public class Account {

	
	String name ;
	int accountno;
	String city;
	double Balance;
	  
	public Account()
	{
		System.out.println();
	}
	
	public Account(String name,int accountno,String city,double Balance)
	{
		this.name=name;
		this.accountno=accountno;
		this.city=city;
		this.Balance=Balance;
	}
	

	public void deposite(double amount)
	{
		if(amount>0)
		{
			this.Balance=this.Balance+amount;
			System.out.println("updated Balance"+this.Balance);
		}
	}
	 public void withdraw(double amount)
	 {
		 if(this.Balance>amount)
		 {
			 this.Balance=this.Balance-amount;
			 System.out.println("updated Balance"+this.Balance);
		 }
	 }
	 public String checkbalance()
	 {
		 return checkbalance();
	 }
	 
	 

	@Override
	public String toString() {
		return "Account [name=" + name + ", accountno=" + accountno + ", city=" + city + ", Balance=" + Balance + "]";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account data=new Account();
		Account data1=new Account("manu", 12344,"Banglore",60000);
		
		System.out.println(data);
		System.out.println(data1);
		
		data1.deposite(5000);
		data1.withdraw(3000);
	}

}
