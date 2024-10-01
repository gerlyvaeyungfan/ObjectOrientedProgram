package Kalkulator;

import java.util.Scanner;

public class KalkulatorDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        Kalkulator kalkulator = new Kalkulator(angka1, angka2, operator);
        double hasil = kalkulator.hitung();
        String errorMessage = kalkulator.getErrorMessage();

        // Tampilkan hasil atau pesan kesalahan
        if (!errorMessage.isEmpty()) {
            System.out.println(errorMessage);
        } else {
            System.out.println("Hasil: " + hasil);
        }

        scanner.close();
    }
}
