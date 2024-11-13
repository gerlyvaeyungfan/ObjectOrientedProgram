# JOBSHEET 10 - POLIMORFISME

1. Apakan upcasting dapat dilakukan dari suatu class terhadap class lain yang tidak
  memiliki relasi inheritance?
  -> Tidak, upcasting tidak dapat dilakukan jika kedua kelas tidak memiliki hubungan
     inheritance. Upcasting digunakan untuk mengonversi objek dari subclass ke
     superclass (misalnya, Dosen ke Pegawai) yang memiliki hubungan inheritance.
     Jika kelas tidak terkait melalui inheritance, akan memberikan pesan error.
2. Dari 2 baris kode program berikut, manakan proses upcasting yang tepat? Jelaskan
  Pegawai pegawai1 = new Dosen();
  Pegawai pegawai1 = (Pegawai) new Dosen();
  -> Kedua baris kode di atas adalah upcasting dan keduanya bekerja dengan baik.
     Namun, baris pertama adalah cara yang lebih umum dan sederhana untuk melakukan
     upcasting. Java melakukan upcasting secara implisit, sehingga (Pegawai) pada
     baris kedua tidak diperlukan.
3. Apa fungsi dari keyword instanceOf?
  -> instanceof adalah keyword yang digunakan untuk memeriksa apakah objek tertentu
     merupakan instance dari kelas tertentu (atau subclass dari kelas tersebut).
     Ini sangat berguna untuk melakukan pengecekan tipe sebelum melakukan downcasting.
4. Apa yang dimaksud heterogenous collection?
  -> Heterogeneous collection adalah koleksi objek yang terdiri dari berbagai tipe
     kelas yang berhubungan (biasanya melalui inheritance atau interface). Dalam Java,
     ketika menggunakan tipe umum (seperti Pegawai) dalam koleksi seperti ArrayList<Pegawai>,
     yang memungkinkan untuk menyimpan objek Dosen, TenagaKependidikan, dan lainnya yang
     merupakan subclass dari Pegawai.
5. Sebuah object diinstansiasi dari class Pegawai. Kemudian dilakukan downcasting
  menjadi object bertipe Dosen. Apakah hal ini dapat dilakukan? Lakukan percobaan
  untuk membuktikannya.
  -> Tidak, hal ini tidak dapat dilakukan kecuali objek tersebut memang instance dari Dosen.
    Jika objek sebenarnya adalah Pegawai biasa dan kita mencoba untuk melakukan downcasting ke Dosen,
    maka akan terjadi ClassCastException pada runtime.
