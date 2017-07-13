package sololearn;
import java.util.*;
public class EqualIndex {
public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number of elemnts in an array:");
	int n=s.nextInt();
	int array[]=new int[n];
	int index[]=new int[n];
	for(int i=0;i<n;i++) {
		 array[i]=s.nextInt();
	}
	for(int i=0;i<n;i++) {
		if(array[i]==i) {
			System.out.print(i+" ");
		}
		else {
			continue;
		}
	}
	
	
}
}
