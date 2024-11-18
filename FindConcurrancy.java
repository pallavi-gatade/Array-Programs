package assessment3.nov16;

public class FindConcurrancy {

	public static void main(String[] args) {
	String str = "pallavi";
	
	int count = 0;
	
	int strLength = str.length();
	  
	for(int i = 0; i < strLength; i++) {
		
		for(int j = i + 1; j < strLength; j++) {
			
			if(str.charAt(i) == str.charAt(j)) {
				count++;
			}
			
		}
		System.out.println("Character " + str.charAt(i) + " is "+ count );
	}
	
	
	}
}
