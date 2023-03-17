public class Main {

    static boolean palindrom(String metin){

        for(int i=0,j=metin.length()-1;i<j;i++,j--){

            if(metin.charAt(i)!=metin.charAt(j)) {
                System.out.println("Not Palindrome");
                return false;
            }
        }
        System.out.println("Palindrome");
        return true;

    }
    public static void main(String[] args) {

        boolean isPalindrome=palindrom("güllüg");
        System.out.println(isPalindrome);

    }
}