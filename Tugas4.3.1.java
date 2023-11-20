import java.util.Scanner;
public class IP {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input nilai angka: ");
		int input = sc.nextInt();
		if (input >= 0 && input <= 50) {
			System.out.println("Indeks = 0");
			System.out.println("Huruf = E");
		} else if (input >= 50 && input < 60) {
			System.out.println("Indeks = 1.0");
			System.out.println("Huruf = D");
		} else if (input >= 60 && input < 70) {
			System.out.println("Indeks = 2.0");
			System.out.println("Huruf = C");
		} else if (input >= 70 && input < 80) {
			System.out.println("Indeks = 3.0");
			System.out.println("Huruf = B");
		} else if (input >= 80 && input <= 100) {
			System.out.println("Indeks = 4.0");
			System.out.println("Huruf = A");
		} else {
			System.out.println("Nilai tidak valid");
		}
	}
}