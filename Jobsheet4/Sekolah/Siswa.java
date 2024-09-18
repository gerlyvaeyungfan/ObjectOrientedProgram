package Sekolah;

import java.util.ArrayList;

public class Siswa {
    private String nomorAbsen;
    private String nama;
    private String kelas;
    private ArrayList<MataPelajaran> riwayatNilaiSiswa;

    public Siswa(String nomorAbsen, String nama, String kelas) {
        this.nomorAbsen = nomorAbsen;
        this.nama = nama;
        this.kelas = kelas;
        this.riwayatNilaiSiswa = new ArrayList<>();
    }

    public String getNomorAbsen() {
        return nomorAbsen;
    }

    public void setNomorAbsen(String nomorAbsen) {
        this.nomorAbsen = nomorAbsen;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public void tambahMataPelajaran(MataPelajaran mataPelajaran) {
        this.riwayatNilaiSiswa.add(mataPelajaran);
    }

    public ArrayList<MataPelajaran> getRiwayatNilaiSiswa() {
        return riwayatNilaiSiswa;
    }
}