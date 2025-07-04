import java.util.Scanner;

public class ReverseInteger {
    
    static int reverse(int x){
        int rev = 0;
        while(x != 0){
            int digit = x % 10;   //returns the quotient
            if(rev > Integer.MAX_VALUE/10 || rev < Integer.MIN_VALUE/10) //max 32 bit integer's last digit is 7 and min's is -8.-334
            {
                return 0;
            }
            rev = (rev * 10) + digit;
            x = x/10; //removes the denominator
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a 32-bit integer: ");
        int x = sc.nextInt();

        ReverseInteger obj = new ReverseInteger();
        int result = reverse(x);
        System.out.println("The reverse of the integer is: " + result);

    }
    
}
