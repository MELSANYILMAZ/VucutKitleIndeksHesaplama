import java.util.Scanner;

/*Vücut Kitle İndeksi Hesaplama
Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

Formül
Kilo (kg) / Boy(m) * Boy(m)

Çıktısı
Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
Lütfen kilonuzu giriniz : 105
Vücut Kitle İndeksiniz : 35.49215792320173

 */
public class Main {
    public static void main(String[] args) {

        double m,kg;
        Scanner inp =new Scanner(System.in);
        System.out.print("Lütfen kilonuzu giriniz:");
        kg=inp.nextDouble();

        System.out.print("Lütfen Boyunuzu(metre cinsinden)giriniz");
        m= inp.nextDouble();

        m = m / 100.0; // cm'den m'ye çevir

        double indeks=((kg) / (m * m));
        System.out.print("Vücut kitle endeksiniz:"+ indeks);
    }
}