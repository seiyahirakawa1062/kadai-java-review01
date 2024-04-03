
public class ArithmeticExceptionSample {

    public static void main(String[] args) {
        // int型10をint型0で除算
        double a = 10.0 / 0.0; // この場合は例外は発生しない。

        // この下の出力は実行される！！
        System.out.println(a);

    }

}
