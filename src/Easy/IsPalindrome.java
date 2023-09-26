package Easy;

public class IsPalindrome {
    public boolean isPalindrome(int x) {
        boolean validate = true;
        if (x < 0) {
            validate = false;
        }

        while (x >= 10) {
            int lastDigit = x % 10;
            int firstDigit = x / (int) Math.pow(10, (int) Math.log10(x));
            if (lastDigit != firstDigit) {
                validate = false;
                break;
            }
            x = x % (int) Math.pow(10, (int) Math.log10(x));
            x = x / 10;
        }
        return validate;
    }
    public static void main(String[] args) {
        IsPalindrome isPalindrome = new IsPalindrome();
        System.out.println(isPalindrome.isPalindrome(1001));
    }
}
