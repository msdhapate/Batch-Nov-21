package OOPConceptpart2;

public class HSBCBank implements USBank,BrazilBank { //We are achieving multiple inheritance or IS-A relationship
	//HAS-A--RELATIONSHIP means class to class relationship
	
	//If a class is implementing any interface,then its mandatory to define/override all the methods of interface
	
	
	//this 3 methods are overriding from usbank
	public void credit() {
		System.out.println("hsbc--credit");
	}
	
	public void debit() {
		System.out.println("hsbc--debit");
	}
	
	public void transfermoney() {
		System.out.println("hsbc--transfermoney");
	}
	
	
	//these 2 methods are sepereate methods of hsbc
	public void educationanloan() {
		System.out.println("hsbc--eduloan");
	}
	
	public void carloan() {
		System.out.println("hsbc--carloan");
	}
	
	
	// overridden from Brazil bank method
	public void mutualfund(){
		System.out.println("hsbc mutualfund");
	}
	

}
