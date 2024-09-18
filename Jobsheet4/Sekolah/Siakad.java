package Sekolah;

import java.time.LocalDate;
import java.util.ArrayList;

public class Siakad {
    private LocalDate tanggal;
    private ArrayList<Siswa> siswa;
    private ArrayList<MataPelajaran> mataPelajaran;
    private ArrayList<Guru> guru;

    public Siakad(LocalDate tanggal) {
        this.tanggal = tanggal;
        this.siswa = new ArrayList<>();
        this.mataPelajaran = new ArrayList<>();
        this.guru = new ArrayList<>();
    }

    public LocalDate getTanggal() {
        return tanggal;
    }

    public void setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
    }

    public void addSiswa(Siswa siswa) {
        this.siswa.add(siswa);
    }

    public ArrayList<Siswa> getSiswa() {
        return siswa;
    }

    public void addMataPelajaran(MataPelajaran mataPelajaran) {
        this.mataPelajaran.add(mataPelajaran);
    }

    public ArrayList<MataPelajaran> getMataPelajaran() {
        return mataPelajaran;
    }

    public void addGuru(Guru guru) {
        this.guru.add(guru);
    }

    public ArrayList<Guru> getGuru() {
        return guru;
    }
}
