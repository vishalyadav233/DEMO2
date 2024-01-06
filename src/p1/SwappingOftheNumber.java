package p1;

// Without using of the Third  varabile into the java 

public class SwappingOftheNumber  {
	
	public static void main(String[] args) {
		
		int x  = 10 ; 
		int y = 20 ;
		System.out.println(" the value of x Before Swapping"+x);
		System.out.println("The value of the y Before Swapping"+y);
		
		int temp;
		 
		temp = x ;
		x =y;
		y = temp;
		
		
		System.out.println(" the value of x After Swapping"+x);
		System.out.println("The value of the y after Swapping"+y);
		
		
	}
	
	
	

}
