import java.util.Scanner;
public class Main2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float price;
        float tax = 0.20f;
        System.out.println("Fiyatı giriniz: ");
        price   = input.nextFloat();
        float taxPrice = price * tax;
        float total = price + taxPrice;
        System.out.println("Entered price: " + price);
        System.out.printf("Tax price: %.2f\n" , taxPrice);
        System.out.printf("Total: %.2f\n" , total);

        input.close();



    }
}
