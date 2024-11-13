package latihanInterface;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV("Led", 50, 8900000, "Putih", "Polytron");
        SmartFridge fridge = new SmartFridge(30, 4, 5200000, "Abu-abu", "LG");
        Kipas kipas = new Kipas("Angin", 200000, "Hitam", "Miyako");

        System.out.println("\nInformasi TV:");
        tv.getInfo();
        System.out.println("\nInformasi SmartFridge:");
        fridge.getInfo();
        System.out.println("\nInformasi Kipas:");
        kipas.getInfo();
    }
}
