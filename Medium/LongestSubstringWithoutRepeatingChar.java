
import java.util.HashSet;
import java.util.Scanner;

public class LongestSubstringWithoutRepeatingChar{
    public int lengthOfLongestSubstring( String s){
        HashSet <Character> set = new HashSet<>();
        int maxLength=0;
        int left=0;
        int right=0;

        for(right = 0 ; right < s.length() ; right++){
            Character ch = s.charAt(right);
            while (set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);
            int len = right - left + 1;
            maxLength = Math.max(maxLength , len);
        }
        return maxLength;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your string: ");
        String str= sc.nextLine();

        LongestSubstringWithoutRepeatingChar obj = new LongestSubstringWithoutRepeatingChar();
        int result = obj.lengthOfLongestSubstring(str);
        System.out.println("Length of the longest Substring without repeating characters is: " +result);
    }
}