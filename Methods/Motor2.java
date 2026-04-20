public class Motor2 {
    // atribut
    private String warna;
    private String merk;
    // constructor
    public Motor2(String warna, String merk) {
        this.warna = warna;
        this.merk = merk;
    }
    // method
    public void setWarna(String warna) {
        this.warna = warna;
    }
    public void setMerk(String merk) {
        this.merk = merk;
    }
    public void tampilkanInfo() {
        System.out.println("Warna: " + warna);
        System.out.println("Merk: " + merk);
    }
}
