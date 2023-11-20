import java.util.Scanner;
	public class UlangForAzim  {
	public static void main (String [] args) {
	  int maksi;
	  int maksiawal = 1;
	System.out.println("Program deret bilangan ganjil FOR Java");
	Scanner input = new Scanner (System.in);
	System.out.print("Masukkan angka maksimal : ");
	  maksi = input.nextInt();
	  for (maksiawal=1; maksiawal<maksi; maksiawal+=2)
	  System.out.println(" " +maksiawal);
	}
}