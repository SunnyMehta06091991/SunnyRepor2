
public class ReverseString {

	
	public static void main(String[] args) {
		
		String test  ="Sunny";
		System.out.println(test.length());
		
		for (int i= test.length()-1 ; i>=0;i--){
			
			System.out.print(test.charAt(i));
			
		}
		
		System.out.println();
		System.out.println("------" + "By StringBuilderClass" + " ------");
		
		StringBuilder s = new StringBuilder("Sunny");
		System.out.print(s.reverse());
		
		System.out.println();
		System.out.println("------" + "" + " ------");
       
	}
}
