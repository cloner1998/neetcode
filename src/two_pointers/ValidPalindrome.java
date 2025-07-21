package two_pointers;

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        String sRegs = s.replaceAll("[^a-zA-Z0-9]", "");
        String sLowerCase = sRegs.toLowerCase();
        StringBuilder sBuilder = new StringBuilder(sLowerCase);
        String sReverse = sBuilder.reverse().toString();

        return sReverse.equals(sLowerCase);
    }
}
