import java.util.Scanner;
public class Number_Guessing_Pattern{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a num- ");
        int n= input.nextInt();
        if(n%3==0){
            if(n%5==0){
            System.out.println("FizzBuzz");
            } else{
                System.out.println("Fizz");
            }
        } else if(n%5==0){
            System.out.println("Buzz");
        } else{
            System.out.println(n);
        }
    
    }
}
