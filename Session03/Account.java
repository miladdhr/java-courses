package ThirdSession;

public class Account {
	
	
	private double balance;          
	 private String branch;            
	 private String name;
	 
	
	
	 public Account(double balance, String branch, String name) {
		super();
		this.balance = balance;
		this.branch = branch;
		this.name = name;
	}
	  
	 
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Account [balance=" + balance + ", branch=" + branch + ", name=" + name + "]";
	}    
 

}
