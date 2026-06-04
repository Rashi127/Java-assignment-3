import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a num- ");
        int n= input.nextInt();
        int x,d;
        int p=0;
        x=n;
         while(n>0){
            d=n%10;
            p=(p*10)+d;
            n=n/10;
         }
         if(p==x){
            System.out.println("The given number is a Palondrome number!");
            
        } else{
            System.out.println("The given number is not a Palondrome number!");
        }
    
    }
}