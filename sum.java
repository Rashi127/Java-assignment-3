import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 4-digit num- ");
        int n= input.nextInt();
        
        int a,b,c,d,s;
        a=n%10;
        n=n/10;
        
        b=n%10;
        n=n/10;
        
        c=n%10;
        n=n/10;
        
        d=n%10;
        n=n/10;
        
        
        s=a+b+c+d;
        System.out.println("sum=" + s);
    
    }
}
