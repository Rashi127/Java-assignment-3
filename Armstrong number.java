import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-digit num- ");
        int n= input.nextInt();
        int x;
        x=n;
        
        int a,b,c,A, a1,b1,c1;
        a=n%10;
        n=n/10;
        
        b=n%10;
        n=n/10;
        
        c=n%10;
        n=n/10;
        
        a1= a*a*a;
        b1=b*b*b;
        c1=c*c*c;
        
        A=a1+b1+c1;
        
        if(A==x){
            System.out.println("The given number is a Armstrong number!");
            
        } else{
            System.out.println("The given number is not a Armstrong number!");
        }
    
    }
}
