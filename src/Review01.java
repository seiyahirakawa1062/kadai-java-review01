
public class Review01 {

    public static void main(String[] args) {
        int kingaku = 1500;
        double result = tax(kingaku);
        System.out.println(kingaku + "円の商品の税込価格は" + (kingaku + (int)result) + "円(消費税は" + (int)result + "円）です。");
    }
    public static double tax(int money) {
        double result = money * 0.1;
        return result;

    }

}
