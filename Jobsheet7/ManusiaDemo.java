package Jobsheet7;

// Kelas induk Manusia
class Manusia {
    // Method bernapas
    public void bernafas() {
        System.out.println("Manusia sedang bernafas");
    }

    // Method makan (akan di-override oleh subclass)
    public void makan() {
        System.out.println("Manusia sedang makan");
    }
}

// Kelas Dosen yang mewarisi kelas Manusia
class Dosen extends Manusia {
    // Override method makan
    @Override
    public void makan() {
        System.out.println("Dosen sedang makan");
    }

    // Method lembur khusus untuk Dosen
    public void lembur() {
        System.out.println("Dosen sedang lembur");
    }
}

// Kelas Mahasiswa yang mewarisi kelas Manusia
class Mahasiswa extends Manusia {
    // Override method makan
    @Override
    public void makan() {
        System.out.println("Mahasiswa sedang makan");
    }

    // Method tidur khusus untuk Mahasiswa
    public void tidur() {
        System.out.println("Mahasiswa sedang tidur");
    }
}

// Kelas utama untuk mengimplementasikan Dynamic Method Dispatch
public class ManusiaDemo {
    public static void main(String[] args) {
        // Membuat objek dari tipe kelas induk, tetapi diinisialisasi dengan subclass
        Manusia manusia1 = new Dosen();    // Dynamic Dispatch: objek Dosen
        Manusia manusia2 = new Mahasiswa(); // Dynamic Dispatch: objek Mahasiswa

        // Memanggil method yang di-override menggunakan referensi kelas induk
        manusia1.bernafas();   // Memanggil method dari kelas Manusia
        manusia1.makan();      // Memanggil method makan() dari kelas Dosen (polimorfisme)

        manusia2.bernafas();   // Memanggil method dari kelas Manusia
        manusia2.makan();      // Memanggil method makan() dari kelas Mahasiswa (polimorfisme)

        // Untuk memanggil method spesifik subclass (lembur dan tidur), kita perlu cast ke subclass
        if (manusia1 instanceof Dosen) {
            ((Dosen) manusia1).lembur();
        }

        if (manusia2 instanceof Mahasiswa) {
            ((Mahasiswa) manusia2).tidur();
        }
    }
}
