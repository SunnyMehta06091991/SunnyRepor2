
public class ReverseInteger {

	
	public static void main(String[] args) {
		
		int i = 12345;
		
		//int sum  =0;
		int rem;
		while(i > 0){
			
			rem = i % 10 ;
            System.out.print(rem);
            i = i /10;
           
		}
		
		int j = 12345;
		
		System.out.println( "----------" + "StringBuffer Class" + "--------");
		StringBuffer text = new StringBuffer(String.valueOf(j));
		
		System.out.println(text.reverse());
	}
}
