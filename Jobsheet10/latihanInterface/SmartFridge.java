package latihanInterface;
public class SmartFridge extends Kulkas implements Audible {
    private int volume;

    public SmartFridge(int volume, int jumlahPintu, double harga, String warna, String merk) {
        super(jumlahPintu, harga, warna, merk);
        this.volume = volume;
    }

    @Override
    public void naikkanVolume(int increment) {
        volume += increment;
        System.out.println("Volume Smartfridge dinaikkan(" + increment + "): " + volume);
    }

    @Override
    public void turunkanVolume(int decrement) {
        volume -= decrement;
        System.out.println("Volume Smartfridge diturunkan(" + decrement + "): " + volume);
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Volume saat ini: " + volume);
        naikkanVolume(5); // Contoh menaikkan volume sebanyak 5
        turunkanVolume(2);
    }
}

