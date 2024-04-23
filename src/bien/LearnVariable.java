package bien;

public class LearnVariable {
//bien
public  void sayhello(){
        int i = 10;
        System.out.println("gia tri cua i là:" +i );
}
public static void main(String[] args) {
        String name = "Thong";
        int age = 26;
        String address = "dong nai";
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
        LearnVariable bienlocal = new LearnVariable();
        bienlocal.sayhello();
        }

}
