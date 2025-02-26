import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç dersin notunu gireceksiniz? ");
        int dersSayisi = scanner.nextInt();

        double toplam = 0;

        for (int i = 1; i <= dersSayisi; i++) {
            System.out.print(i + ". dersin notunu girin: ");
            double not = scanner.nextDouble();
            toplam += not;

        }
        if (dersSayisi == 0 ){
            System.out.println("Ders sayısı en az 1 olmalıdır!");
            return;
        }


        double ortalama = toplam / dersSayisi;
        System.out.println("Not ortalamanız: " + ortalama);

        if (ortalama >= 50) {
            System.out.println("Tebrikler! Geçtiniz.");
        } else {
            System.out.println("Üzgünüm, kaldınız.");
        }

        scanner.close();
    }
}
