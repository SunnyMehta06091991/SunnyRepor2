
public class JunkCharacters {

	public static void main(String[] args) {
		
		

		String test = "关于  loting Stirng 关于除";
		
		//Regular Expression u need to use... [^a-zA-Z0-9]
		
		
		test = test.replaceAll("[^a-zA-Z0-9]","");
		
		System.out.println(test);
		
		
		String test1 = "Sunny Mehta";
		
		test1 = test1.replaceAll("[n]", "a");
		test1 =test1.replace('u', 'a');
				System.out.println(test1);
				
				System.out.println("A" + "B" + 'A');
	}
}
