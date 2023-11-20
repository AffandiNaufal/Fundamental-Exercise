import java.util.Scanner;

public class KonversiNilaiHurufKeIndeks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai huruf (A/B/C/D/E): ");
        char nilaiHuruf = input.next().charAt(0);
        
        double nilaiIndeks;
        
        if (nilaiHuruf == 'A') {
            nilaiIndeks = 4.0;
        } else if (nilaiHuruf == 'B') {
            nilaiIndeks = 3.0;
        } else if (nilaiHuruf == 'C') {
            nilaiIndeks = 2.0;
        } else if (nilaiHuruf == 'D') {
            nilaiIndeks = 1.0;
        } else if (nilaiHuruf == 'E') {
            nilaiIndeks = 0.0;
        } else {
            System.out.println("Input tidak valid");
            return;
        }
        
        System.out.println("Nilai indeks untuk " + nilaiHuruf + " adalah " + nilaiIndeks);
    }
}