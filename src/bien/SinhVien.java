package bien;

public class SinhVien {
    //bien static
    public static String ten = "ho bao thong";
    public int age = 10;
    public static void main(String[] args) {
        System.out.println(ten);
        SinhVien sv = new SinhVien();
        System.out.println(sv.age);
    }
}
