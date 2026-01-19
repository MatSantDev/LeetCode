package Excercices;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String palindrome = String.valueOf(x);
        int count = palindrome.length() - 1;
        for (int i = 0; i < palindrome.length() / 2; i++) {
            if (palindrome.charAt(i) != palindrome.charAt(count)){
                return false;
            }
            count--;
        }
        return true;
    }

}
