import java.util.Scanner;
public class Loop_EVEN_num {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the num- ");
        int N= input.nextInt();
        int X=1;
        while(X<=N){
            if(X%2==0){
            System.out.println("the number " + X + " is EVEN!");
           }
           X++;
        }
        
        
        
       
    }
}
