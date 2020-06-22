public class ArabicToRoman {
    /*8. Функция для преобразования арабского числа в римское **/
    public static void main(String[] args)
    {
        System.out.println(convertToRoman(2));
        System.out.println(convertToRoman(12));
        System.out.println(convertToRoman(1126));
    }

    public static StringBuilder convertToRoman(int num){
        StringBuilder sb = new StringBuilder();
        if(num > 3999) return sb.append("Слишком большое число");
        String string = Integer.toString(num);
        if(string.length() == 1) sb.append(edNum(Character.getNumericValue(string.charAt(0))));
        else if(string.length() == 2){
            sb.append(decNum(Character.getNumericValue(string.charAt(0))));
            sb.append(edNum(Character.getNumericValue(string.charAt(1))));
        }
        else if(string.length() == 3){
            sb.append(sotNum(Character.getNumericValue(string.charAt(0))));
            sb.append(decNum(Character.getNumericValue(string.charAt(1))));
            sb.append(edNum(Character.getNumericValue(string.charAt(2))));
        }
        else if(string.length() == 4){
            sb.append(tysNum(Character.getNumericValue(string.charAt(0))));
            sb.append(sotNum(Character.getNumericValue(string.charAt(1))));
            sb.append(decNum(Character.getNumericValue(string.charAt(2))));
            sb.append(edNum(Character.getNumericValue(string.charAt(3))));
        }
        return sb;
    }
    /*Вспомогательная функция для единиц **/
    public static String edNum(int part){
        switch (part)
        {
            case (1) :
                return "I";
            case (2):
                return "II";
            case (3):
                return "III";
            case (4):
                return "IV";
            case (5):
                return "V";
            case (6):
                return "VI";
            case (7):
                return "VII";
            case (8):
                return "VIII";
            case (9):
                return "IX";
            default:
                return "";
        }
    }

    /* Вспомогательная функция для десятков **/
    public static String decNum(int part){
        switch (part)
        {
            case (1) :
                return "X";
            case (2):
                return "XX";
            case (3):
                return "XXX";
            case (4):
                return "XL";
            case (5):
                return "L";
            case (6):
                return "LX";
            case (7):
                return "LXX";
            case (8):
                return "LXXX";
            case (9):
                return "XC";
            default:
                return "";
        }
    }

    /* Вспомогательная функция для сотен **/
    public static String sotNum(int part){
        switch (part)
        {
            case (1) :
                return "C";
            case (2):
                return "CC";
            case (3):
                return "CCC";
            case (4):
                return "CD";
            case (5):
                return "D";
            case (6):
                return "DC";
            case (7):
                return "DCC";
            case (8):
                return "DCCC";
            case (9):
                return "CM";
            default:
                return "";
        }
    }

    /* Вспомогательная функция для тысяч **/
    public static String tysNum(int part) {
        switch (part) {
            case (1):
                return "M";
            case (2):
                return "MM";
            case (3):
                return "MMM";
            default:
                return "";
        }
    }
}
