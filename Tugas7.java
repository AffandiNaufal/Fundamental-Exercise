import java.util.Scanner;
public class tugas7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Jumlah data: ");
        int jumlahData = scanner.nextInt();

        
        int[] data = new int[jumlahData];

        
        for (int i = 0; i < jumlahData; i++) {
            System.out.print("Data ke-" + i + ": ");
            data[i] = scanner.nextInt();
        }

       
        System.out.println("Menampilkan data");
        int totalPenjumlahan = 0;
        for (int i = 0; i < jumlahData; i++) {
            System.out.print(data[i] + "-> ");
            if (data[i] % 2 == 0) {
                System.out.println("GENAP");
            } else {
                System.out.println("GANJIL");
            }
            totalPenjumlahan += data[i];
        }
		
		double Ratarata = totalPenjumlahan/jumlahData;
      
        System.out.println("TOTAL PENJUMLAHAN: " + totalPenjumlahan);
        System.out.println("RATA-RATA: " + Ratarata);

	}  
}