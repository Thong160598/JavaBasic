package toantu;

public class ToanTuBit {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        boolean checkValue = (a>1) & (b > 2);
        String expectedText = "Login";
        String actualText = "Login";
        String buttonExpectedColor = "f77b0b";
        String buttonActualColor = ""; //lấy bằng auto với sele
        System.out.println((expectedText == actualText) && (buttonExpectedColor == buttonActualColor));
    }
}
