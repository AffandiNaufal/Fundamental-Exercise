import java.util.Scanner;

public class DaftarPiketDoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahPiket, i = 0;

        System.out.print("Masukkan jumlah anggota piket: ");
        jumlahPiket = input.nextInt();

        System.out.println("Daftar Piket:");
        do {
            System.out.print("Piket " + (i + 1) + ": ");
            String namaAnggota = input.next();
            System.out.println("Anggota piket " + (i + 1) + ": " + namaAnggota);
            i++;
        } while (i < jumlahPiket);

        input.close();
    }
}