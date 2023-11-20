import java.util.Scanner;

public class UlangDoWhileAzim {
  public static void main(String[] args) {
    int maksi;
    int maksiawal = 1;
    System.out.println("Program deret bilangan ganjil DO-WHILE Java");
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan angka maksimal : ");
    maksi = input.nextInt();
    do {
      System.out.println(" " + maksiawal);
      maksiawal += 2;
    } while (maksiawal <= maksi);
  }
}
