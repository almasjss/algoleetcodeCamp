package kz.almasjss;

public class Palindrome {
    public static boolean isPalindrome(String str){
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        String rev = stringBuilder.toString();
        if (str.equals(rev)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("Almas"));
        System.out.println("Almas");
        System.out.println(isPalindrome("aaabbbaaa"));
        System.out.println("aaabbbaaa");
        System.out.println(isPalindrome("nitin"));
        System.out.println("nitin");
    }
}
