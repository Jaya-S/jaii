# jaii
import java.util.Scanner;
public class reversenumber {
  public static void main(String []args){
   	int n, reverse=0;
   	System.out.println("Enter the reverse number");
    	Scanner in=new Scanner(System.in);
    	n=in.nextInt();
    	while(n!=0){
     	reverse =reverse*10;
      	reverse=reverse+n%10;
      	n=n/10;
      }	
     	System.out.println("Reverse the entered number is"+reverse);
    		
   	}
  }

