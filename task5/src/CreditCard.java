
public class CreditCard {
    /*6. Является ли действительным номер кредитной карты **/
    public static void main(String[] args) {
        System.out.println(validateCard(1234567890123452L));
        System.out.println(validateCard(1234567890123456L));
    }


    public static boolean validateCard(long num) {
        String numstring = Long.toString(num);
        if (numstring.length() <= 14 || numstring.length() >= 19) return false;
        int controlnum = Character.digit(numstring.charAt(numstring.length() - 1), 10);
        StringBuilder sb = new StringBuilder();
        sb.append(numstring, 0, numstring.length() - 1);
        sb.reverse();
        int mid;
        int sum = 0;
        for(int i = 0; i < sb.length(); i++){
            mid = Character.digit(sb.charAt(i), 10);
            if(i % 2 == 0) {
                mid += mid;
                if (mid > 9) mid = mid / 10 + mid % 10;
            }
            sum += mid;
        }
        return 10 - sum % 10 == controlnum;
    }
}
