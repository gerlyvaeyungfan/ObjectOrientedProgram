import java.util.Scanner;
;public class Hhpemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inputStok;
        HP hp1 = new HP();
        HP hp2 = new HP();

        System.out.println();
        System.out.println("===============================");
        System.out.println("|          HP HP              |");
        System.out.println("===============================");
        System.out.println();

        hp1.setNama("Apple");
        hp1.setHarga(9755000);
        hp1.tambahStok(907);
        hp1.cetakInfoHP();

        hp2.setNama("Samsung");
        hp2.setHarga(1855000);
        hp2.tambahStok(150);
        hp2.cetakInfoHP();

        System.out.println("Update stok HP Apple");
        System.out.print("Masukkan stok yang ingin ditambahkan: ");
        inputStok = input.nextInt();
        hp1.tambahStok(inputStok);
        hp1.cetakInfoHP();
        
        System.out.println("Update stok HP Samsung");
        System.out.print("Masukkan stok yang ingin ditambahkan: ");
        inputStok = input.nextInt();
        hp1.tambahStok(inputStok);
        hp2.cetakInfoHP();
    }
}




