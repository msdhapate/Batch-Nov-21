package OOPConceptPart1;

public class WrapperCassConcept {

	public static void main(String[] args) {
		String x = "100";
		System.out.println(x+20);
		// data conversions ---> String to int:
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		// integer, double, boolan
		
		// String to double conversion
		String y = "12.33";
		double d = Double.parseDouble(y);
	   System.out.println(d);
	   
	   // String to boolean 
	   String k = "true";
	   boolean b = Boolean.parseBoolean(k);
	   System.out.println(b);
	   
	   // int to string conversion
	   
	   int j = 200;
	   String s = String.valueOf(j);
	   System.out.println(j);
	   System.out.println(s+20);
	   
	   String  u = "100A"; // NOT POSSIBLE-->because not a pure integer  --No Of Format exception type error will come
	   

	}

}
