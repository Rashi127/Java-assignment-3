import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a num- ");
        int n= input.nextInt();
        int x,f=1;
        x=n;
        while(n>0){ 
            
            f=  f * n;
            n--;
            
        }
        System.out.println("The factorial of " + x + " is " + f);
        
    }
}
