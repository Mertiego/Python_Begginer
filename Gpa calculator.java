import java.util.Scanner;

public class Main3{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int quiz,vize,ffinal;
        float ortalama;
        String durum;

        System.out.println("Quiz notunu giriniz: ");
        quiz = input.nextInt();

        System.out.println("Vize notunu giriniz: ");
        vize = input.nextInt();

        System.out.println("Final notunu giriniz: ");
        ffinal = input.nextInt();

        ortalama = (quiz * 0.1f) + (vize * 0.4f) + (ffinal * 0.5f);

        durum = (ortalama >= 50 ) ? "Dersten geçtiniz!" : "Dersten kaldınız :(";
        System.out.println("Ortalamanız "+ ortalama +" "+durum);
    }
}
