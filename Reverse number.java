import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 4-digit num- ");
        int n= input.nextInt();
        
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
        System.out.println("Rverse=" + r);
    
    }
}
