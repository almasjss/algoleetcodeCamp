package kz.almasjss;

public class ValidAnagram {
        public boolean isAnagram(String s, String t) {
            s=s.toLowerCase();
            t=t.toLowerCase();
            if(s.length()==t.length()){
                for(int i=0;i<s.length();i++){
                    for(int j=0;j<t.length();j++){
                        if(s.charAt(i)==t.charAt(j)){
                            return true;
                        }
                    }
                }
            }
            return false;

        }

    public static void main(String[] args) {
        ValidAnagram validAnagram = new ValidAnagram();
        System.out.println(validAnagram.isAnagram("Almas","Almaz"));

    }
    }
