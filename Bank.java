package week4.day1;

public class Bank extends SBI implements CIBIL,PNB {

	@Override
	public void maximumLoanAmount() {
		// TODO Auto-generated method stub
		System.out.println("maximumLoanAmount");
	}

	@Override
	public void creditScore() {
		// TODO Auto-generated method stub
		System.out.println("creditScore");
	}

	@Override
	public void minimumBalance() {
		// TODO Auto-generated method stub
		System.out.println("minimumBalance");
	}

	@Override
	public void cibilScore() {
		// TODO Auto-generated method stub
		System.out.println("cibilScore");
	}

	@Override
	public void bankBalance() {
		// TODO Auto-generated method stub
		System.out.println("bankBalance");
	}

	@Override
	public void maximumloanAmount() {
		// TODO Auto-generated method stub
		System.out.println("maximumLoanAmount");
	}
public static void main(String[] args) {
	
	Bank obj1=new Bank();
	obj1.bankBalance();
	obj1.itLoan();
	
	PNB obj2=new Bank();
	obj2.creditScore();
	obj2.maximumLoanAmount();
	obj2.minimumBalance();
	
	CIBIL obj3=new Bank();
	obj3.cibilScore();

	
	
	
}
}

