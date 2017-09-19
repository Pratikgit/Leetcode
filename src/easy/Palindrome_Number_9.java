package easy;

public class Palindrome_Number_9 {

    public static void main(String[] args) {

        Palindrome_Number_9 palindrome_number_9 = new Palindrome_Number_9();
        System.out.println("Value " +String.valueOf(palindrome_number_9.isPalindrome(11211)));
    }

    public boolean isPalindrome(int x) {
        boolean value = true;
        String paliStr = String.valueOf(x);
        int i=0;
        int j=paliStr.length()-1;
        char []paliChar = paliStr.toCharArray();
        while (i<j){
            if(paliChar[i] == paliChar[j]){
                i++;
                j--;
            }else{
               value = false;
               break;
            }
        }
        return value;
    }
}
