import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 4-digit num- ");
        int n= input.nextInt();
        int x;
        x=n;
        
        int a,b,c,d,r;
        a=n%10;
        n=n/10;
        
        b=n%10;
        n=n/10;
        
        c=n%10;
        n=n/10;
        
        d=n%10;
        n=n/10;
        
        
        r=(a*1000)+(b*100)+(c*10)+d;
        
        if(r==x){
            System.out.println("The given number is a Palondrome number!");
            
        } else{
            System.out.println("The given number is not a Palondrome number!");
        }
    
    }
}
