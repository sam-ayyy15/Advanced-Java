package strings;

public class exp3 {
	

		    public static String reverseString(String str) {
		        if (str == null) {
		            return null;
		        }
		        StringBuilder reverseStr = new StringBuilder(str);
		        return reverseStr.reverse().toString();
		    }

		    public static void main(String[] args) {
		        String str1 = "hello";
		      

		        System.out.println("Reversed '" + str1 + "': " + reverseString(str1)); 
		     
		    }
}


