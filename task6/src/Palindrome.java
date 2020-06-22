public class Palindrome {
    /*10. Является ли само число или его потомок палиндромом **/
    public static void main(String[] args)
    {
        System.out.println(palindromeDescendant(11211230));
        System.out.println(palindromeDescendant(13001120));
        System.out.println(palindromeDescendant(23336014));
        System.out.println(palindromeDescendant(1231));
    }


    public static boolean palindromeDescendant(int num) {
        StringBuilder sb = new StringBuilder(Integer.toString(num));
        StringBuilder sb1 = new StringBuilder();
        for(int i = 0; i < sb.length(); i++) sb1.insert(0, sb.charAt(i));

        for(int i = 0; sb.length() >= 2; i++){
            if(sb.toString().equals(sb1.toString())) return true;
            sb.setLength(0);
            for(int j = sb1.length() - 1; j > 0; j = j - 2)
                sb.append(Character.getNumericValue(sb1.charAt(j)) + Character.getNumericValue(sb1.charAt(j - 1)));
            sb1.setLength(0);
            for(int k = 0; k < sb.length(); k++) sb1.insert(0, sb.charAt(k));
        }
        return false;
    }
}
