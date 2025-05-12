package strings;

public class exp10 {
    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        String str1 = "samay is good";
        String str2 = "";
 

        System.out.println( str1 + ": " + countWords(str1)); 
   
        System.out.println(str2 + ": " + countWords(str2)); 
       
    }

}
