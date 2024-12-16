package Array;

public class Palindrom_8 {

    public static boolean isStringPalindrom(String str){
        int i = 0;
        int j = str.length();
        while(i<j){
            if(str.charAt(i)==str.charAt(j-1)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }

    public static boolean isStringPalindrom1(String word){
        char[] charArray = word.toCharArray();
        int start = 0;
        int end = charArray.length-1;
        while(start<end){
            if(charArray[start] != charArray[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "naman";
        //System.out.println(str.charAt(4));
        boolean result = isStringPalindrom(str);
        boolean result1 = isStringPalindrom1(str);
        System.out.println(result);
        System.out.println(result1);

    }

}
