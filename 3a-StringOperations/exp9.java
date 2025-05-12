package strings;
import java.util.Random;
public class exp9 {
    public static String RandomString(int length) {
     
        String charset = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        Random rand = new Random();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int randomIndex = rand.nextInt(charset.length());
            sb.append(charset.charAt(randomIndex));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int length = 10;


        System.out.println("length " + length + ": " + RandomString(length));
    
    }

}
