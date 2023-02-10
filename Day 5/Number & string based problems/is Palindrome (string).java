public class IsPalindromeString {
    public static int getIsPalindromeString(String input1) {
        input1 = input1.toLowerCase();
        int digitCount = input1.length();
        boolean isPalindrome = true;

        int range = digitCount / 2;
        if (digitCount % 2 == 0) range--;

        for (int i = 0; i <= range; i++) {
            if (input1.charAt(i) != input1.charAt(digitCount - i - 1)) isPalindrome = false;
        }

        if (isPalindrome == true) return 2;
        else return 1;
    }
}
Footer
© 2023 GitHub, Inc.
Footer navigation
Terms
Privacy
Security
