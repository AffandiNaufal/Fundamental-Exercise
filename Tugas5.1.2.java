public class TugasWhile1 {
    public static void main(String[] args) {
        String[] menu = {"Mangga", "Apel", "Anggur", "Ceri", "Leci"};
        
        System.out.println("Jadwal makan:");
        int i = 0;
        while (i < menu.length) {
            System.out.println("Hari ke-" + (i + 1) + ": " + menu[i]);
            i++;
        }
    }
}