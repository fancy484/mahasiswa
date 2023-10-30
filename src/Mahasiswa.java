public class Mahasiswa {
    // Atribut
    private String nama;
    private String nim;
    private int usia;

    /**
     *
     * @param nama
     * @param nim
     * @param usia
     */
    public Mahasiswa(String nama, String nim, int usia) {
        this.nama = nama;
        this.nim = nim;
        this.usia = usia;
    }

    // Metode untuk menampilkan informasi mahasiswa
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Usia: " + usia + " tahun");
    }

    // Metode untuk mengubah usia mahasiswa
    public void ubahUsia(int usiaBaru) {
        this.usia = usiaBaru;
    }

    public static void main(String[] args) {
        // Membuat objek Mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa("John Doe", "123456789", 20);

        // Menampilkan informasi awal mahasiswa
        System.out.println("Informasi awal mahasiswa:");
        mahasiswa1.tampilkanInfo();

        // Mengubah usia mahasiswa
        mahasiswa1.ubahUsia(21);

        // Menampilkan informasi setelah mengubah usia
        System.out.println("\nInformasi setelah mengubah usia:");
        mahasiswa1.tampilkanInfo();
    }
}