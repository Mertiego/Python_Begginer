import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a ;
        double b ;
        System.out.println("Enter firt number: ");
        a = input.nextDouble();
        System.out.println("Enter second number: ");
        b = input.nextDouble();

        System.out.println("What you wanna do with them? \n 1-Addition \n 2-Subtraction \n 3-Multiplication \n 4-Divide");
        System.out.print("Select (1-4): ");
        int c = input.nextInt();

        switch(c){
            case 1:
                System.out.println("Result is: " + (a+b));break;
            case 2:
                System.out.println("Result is: " + (a-b));break;
            case 3:
                System.out.println("Result is: " + (a*b));break;
            case 4:
                if (b==0){
                    System.out.println("Error: Division by zero is not allowed!");
                }else{
                    System.out.printf("Result is: %.2f\n", (a/b));
                }
                break;
            default:
                System.out.println("Invalid selection! Please choose a number between 1 and 4.");break;

        }

        
        input.close();
    }
}
