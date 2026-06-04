import java.util.Scanner;
public class Armstrong_Number
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = input.nextInt();
		int x,d;
		x=n;
		int c=0;
		
		while(n>0){
		    c++;
		    n=n/10;
		}
		
		n=x;
		int A=0;
		int p=1;
		while(n>0){
		    d=n%10;
		    n=n/10;
		    for(int i=1; i<=c; i++){
		        p=p*d;
		    }
		    A=A+p;
		}
		if(A==x){
		    System.out.println("The given number is a Armstrong number.");
		} else{
		    System.out.println("The given number is NOT a Armstrong number.");
		}
	}
}