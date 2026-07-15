public class validPalindrome2 {

    public static boolean checkPal(String s, int left , int right){
        while(left<right){
           if(s.charAt(left)!=s.charAt(right)){
            return false;
           }
           left++;
           right--;
        }
        return true;
    }
    public static boolean isPalindrome(String s){
        int left = 0;

        int right = s.length()-1;

        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return ( (checkPal(s, left+1, right)) || (checkPal(s, left, right-1)));
            }
            left++;
            right--;
        }

        return true;
    }
    public static void main(String[] args){
        String s = "aaabba";
        boolean res = isPalindrome(s);
        System.out.println(res);
    }
}
