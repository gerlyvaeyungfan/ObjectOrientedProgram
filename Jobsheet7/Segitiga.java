package Jobsheet7;

class Segitiga {
    private int sudut;

    // Method kedua: menghitung total sudut dengan satu parameter
    public int totalSudut(int sudutA){
        sudut = 180 - sudutA;
        System.out.println("Total Sudut dengan 1 sudut: " + sudut);
        return sudut;
    }

    // Method kedua: menghitung total sudut dengan dua parameter (overloading)
    public int totalSudut(int sudutA, int sudutB) {
        sudut = 180 - (sudutA + sudutB);
        System.out.println("Total Sudut dengan 2 sudut: " + sudut);
        return sudut;
    }
    public int keliling(int sisiA, int sisiB, int sisiC) {
        int keliling;
        keliling = sisiA + sisiB + sisiC;
        System.out.println("Keliling dengan 3 sisi: " + keliling);
        return keliling;
    }
    public double keliling(int sisiA, int sisiB){
        double sisiMiring;
        sisiMiring = Math.sqrt((sisiA*sisiA) + (sisiB*sisiB));
        System.out.println("Sisi miring (keliling) dengan 2 sisi: " + sisiMiring);
        return sisiMiring;
    }

    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();
        segitiga.totalSudut(30, 60); //Memanggil method dengan 2 parameter
        segitiga.totalSudut(30);
        segitiga.keliling(3, 4);
        segitiga.keliling(10, 40, 30);
    }
}