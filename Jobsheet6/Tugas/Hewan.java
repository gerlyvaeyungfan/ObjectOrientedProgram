package Jobsheet6.Tugas;

// Parent Class
public class Hewan {
    public String nama;
    public String jenisKelamin;
    public int umur;

    // Constructor tanpa parameter (Overloading)
    public Hewan() {
        this.nama = "Tidak diketahui";
        this.jenisKelamin = "Tidak diketahui";
        this.umur = 0;
    }

    // Constructor berparameter (Overloading)
    public Hewan(String nama, String jenisKelamin, int umur) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.umur = umur;
    }

    // Method untuk menampilkan info hewan
    public String getInfo() {
        return "Nama: " + nama + "\nJenis Kelamin: " + jenisKelamin + "\nUmur: " + umur + " tahun";
    }
}
