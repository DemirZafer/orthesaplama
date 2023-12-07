import java.util.Scanner;
public class Ogreniyorum {
    public static void main(String[] args) {
        int mat, fiz, kimya, turkce, tarih, muzik;
        Scanner veriler= new Scanner(System.in);
        System.out.print("Matematik Notunuz: ");
        mat=veriler.nextInt();
        System.out.print("Fizik notunuz: ");
        fiz=veriler.nextInt();
        System.out.print("kim Notunuz: ");
        kimya=veriler.nextInt();
        System.out.print("Turkce Notunuz: ");
        turkce=veriler.nextInt();
        System.out.print("Tarih Notunuz: ");
        tarih=veriler.nextInt();
        System.out.println("Muzik notunuz:");
        muzik=veriler.nextInt();
        int toplam= mat+fiz+kimya+turkce+tarih+muzik;
        int ortalama=toplam/6;
        String bilgi=ortalama>= 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(bilgi+" Ve Ortalama :"+ortalama);

    }
}
