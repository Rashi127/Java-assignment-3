import java.util.Scanner;
public class Multiplication_table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a num- ");
        int n= input.nextInt();
        
       int t;
        
        for(int i =1; i<=20; i++ ){
            t= n*i;
             System.out.println(n + " X " + i + " = " + t);
        }
        
        
        
    }
}
