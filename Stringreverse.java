package stringbased;
import java.util.*;
public class Stringreverse {
public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	String str=s.next();
	StringBuffer str1=new StringBuffer(str);
	System.out.println(str1.reverse());
}
}
