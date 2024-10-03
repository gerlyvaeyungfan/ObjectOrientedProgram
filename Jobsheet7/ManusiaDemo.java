package Jobsheet7;

public class ManusiaDemo {
    public static void main(String[] args) {
        Manusia manusia1 = new Dosen();
        Manusia manusia2 = new Mahasiswa();
        
        manusia1.bernafas();   // Memanggil method dari kelas Manusia
        manusia1.makan();      // Memanggil method makan() dari kelas Dosen (polimorfisme)

        manusia2.bernafas();   // Memanggil method dari kelas Manusia
        manusia2.makan();      // Memanggil method makan() dari kelas Mahasiswa (polimorfisme)

        if (manusia1 instanceof Dosen) { // Memeriksa apakah objek manusia1 adalah instance dari kelas Dosen
            ((Dosen) manusia1).lembur();
        }

        if (manusia2 instanceof Mahasiswa) { // Memeriksa apakah objek manusia2 adalah instance dari kelas Mahasiswa
            ((Mahasiswa) manusia2).tidur();
        }
    }
}
