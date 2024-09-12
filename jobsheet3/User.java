package jobsheet3;

public class User {
    public String username;
    public String nama;
    public String email;
    public String alamat;
    public String pekerjaan;

    public User (String username, String nama, String email) {
        this.username = username;
        this.nama = nama;
        this.email = email;
    }

    public void cetakInfo() {
        System.out.println("Usename    : " + username);
        System.out.println("Nama       : " + nama);
        System.out.println("Email      : " + email);
        System.out.println("Alamat     : " + alamat);
        System.out.println("Peekerjaan : " + pekerjaan);
        System.out.println("===================");
    }
}