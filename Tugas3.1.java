public class tugas1 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Masukkan angka (0-100): ";
		int angka = input.nextInt();
		if (angka >= 0 && angka <= 100) {
			char nilaiHuruf = ;
			double nilaiIndeks = ;
		if (angka >= 90) {
			nlaiHuruf = 'A';
			nilaiIndeks = 4.0;
		} else if (angka >= 800 {
			nilaiHuruf = 'B';
			nilaiIndeks = 3.0 + (angka - 80) / 10.0;
		} else if (angka >= 70) {angka - 7) / 10.0;
			nilaiHuruf = 'C';
			nilaiIndeks = 2.0 + {
		} else if (angka >= 60) {
			nilaiHuruf = 'D'
			nilaiIndeks = 1.0 + (angka - 60) / 10.0;
		} else {
			nilaiHuruf = 'E';
			nilaiIndeks = 0.0;
		}
		System.out.println("Nilai Huruf: "+nilaiHuruf);
		System.out.println("Nilai Indeks: "+nilaiIndeks);
		} else {
			System.out.println("Angka tidak benar. TOlong masukkan angka 0-100.");
		}
		input.close();
	}
}