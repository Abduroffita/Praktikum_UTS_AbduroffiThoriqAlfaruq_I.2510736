public class Mahasiswa {
    //atribut
    private String nama;
    private int sks;

    //constructor
    public Mahasiswa(String nama, int sks, int Nim) {
        this.nama = nama;
        this.sks = sks;
    }

    //method
    public void setSks(int sks) {
        this.sks = sks;
    }

    public int getSks() {
        return sks;
    }


    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks);
    }
}

    
