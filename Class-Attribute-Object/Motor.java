public class Motor {
// Atribut
private String Warna;
private String Merk;
// Constructor
public Motor(String warna, String merk) {
    this.Warna = warna;
    this.Merk = merk;
}
// Method
public void tampilkanInfo() {
    System.out.println("Warna: " + Warna);
    System.out.println("Merk: " + Merk);
}
}