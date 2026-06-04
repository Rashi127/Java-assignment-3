import java.util.Scanner;
public class EVEN_ODD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a num- ");
        int n= input.nextInt();
        int e=0;
        
        int o=0;
       
        int x;
        while(n!=0){
            x=n%10; 
            if(n%2==0){
                e++;
            } else{
                o++;
            }
            n=n/10;
        }
        System.out.println("EVEN: " + e);
        System.out.println("ODD: " + o);
        
        
    }
}
