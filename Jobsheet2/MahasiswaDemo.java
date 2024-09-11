public class MahasiswaDemo {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        Mahasiswa m2 = new Mahasiswa();
        Mahasiswa m3 = new Mahasiswa();

        m1.nim = "023432";
        m1.nama = "Yansy Ayuningtyas";
        m1.alamat = "Nias, Sumatera Utara";
        m1.kelas = "2A";
        m1.displayBiodata();
        System.out.println();

        m2.nim = "02190";
        m2.nama = "Adi Saputra";
        m2.alamat = "Surabaya, Jawa Timur";
        m2.kelas = "2B";
        m2.displayBiodata();
        System.out.println();

        m3.nim = "23190";
        m3.nama = "Jessica Amalia";
        m3.alamat = "Semarang, Jawa Tengah";
        m3.kelas = "2C";
        m3.displayBiodata();
        System.out.println();

    }
}