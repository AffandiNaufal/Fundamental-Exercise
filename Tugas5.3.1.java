import java.util.Scanner;

public class DaftarPiketFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahPiket;

        System.out.print("Masukkan jumlah anggota piket: ");
        jumlahPiket = input.nextInt();

        System.out.println("Daftar Piket:");
        for (int i = 0; i < jumlahPiket; i++) {
            System.out.print("Piket " + (i + 1) + ": ");
            String namaAnggota = input.next();
            System.out.println("Anggota piket " + (i + 1) + ": " + namaAnggota);
        }

        input.close();
    }
}
