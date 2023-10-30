import java.util.Scanner;
/**
 * BioskopWithScanner05
 */
public class BioskopWithScanner05 {

    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);
        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.print("Masukkan nama : ");
            nama = input05.next();
            System.out.print("Masukkan baris : ");
            baris = input05.nextInt();
            System.out.print("Masukkan kolom : ");
            kolom = input05.nextInt();

            penonton[baris-1][kolom-1] = nama;

            System.out.print("Input penonton lainnya? (y/n) : ");
            next = input05.next();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
        input05.close();
    }
}