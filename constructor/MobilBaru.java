public class MobilBaru {
    //atribut
    private String warna;
    private String merk;
    //constructor
    public MobilBaru(String warna, String merk) {
        this.warna = warna;
        this.merk = merk;
    }
    //method
    public void tampilkanInfo() {
        System.out.println("Warna: " + warna);
        System.out.println("Merk: " + merk);
    }
}
