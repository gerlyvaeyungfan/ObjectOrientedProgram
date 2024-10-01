package Jobsheet6.Tugas;

// Child Class 1: Burung
public class Burung extends Hewan {
    public String warnaBulu;

    // Constructor tanpa parameter (Overloading)
    public Burung() {
        super();  // Memanggil constructor tanpa parameter dari class parent
        this.warnaBulu = "Tidak diketahui";
    }

    // Constructor berparameter (Overloading)
    public Burung(String nama, String jenisKelamin, int umur, String warnaBulu) {
        super(nama, jenisKelamin, umur);  // Memanggil constructor berparameter dari class parent
        this.warnaBulu = warnaBulu;
    }

    // Method untuk menampilkan info burung
    @Override
    public String getInfo() {
        return super.getInfo() + "\nWarna Bulu: " + warnaBulu;
    }
}
