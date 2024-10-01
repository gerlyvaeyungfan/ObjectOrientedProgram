package Jobsheet6.Tugas;

public class HewanDemo {
    public static void main(String[] args) {
        // Membuat objek Burung menggunakan constructor tanpa parameter
        Burung burung1 = new Burung();
        System.out.println("Info Burung 1:");
        System.out.println(burung1.getInfo());

        // Membuat objek Burung menggunakan constructor berparameter
        Burung burung2 = new Burung("Merpati", "Betina", 2, "Putih");
        System.out.println("\nInfo Burung 2:");
        System.out.println(burung2.getInfo());

        // Membuat objek Ikan menggunakan constructor tanpa parameter
        Ikan ikan1 = new Ikan();
        System.out.println("\nInfo Ikan 1:");
        System.out.println(ikan1.getInfo());

        // Membuat objek Ikan menggunakan constructor berparameter
        Ikan ikan2 = new Ikan("Nila", "Jantan", 1, "Air Tawar");
        System.out.println("\nInfo Ikan 2:");
        System.out.println(ikan2.getInfo());

        // Modifikasi nilai atribut dan cetak ulang informasi
        burung2.nama = "Elang";
        burung2.warnaBulu = "Cokelat";
        ikan2.habitat = "Laut";

        System.out.println("\nSetelah Modifikasi Info Burung 2:");
        System.out.println(burung2.getInfo());

        System.out.println("\nSetelah Modifikasi Info Ikan 2:");
        System.out.println(ikan2.getInfo());
    }
}
