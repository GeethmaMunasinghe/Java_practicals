public class PalindromeChecker {
    public static boolean isPalindrome(String str){
        String reversed=new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    public static void main(String[] args) {
        String input="madam";
        if (isPalindrome(input)){
            System.out.println("This is a Palindrome: " + input);
        }else {
            System.out.println("This is not a Palindrome: "+input);
        }
    }
}
