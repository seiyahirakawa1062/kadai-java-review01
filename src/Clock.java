
public class Clock {

    public static void main(String[] args) {
        int result = getSeconds(18,32,47);
        System.out.println(result + "秒");

    }
    public static int getSeconds(int num1,int num2,int num3) {
        int result1 = (num1 * 3600);
        int result2 = (num2 * 60);
        int result = (result1 + result2 + num3 );
        return result;

    }

}
