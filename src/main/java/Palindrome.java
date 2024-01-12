public class Palindrome {
    public boolean isPalindrome(String word) {
        return word != null ? word.replaceAll(" ", "").equals(new StringBuilder(word.replaceAll(" ", "")).reverse().toString()) : true;
    }

}
