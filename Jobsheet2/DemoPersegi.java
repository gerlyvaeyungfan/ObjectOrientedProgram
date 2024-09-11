import java.util.Scanner;

public class DemoPersegi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang: ");
        int p = input.nextInt();

        System.out.print("Masukkan lebar: ");
        int l = input.nextInt();
        PersegiPanjang persegiPanjang = new PersegiPanjang(p, l);

        persegiPanjang.displayInfo();

        int luas = persegiPanjang.getLuas();
        System.out.println("Luas Persegi Panjang: " + luas);

        int keliling = persegiPanjang.getKeliling();
        System.out.println("Keliling Persegi Panjang: " + keliling);
    }
}


