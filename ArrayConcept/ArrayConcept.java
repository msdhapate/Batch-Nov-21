package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
	//Array: used for to store similar data types values in a array varaible
		//1.int array
		//lowest bound/index = 0
		//upper bound/index = n-1 where (n is size of array)
		// One Dimensional array
		//advantages- store multiple values in single varaibles with similar data tyeps
		//disadvantages-
		   //1.size is fixed----static array, to overcome this problem--we use Collections--Arraylist,Hashtable--use dynamic array
		   //2.store only similar data types---to overcome this problem,we use object array
		
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		System.out.println(i[0]);
		System.out.println(i[3]);
		
		//System.out.println(i[4]);  //Arrayindex out of bound exception( error on console) 
		
		System.out.println(i.length);
		
		//print all the values of array: use for loop
		for(int j=0;j<i.length;j++) {
		System.out.println(i[j]);	
		}
		
		//2. double array:
		double d[] = new double[3];
		d[0] = 12.33;
		d[1] = 11.33;
		d[2] = 10.11;
		System.out.println(d[1]);
		
		//3. char Array
		char c[] = new char[3];
		c[0] ='a';
		c[1] =100;
		c[2] ='@';
		
		//4.  boolean array
		boolean b[] = new boolean[2];
		b[0] = true;
		b[1] = false;
		
	//5. string Array
		String s[] = new String[3];
		s[0] ="ajay";
		s[1] ="mahesh";
		s[2] ="hello";
		System.out.println(s.length);
		System.out.println(s[1]);
		
		//6. Objects Array:(Object Is Class)----is used to store different data types values 
		Object ob[] = new Object[6];
		ob[0] = "kartik";
		ob[1] = 12;
		ob[2] = 12.33;
		ob[3] = 'G';
		ob[4] = true;
		ob[5] ="28/12/2021";
		System.out.println(ob[3]);
		System.out.println(ob.length);
		
		
				
		
	}

}
