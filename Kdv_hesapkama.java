import java.util.Scanner;
public class Main2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float fiyat;
        float kdv = 0.20f;
        System.out.println("Fiyatı giriniz: ");
        fiyat   = input.nextFloat();
        float kdvFiyat = fiyat * kdv;
        float toplam = fiyat + kdvFiyat;
        System.out.println("Ham fiyat: " + fiyat);
        System.out.printf("Kdv fiyatı: %.2f\n" , kdvFiyat);
        System.out.printf("Kdv dahil fiyatı: %.2f\n" , toplam);

        input.close();



    }
}
