
public class Review01 {

    public static void main(String[] args) {
        int kingaku = 1500;
        int result = tax(kingaku);
        System.out.println(kingaku + "円の商品の税込価格は" + (kingaku + result) + "円(消費税は" + result + "円）です。");
    }
    public static int tax(int money) {
        int result = (int)(money * 0.1);
        return result;

    }

}
