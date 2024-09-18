package Sekolah;

public class Guru {
    private String nama;
    private String nip;

    public Guru(String nama, String nip) {
        this.nama = nama;
        this.nip = nip;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
}
