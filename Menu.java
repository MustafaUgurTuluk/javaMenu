import java.util.Scanner;

public class Menu {
    static Scanner giris = new Scanner(System.in);
    static int secim; // AYNI ANA MENÜYE DÖNME OLAYI YÜZÜNDEN BURAYA KOYMAM GEREKTİ
    public static void main(String[] args) {
        char harf;
        do {
            System.out.println("*** ANA MENU ***");
            System.out.println("[a] Toplama Cikarma Carpma");
            System.out.println("[b] Us Alma");
            System.out.println("[c] Cikis");
            System.out.print("Secim yapiniz...");
    
            harf = giris.next().charAt(0);
    
            switch (harf) {
                case 'a':
                    dortIs();
                    if (secim != 4) return; // TEK SEÇENEK ANA MENÜYE DÖNDÜRSÜN DİYE
                    else break;
                case 'b':
                    usAl();
                    if (secim != 3) return;
                    else break;
                case 'c':
                    System.out.println("Programdan cikiliyor...");
                    break;
                default:
                    System.out.println("\nGecersiz giris. (Alt Menülerde Direkt Hata Verir.)"); //try catch falan deneyelim onun için
                    break;
            }
        } while (harf != 'c');
    }


    public static void dortIs () {
        System.out.println("\n4 ISLEM MENUSU");
        System.out.println("[1] Toplama");
        System.out.println("[2] Cikarma");
        System.out.println("[3] Carpma");
        System.out.println("[4] Ana Menu");
        System.out.print("Secim yapiniz...");

        int sayi1, sayi2;
        secim = giris.nextInt();

        switch (secim) {
            case 1:
                System.out.print("\n2 sayi gir:");
                sayi1 = giris.nextInt();
                sayi2 = giris.nextInt();
                System.out.println(sayi1+sayi2);
                break;
            case 2:
                System.out.print("\n2 sayi gir:");
                sayi1 = giris.nextInt();
                sayi2 = giris.nextInt();
                System.out.println(sayi1-sayi2);
                break;
            case 3:
                System.out.print("\n2 sayi gir:");
                sayi1 = giris.nextInt();
                sayi2 = giris.nextInt();
                System.out.println(sayi1*sayi2);
                break;
            case 4:
                // ana menüye döner
                break;
            default: //30. satırda dediğim şey burası try-catch deneyelim
                break;         
        }
    }


    public static void usAl () {
        System.out.println("\nUS ALMA MENUSU");
        System.out.println("[1] Kare Al");
        System.out.println("[2] Kup Al");
        System.out.println("[3] Ana Menu");
        System.out.print("Secim yapiniz...");

        int sayi;
        secim = giris.nextInt();

        switch (secim) {
            case 1:
                System.out.print("Sayi gir: ");
                sayi = giris.nextInt();
                System.out.println(karesi(sayi));
                break;
            case 2:
                System.out.print("Sayi gir: ");
                sayi = giris.nextInt();
                System.out.println(kupu(sayi));
                break;
            case 3:
                break;
            default:    //try catch
                break;
        }
    }

    static int karesi (int a) {
        return a*a;
    }
    static int kupu (int a) {
        return a*a*a;
    }
}