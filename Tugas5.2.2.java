import java.util.Scanner;

public class UlangWhileAzim {
  public static void main(String[] args) {
    int maksi;
    int maksiawal = 1;
    System.out.println("Program deret bilangan ganjil WHILE Java");
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan angka maksimal : ");
    maksi = input.nextInt();
    while (maksiawal < maksi) {
      System.out.println(" " + maksiawal);
      maksiawal += 2;
    }
  }
}
