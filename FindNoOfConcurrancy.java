package assessment3.nov16;

public class FindNoOfConcurrancy {

	 public static void main(String[] args)
	    {
	        String str = "pallavi";
	       
	        int count[] = new int[200];
	 
	        for (int i = 0; i < str.length(); i++)
	            count[str.charAt(i)] ++ ;
	       
	        
	        for (int i = 0; i < str.length(); i++) {
	        	
	            int counter = 0;
	            for (int j = 0; j <= i; j++) {
	 
	                if (str.charAt(i) == str.charAt(j))
	                	counter++;
	            }
	 
	            if (counter == 1)
	                System.out.println("Character " + str.charAt(i)  + " is concurrance at " + count[str.charAt(i)] + " time ");
	        }
	    }
	   
	}

