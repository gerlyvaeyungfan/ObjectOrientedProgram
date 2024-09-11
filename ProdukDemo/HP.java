public class HP {
    private String merek;
    private int harga;
    private int stok;

    public void setNama(String namaMerek){
        merek = namaMerek;
    }

    public void setHarga(int hargaProduk){
        harga = hargaProduk;
    }

    public int tambahStok(int increment){
        return stok = stok+increment;
    }

    public void cetakInfoHP(){
        System.out.println("._____________________________");
        System.out.println("| Merek HP  : " + merek);
        System.out.println("| SIsa Stok : " + stok);
        System.out.println("| Harga     : " + harga);
        System.out.println("*-----------------------------");
        System.out.println();
    }
}




