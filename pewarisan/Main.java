package pewarisan;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.nama = "Budi";
        mahasiswa.umur = 20;
        mahasiswa.Nim = "4242564";
        mahasiswa.tampilkanInfo();
        mahasiswa.tampilkanNim();
        
        Dosen dosen = new Dosen();
        dosen.nama = "Dr Ahmad";
        dosen.umur = 40;
        dosen.Nidn = "654321";
        dosen.tampilkanInfo();
        dosen.tampilkanNidn();
    }
}
