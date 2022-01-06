package JavaBasics;

public class LoopsConcept {

	public static void main(String[] args) {
		//1.while loop
		//disadvntg of while loop- it will generate infinite loop if you do not give incremental or decremental part
		int i=0;
		while(i<=100) {
			System.out.println(i);
			i=i+1;	
		}
		System.out.println("*****");
		//j++ means j is increase by 1
		
		//2.for loop
		for(int j=1;j<=10;j++){ //initilization,conditional part,incremental
			System.out.println(j);
		}
		
		System.out.println("******");
		
		//print 10 to 1
		for (int k=10;k>=1;k--){
			System.out.println(k);
		}
				

	}

}
