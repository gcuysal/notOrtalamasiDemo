import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int mat, fiz, kimya, biyo, turkce;

        Scanner inp = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz: ");
        mat = inp.nextInt();

        System.out.println("Fizik notunuzu giriniz: ");
        fiz = inp.nextInt();

        System.out.println("Kimya notunuzu giriniz: ");
        kimya = inp.nextInt();

        System.out.println("Biyoloji notunuzu giriniz: ");
        biyo = inp.nextInt();

        System.out.println("Türkçe notunuzu giriniz: ");
        turkce = inp.nextInt();

        double avarage;
        do {
            avarage = (mat + fiz + kimya + biyo + turkce) / 5;
            System.out.println("Ortalamanız: " + avarage);
            break;
        }while ((mat <= 100 && mat >= 0) && (fiz <= 100 && fiz >= 0) && (kimya <= 100 && kimya >= 0) && (biyo <= 100 && biyo >= 0) && (turkce <= 100 && turkce >= 0));

        if (avarage <= 55){
            System.out.println("Başarısız! Seneye tekrar görüşmek üzere :)");
        }else {
            System.out.println("Tebrikler! Sınıfı geçtiniz.");
        }

    }
}
