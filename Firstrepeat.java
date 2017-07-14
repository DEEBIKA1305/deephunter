package sololearn;
import java.util.*;
public class Firstrepeat {
public static void main(String args[]) {
	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number of elemnts in an array:");
	int n=s.nextInt();
	int k=0;
	int repeatarray[]=new int[n];
	int array[]=new  int[n];
	for(int i=0;i<n;i++) {
		 array[i]=s.nextInt();
	}
	for(int i=0;i<n;i++) {
		int count=0;
		for(int j=i+1;j<n;j++) {
			if(array[i]==array[j]) {
				count++;
				
			}
			if(count==1) {
				repeatarray[k]=array[i];
				k++;
				break;
			}
			
		}
	}
	int len=repeatarray.length;
	System.out.println(repeatarray[0]);
	
	
}
}
