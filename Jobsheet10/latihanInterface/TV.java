package latihanInterface;
public class TV extends AlatElektronik implements Audible{
    private String jenisLayar;
    private int volume;

    public TV(String jenisLayar, int volume, double harga, String warna, String merk) {
        super(harga, warna, merk);
        this.jenisLayar = jenisLayar;
        this.volume = volume;
    }

    public String getJenisLayar() {
        return jenisLayar;
    }

    public void setJenisLayar(String jenisLayar) {
        this.jenisLayar = jenisLayar;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void naikkanVolume(int increment) {
        volume += increment;
        System.out.println("Volume TV dinaikkan(" + increment + "): " + volume);
    }

    @Override
    public void turunkanVolume(int decrement) {
        volume -= decrement;
        System.out.println("Volume TV diturunkan(" + decrement + "): " + volume);
    }

    public void getInfo() {
        super.getInfo();
        System.out.println("Jenis layar: " + jenisLayar);
        System.out.println("Volume saat ini: " + volume);
        naikkanVolume(10);
        turunkanVolume(5);
    }
}