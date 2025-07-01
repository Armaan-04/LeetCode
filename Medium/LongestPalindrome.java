import java.util.Scanner;

public class LongestPalindrome { 
    int max = 0 , start = 0 , end = 0;
    boolean isPalindrome(String s , int i , int j){
        while(i<j){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);
            if (ch1 != ch2)
            return false;
        i++;
        j--;
        }
        return true;
    }

    public String longestPalindrome(String s){
        int n = s.length();
        for(int i = 0 ; i < n ; i++){
            for(int j = i ; j < n ; j++){ //i=0 j=(0,0)(0,1)(0,2)(0,3) , i=1 j=(1,1)(1,2)(1,3) , i=2 j=(2,2)(2,3)
                if(isPalindrome(s, i, j)==true){
                    if((j - i + 1) > max){ //current substring length
                        max = j - i + 1;
                        start = i;
                        end = j;
                    }
                }
            }
        }
        return s.substring(start, end + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Please enter your string: ");
        String str = sc.nextLine();

        LongestPalindrome obj = new LongestPalindrome();
        String result = obj.longestPalindrome(str);
        System.out.println("The longest palindrome is: " + result);
    }
}
