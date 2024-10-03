package Jobsheet7;

public class Perkalianku {
    void perkalian(int a, int b) {
        System.out.println(a * b);
    }

    void perkalian(int a, int b, int c) {
        System.out.println(a * b * c);
    }

    public static void main(String[] args) {
        Perkalianku objek = new Perkalianku();

        objek.perkalian(24, 43);
        objek.perkalian(34, 23, 56);
    }
}
