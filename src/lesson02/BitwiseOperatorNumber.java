package lesson02;

public class BitwiseOperatorNumber {
    public static void main(String[] args) {
        System.out.println(4|5);
        // 100 = 4 => 0 *2^0 + 0 2*1 + 1*2^2
        // 101= 5 => 1*2^0 + 0*2^1 + 1*2^2
        // 101 = 5
        System.out.println(4&5);
        // 100 = 4 => 0 *2^0 + 0 2*1 + 1*2^2
        // 101= 5 => 1*2^0 + 0*2^1 + 1*2^2
        // 100 = 4
    }
}
