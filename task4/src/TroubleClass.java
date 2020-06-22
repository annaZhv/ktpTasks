public class TroubleClass {
    /*9. Функция, которая принимает два целых числа и возвращает true, если число повторяется три раза подряд в любом месте в num1 и то же самое число повторяется два раза подряд в num2*/
    public static void main(String[] args) {
        System.out.println(trouble("666789", "12345667"));
    }


    public static boolean trouble(String num1, String num2) {
        int l = num1.length();
        if (num2.length() > l) l = num2.length();
        for (int i = 1; i < l; i++) {
            if (num1.contains(Integer.toString(i) + i + i))
                if (num2.contains(Integer.toString(i) + i)) return true;
        }
        return false;
    }
}
