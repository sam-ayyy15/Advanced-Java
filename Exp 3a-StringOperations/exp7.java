package strings;

public class exp7 {
	

		    public static String truncate(String str, int maxLength) {
		        if (str == null) {
		            return null;
		        }
		        if (str.length() <= maxLength) {
		            return str;
		        } 
		        else {
		            return str.substring(0, maxLength) + "...";
		        }
		    }

		    public static void main(String[] args) {
		        String str= "hello i am samay and today is java class";
		       
		        int maxLength = 10;

		        System.out.println("Original: " +str);
		        System.out.println("Truncated to " + maxLength + ": " + truncate(str, maxLength) ); 
		       
		    }
}


