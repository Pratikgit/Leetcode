package easy;

/*
Given a roman numeral, convert it to an integer.
Input is guaranteed to be within the range from 1 to 3999.*/

import java.util.HashMap;

public class Roman_to_Integer_13 {

    /**
     * http://www.rapidtables.com/convert/number/roman-numerals-converter.htm
     * @param args
     */
    public static void main(String[] args) {
        Roman_to_Integer_13 roman_to_integer_13 = new Roman_to_Integer_13();
        roman_to_integer_13.romanToInt("IV");
    }
    public int romanToInt(String s) {
        int sum=0;

        // Special Cases
        if(s.indexOf("IV")!=-1){sum-=2;}
        if(s.indexOf("IX")!=-1){sum-=2;}
        if(s.indexOf("XL")!=-1){sum-=20;}
        if(s.indexOf("XC")!=-1){sum-=20;}
        if(s.indexOf("CD")!=-1){sum-=200;}
        if(s.indexOf("CM")!=-1){sum-=200;}

        char c[]=s.toCharArray();
        int count=0;

        // add evry letter
        for(;count<=s.length()-1;count++){
            if(c[count]=='M') sum+=1000;
            if(c[count]=='D') sum+=500;
            if(c[count]=='C') sum+=100;
            if(c[count]=='L') sum+=50;
            if(c[count]=='X') sum+=10;
            if(c[count]=='V') sum+=5;
            if(c[count]=='I') sum+=1;

        }

        return sum;

    }

}
