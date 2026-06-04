import java.util.Scanner;
public class Number_Guessing_Pattern{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a num- ");
        int n= input.nextInt();
        for(int i=1; i<=n; i++){
            if(i%3==0){
                if(i%5==0){
            System.out.println("FizzBuzz");
            } else{
                System.out.println("Fizz");
              }
            } else if(i%5==0){
                System.out.println("Buzz");
            } else{
                System.out.println(i);
            }
        }
    }
}