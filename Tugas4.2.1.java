import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai angka: ");
        double nilaiAngka = input.nextDouble();
        input.close();

        String nilaiHuruf;

        if (nilaiAngka >= 80 && nilaiAngka <= 100) {
            nilaiHuruf = "A";
        } else if (nilaiAngka >= 70 && nilaiAngka < 80) {
            nilaiHuruf = "B";
        } else if (nilaiAngka >= 60 && nilaiAngka < 70) {
            nilaiHuruf = "C";
        } else if (nilaiAngka >= 50 && nilaiAngka < 60) {
            nilaiHuruf = "D";
        } else if (nilaiAngka >= 0 && nilaiAngka < 50) {
            nilaiHuruf = "E";
        } else {
            nilaiHuruf = "Invalid";
        }

        System.out.println("Nilai angka " + nilaiAngka + " setara dengan nilai huruf " + nilaiHuruf);
    }
}
