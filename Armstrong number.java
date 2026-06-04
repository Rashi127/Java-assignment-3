import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a num- ");
        int n= input.nextInt();
        int x;
        int d=0 ;
        x=n;
        int c=0;
        int A=0;
        
        while(n>0){
            c++;
            n=n/10;
        }
        while(n>0){
            
            for(int i=1; i<=c; i++){
                A=(A*10)+d;
            }
            d=n%10;
        }
        if(A==x){
            System.out.println("The given number is a Armstrong number!");
            
        } else{
            System.out.println("The given number is not a Armstrong number!");
        }
    
    }
}