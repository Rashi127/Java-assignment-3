import java.util.Scanner;
public class Prime_no {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a num- ");
        int n= input.nextInt();
        int c=0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                c++;
            }
        }
        
        if(c==2){
            System.out.println(n + " is a Prime number.");
        } else{
            System.out.println(n + " is NOT a Prime number.");
        }
        
        
    }
}
