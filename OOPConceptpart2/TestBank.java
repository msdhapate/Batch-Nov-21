package OOPConceptpart2;

public class TestBank {

	public static void main(String[] args) {
		
		System.out.println(USBank.min_bal);
		HSBCBank hs = new HSBCBank();
		hs.credit();
		hs.debit();
		hs.educationanloan();
		hs.transfermoney();
		hs.carloan();
		
		//Dynamoc polymorphism
		//child class object can be referred by parent interface reference vars
		
		USBank b = new HSBCBank();
		b.credit();
		b.debit();
		b.transfermoney();
		
		

	}

}
