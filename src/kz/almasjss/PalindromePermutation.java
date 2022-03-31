package kz.almasjss;

public class PalindromePermutation {
    public boolean canPermutationPalindrome(String s){
        int[] char_count = new int[128];
        for (int i=0;i<s.length();i++){
            char_count[s.charAt(i)]++;
        }
        int count =0 ;
        for (int i=0;i<128;i++){
            count += char_count[i]%2;
        }
        return count <=1 ;
    }
    public static void main(String[] args) {
        PalindromePermutation palindromePermutation = new PalindromePermutation();
        String s = "aab";
        String s2 = "code";
        String s3 =  "carerac";
        System.out.println(palindromePermutation.canPermutationPalindrome(s));
        System.out.println("---");
        System.out.println(palindromePermutation.canPermutationPalindrome(s2));
        System.out.println("---");
        System.out.println(palindromePermutation.canPermutationPalindrome(s3));

    }
}
