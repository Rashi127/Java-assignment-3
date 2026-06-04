import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a num- ");
        int n= input.nextInt();
        int r=0;
        int d;
        
        while(n>0){
            d=n%10;
            r= (r*10)+d;
            n=n/10;
        }
        
        
        System.out.println("Rverse=" + r);
    
    }
}