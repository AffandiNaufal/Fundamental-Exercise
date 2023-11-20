public class tugasfor1 {
    public static void main(String[] args) {
        String[] menu = {"Mangga", "Apel", "Anggur", "Ceri", "Leci"};
        
        System.out.println("Jadwal makan buah:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Hari ke-" + (i + 1) + ": " + menu[i]);
        }
    }
}