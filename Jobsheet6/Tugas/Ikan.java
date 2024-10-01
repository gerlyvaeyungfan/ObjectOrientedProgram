package Jobsheet6.Tugas;

// Child Class 2: Ikan
public class Ikan extends Hewan {
    public String habitat;

    // Constructor tanpa parameter (Overloading)
    public Ikan() {
        super();  // Memanggil constructor tanpa parameter dari class parent
        this.habitat = "Tidak diketahui";
    }

    // Constructor berparameter (Overloading)
    public Ikan(String nama, String jenisKelamin, int umur, String habitat) {
        super(nama, jenisKelamin, umur);  // Memanggil constructor berparameter dari class parent
        this.habitat = habitat;
    }

    // Method untuk menampilkan info ikan
    @Override
    public String getInfo() {
        return super.getInfo() + "\nHabitat: " + habitat;
    }
}
