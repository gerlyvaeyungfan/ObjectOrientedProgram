package jobsheet3;

public class TestKoperasi {
    public static void main(String[] args) {
        
        Anggota anggota1 = new Anggota("111333444", "Donny", 5000000);

        System.out.println("Nama Anggota   : Donny");
        System.out.println("Limit Pinjaman : 5000000");

        System.out.println("\nMeminjam uang 10.000.000...");
        anggota1.pinjam(10000000);

        System.out.println("\nMeminjam uang 4.000.000...");
        anggota1.pinjam(4000000);

        System.out.println("\nMembayar angsuran 1.000.000");
        anggota1.angsur(1000000);

        System.out.println("\nMembayar angsuran 3.000.000");
        anggota1.angsur(3000000);
    }
}