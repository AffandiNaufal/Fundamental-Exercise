public class TugasDoWhile1 {
    public static void main(String[] args) {
        String[] menu = {"Mangga", "Apel", "Anggur", "Ceri", "Leci"};
        
        System.out.println("Jadwal makan:");
        int i = 0;
        do {
            System.out.println("Hari ke-" + (i + 1) + ": " + menu[i]);
            i++;
        } while (i < menu.length);
    }
}