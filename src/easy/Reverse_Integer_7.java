package easy;

/*
Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321

click to show spoilers.

Note:
The input is assumed to be a 32-bit signed integer. Your function should return 0 when the reversed integer overflows.
*/

import org.omg.PortableInterceptor.INACTIVE;

public class Reverse_Integer_7 {

    public static void main(String[] args) {
        Reverse_Integer_7 revobj = new Reverse_Integer_7();
        revobj.reverse(-84637);
    }
    public int reverse(int x) {
        long reverseInt =0;
        while(x!=0){
            int tail = x%10;
            reverseInt = reverseInt * 10+ tail;
            x = x/10;
            if(reverseInt > Integer.MAX_VALUE || reverseInt < Integer.MIN_VALUE){
                return  0;
            }

        }
        System.out.println(String.valueOf(reverseInt));
        return (int)reverseInt;
    }

}
