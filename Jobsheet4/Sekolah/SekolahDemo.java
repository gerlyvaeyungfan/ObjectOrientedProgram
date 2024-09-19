package Sekolah;

import java.util.ArrayList;
import java.util.Scanner;

public class SekolahDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Siakad siakad = new Siakad();

        ArrayList<Siswa> daftarSiswa = new ArrayList<>();
        String[][] dataSiswa = {
            {"1", "Gerly Vaeyungfan", "1A"},
            {"2", "Aprilia Putri Anggraeni", "1A"},
            {"3", "Meisi Nadia Nababan", "1A"},
            {"4", "Rahmalia Mutia Farda", "1A"},
            {"1", "Adam Nur Alifi", "1B"},
            {"2", "Dimas Setyo Nugroho", "1B"},
            {"3", "Aqila Nur Azza", "1B"},
            {"1", "Indi Warda Ramadhani", "1C"},
            {"2", "Fasya Dita", "1C"},
            {"3", "Jaden Natha Kautsar", "1C"}
        };

        for (String[] data : dataSiswa) {
            String nomorAbsen = data[0];
            String namaSiswa = data[1];
            String kelasSiswa = data[2];

            Siswa siswa = new Siswa(nomorAbsen, namaSiswa, kelasSiswa);

            siswa.tambahMataPelajaran(new MataPelajaran("Matematika", 0));
            siswa.tambahMataPelajaran(new MataPelajaran("Bahasa Indonesia", 0));
            siswa.tambahMataPelajaran(new MataPelajaran("IPA", 0));

            daftarSiswa.add(siswa);
        }
        siakad.getSiswa().addAll(daftarSiswa);

        siakad.addGuru(new Guru("Endah Septa Sintiya S.Pd., M.Kom.", "NIP001"));
        siakad.addGuru(new Guru("Rosa Andrie Asmara ST., MT.", "NIP002"));
        siakad.addGuru(new Guru("Vit Zuraida S.Kom M.Kom.", "NIP003"));
        siakad.addGuru(new Guru("Indra Dharma Wijaya ST., MMT", "NIP004"));
        siakad.addGuru(new Guru("Candra Bella Vista S.Kom., MT.", "NIP005"));

        System.out.println("\nSelamat Datang di Sistem Informasi Akademik!");
        while (true) {
            System.out.println("\n=================================");
            System.out.println("=========  Menu SIAKAD  =========");
            System.out.println(">================================");
            System.out.println("| 1. Masukkan Nilai Siswa");
            System.out.println("| 2. Tampilkan Daftar Guru");
            System.out.println("| 3. Tampilkan Informasi Siswa");
            System.out.println("| 0. Keluar");
            System.out.println("|--------------------------------");
            System.out.print("||> Pilih menu: ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    while (true) {
                        System.out.println("\nData Informasi Kelas:");
                        System.out.println("---------------------------------");
                        System.out.println("1. Kelas 1A");
                        System.out.println("2. Kelas 1B");
                        System.out.println("3. Kelas 1C");
                        System.out.println("0. Keluar ke menu utama");

                        System.out.print("Pilih kelas: ");
                        int pilihanKelas = sc.nextInt();
                        sc.nextLine();

                        String kelasTerpilih = null;
                        switch (pilihanKelas) {
                            case 1:
                                kelasTerpilih = "1A";
                                break;
                            case 2:
                                kelasTerpilih = "1B";
                                break;
                            case 3:
                                kelasTerpilih = "1C";
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Pilihan tidak valid!");
                                continue;
                        }

                        if (pilihanKelas == 0) {
                            break;
                        }

                        while (true) {
                            System.out.println("\nDaftar Siswa di Kelas " + kelasTerpilih + ":");
                            System.out.println("---------------------------------");
                            ArrayList<Siswa> siswaDiKelas = new ArrayList<>();
                            for (Siswa siswa : siakad.getSiswa()) {
                                if (siswa.getKelas().equals(kelasTerpilih)) {
                                    siswaDiKelas.add(siswa);
                                    System.out.println(siswa.getNomorAbsen()+". "+ siswa.getNama());
                                }
                            }

                            if (siswaDiKelas.isEmpty()) {
                                System.out.println("Tidak ada siswa di kelas ini.");
                                break;
                            }

                            System.out.println("0. Keluar ke menu kelas");

                            System.out.print("Pilih nomor absen siswa: ");
                            String nomorAbsen = sc.nextLine();

                            if (nomorAbsen.equals("0")) {
                                break;
                            }

                            Siswa siswaTerpilih = null;
                            for (Siswa siswa : siswaDiKelas) {
                                if (siswa.getNomorAbsen().equals(nomorAbsen)) {
                                    siswaTerpilih = siswa;
                                    break;
                                }
                            }

                            if (siswaTerpilih == null) {
                                System.out.println("Nomor absen tidak valid!");
                                continue;
                            }

                            while (true) {
                                System.out.println("\nDaftar mata pelajaran:");
                                System.out.println("---------------------------------");
                                for (int i = 0; i < siswaTerpilih.getRiwayatNilaiSiswa().size(); i++) {
                                    System.out.println((i + 1) + ". " +
                                    siswaTerpilih.getRiwayatNilaiSiswa().get(i).getNama());
                                }
                                System.out.println("0. Keluar ke daftar siswa");

                                System.out.print("Pilih nomor mata pelajaran: ");
                                int noMapel = sc.nextInt();
                                sc.nextLine();

                                if (noMapel == 0) {
                                    break;
                                }
                                if (noMapel < 1 || noMapel > siswaTerpilih.getRiwayatNilaiSiswa().size()) {
                                    System.out.println("Nomor mata pelajaran tidak valid!");
                                    continue;
                                }
                                System.out.println("\n=================================");
                                System.out.print("|> Masukkan nilai : ");
                                int nilaiMapel = sc.nextInt();
                                System.out.println("=================================");
                                sc.nextLine();

                                MataPelajaran mapelTerpilih = siswaTerpilih.getRiwayatNilaiSiswa().get(noMapel-1);
                                mapelTerpilih.setNilai(nilaiMapel);
                                System.out.println("\nNilai berhasil dimasukkan!");
                            }
                        }
                    }
                    break;

                case 2:
                    System.out.println("=================================");
                    System.out.println("=========  Daftar Guru  =========");
                    for (Guru guru : siakad.getGuru()) {
                        System.out.println("Nama Guru: " + guru.getNama() + ", NIP: " + guru.getNip());
                    }
                    break;

                case 3:
                    System.out.println("=================================");
                    System.out.println("=======  Informasi Siswa  =======");
                    for (Siswa siswa : siakad.getSiswa()) {
                        System.out.println("Nomor Absen: " + siswa.getNomorAbsen());
                        System.out.println("Nama Siswa: " + siswa.getNama());
                        System.out.println("Kelas: " + siswa.getKelas());
                        System.out.println("Mata Pelajaran dan Nilai:");
                        for (MataPelajaran mapel : siswa.getRiwayatNilaiSiswa()) {
                            System.out.println("- " + mapel.getNama() + ": " + mapel.getNilai());
                        }
                        System.out.println("---------------------------------");
                    }
                    break;

                case 0:
                    System.out.println("\n[===============================]");
                    System.out.println("[======== TERIMA KASIH! ========]");
                    System.out.println("[===============================]");
                    sc.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}
