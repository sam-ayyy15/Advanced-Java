/*
 8.Write a Java program to insert the specified element at the end of a linked list.
 */
package listInterface;
import java.util.*;
public class p8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> ls = new LinkedList<>();
		ls.add("Orange");
		ls.add("geen");
		ls.add("pink");
		ls.add("red");
		ls.add("Blue");
		System.out.println(ls);
		ls.addLast("pink");
		System.out.println(ls);
	
	}

}
