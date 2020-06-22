import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int l, r;
        Scanner in = new Scanner(System.in);
        System.out.print("Make your choice:\n" +
                "1)solutions\n" +
                "2)findZip\n" +
                "3)checkPerfect\n" +
                "4)flipEndChars\n" +
                "5)isValidHexCode\n" +
                "6)same\n" +
                "7)isKaprekar\n" +
                "8)longestZero\n" +
                "9)nextPrime\n" +
                "10)rightTriangle\n");
        System.out.print("Your choice: ");
        int p = in.nextInt();
        switch (p) {
            case (1):
                System.out.print("Answer: " + solutions(in.nextInt(), in.nextInt(), in.nextInt()));
                break;
            case (2):
                System.out.println("Строку необходимо писать через пробел сразу после номера задачи");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(in.nextLine());
                sb2.deleteCharAt(0);
                String s2 = sb2.toString();
                System.out.print("Answer: " + findZip(s2));
                break;
            case (3):
                System.out.print("Answer: " + checkPerfect(in.nextInt()));
                break;
            case (4):
                System.out.println("Строку необходимо писать через пробел сразу после номера задачи");
                StringBuilder sb4 = new StringBuilder();
                sb4.append(in.nextLine());
                sb4.deleteCharAt(0);
                String s4 = sb4.toString();
                System.out.print("Answer: " + flipEndChars(s4));
                break;
            case (5):
                System.out.println("Строку необходимо писать через пробел сразу после номера задачи");
                StringBuilder sb5 = new StringBuilder();
                sb5.append(in.nextLine());
                sb5.deleteCharAt(0);
                String s5 = sb5.toString();
                System.out.print("Answer: " + isValidHexCode(s5));
                break;
            case (6):
                System.out.print("Array1 length: ");
                l = in.nextInt();
                int[] arr1 = new int[l];
                for(int i = 0; i < arr1.length; i++) {
                    arr1[i] = in.nextInt();
                }
                System.out.print("Array2 length: ");
                r = in.nextInt();
                int[] arr2 = new int[r];
                for(int i = 0; i < arr2.length; i++) {
                    arr2[i] = in.nextInt();
                }
                System.out.print("Answer: " + same(arr1, arr2));
                break;
            case (7):
                System.out.print("Answer: " + isKaprekar(in.nextInt()));
                break;
            case (8):
                System.out.println("Строку необходимо писать через пробел сразу после номера задачи");
                StringBuilder sb8 = new StringBuilder();
                sb8.append(in.nextLine());
                sb8.deleteCharAt(0);
                String s8 = sb8.toString();
                System.out.print("Answer: " + longestZero(s8));
                break;
            case (9):
                System.out.print("Answer: " + nextPrime(in.nextInt()));
                break;
            case (10):
                System.out.print("Answer: " + rightTriangle(in.nextInt(), in.nextInt(), in.nextInt()));
                break;
            default:
                System.out.print("Bad choice.");
                break;
        }
    }





    /*1. Dернуть число решений в квадратном уравнение*/
    public static int solutions(int a, int b, int c){
        int sol = 0, d = 0;
        d = b * b - 4 * a * c;
        if (d > 0) return 2;
        if (d == 0) return 1;
        return 0;
    }





    /*2. Функция, которая возвращает позицию второго вхождения " zip " в строку, или -1, если оно не происходит по крайней мере дважды*/
    public static int findZip(String str){
        int index = str.indexOf("zip");
        if (index != -1) {
            index = str.indexOf("zip", index + 1);
        }
        return index;
    }





    /*3. Является ли целое число совершенным */
    public static boolean checkPerfect(int n){
        int sum = 0;
        for(int j = 1; j < n; j++) {
            if(n % j == 0) {
                sum += j;
            }
        }
        return sum == n;
    }





    /*4. Функция, которая принимает строку и возвращает новую строку с заменой ее первого и последнего символов, за исключением некоторых условий*/
    public static String flipEndChars(String str){
        System.out.println(str);
        if(str.length() < 2) return "Incompatible.";
        char[] chars = str.toCharArray();
        int last = chars.length - 1;
        char tmp = chars[0];
        if(chars[0] == chars[last]) return "Two's a pair.";
        chars[0] = chars[last];
        chars[last] = tmp;
        str = new String(chars);
        return str;
    }







    /*5. Функция, которая определяет, является ли строка допустимым шестнадцатеричным кодом*/
    public static boolean isValidHexCode(String str){
        boolean hex;
        if ((str.charAt(0)!='#')||(str.length()!=7))
            return false;
        for(int i = 1; i < str.length(); i++)
            if (!Character.isDigit(str.charAt(i)))
                if ((Character.toUpperCase(str.charAt(i)) < 65) || (Character.toUpperCase(str.charAt(i)) > 70))
                    return false;
        return true;
    }







    /*6. Имеют ли два массива одинаковое количество уникальных элементов*/
    public static boolean same(int[] arr1, int[] arr2)
    {
        int uniq = 0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i = 0; i < Math.max(arr1.length - 1, arr2.length - 1); i++)
        {
            if (i < arr1.length - 1)
                if (Arrays.binarySearch(arr1, i + 1, arr1.length - 1, arr1[i]) < 0)
                    uniq++;
            if (i < arr2.length - 1)
                if (Arrays.binarySearch(arr2, i + 1, arr2.length - 1, arr2[i]) < 0)
                    uniq--;
        }

        if (arr1.length == 1) uniq++;
        else if(arr1[arr1.length - 2] != arr1[arr1.length - 1]) uniq++;


        if (arr2.length == 1) uniq--;
        else if(arr2[arr2.length - 2] != arr2[arr2.length - 1]) uniq--;

        return uniq == 0;
    }






    /*7. Проверка, является ли данное число числом Капрекара */
    public static boolean isKaprekar(int n)
    {
        int step = n * n;
        String s1, s2;
        int len = Integer.toString(step).length() / 2;
        if (Integer.toString(step).substring(0, len).length() == 0) s1 = "0";
        else s1 = Integer.toString(step).substring(0, len);

        s2 = Integer.toString(step).substring(len);

        return Integer.parseInt(s1) + Integer.parseInt(s2) == n;
    }






    /*8. Функция, которая возвращает самую длинную последовательность последовательных нулей в двоичной строке*/
    public static String longestZero(String s)
    {
        StringBuilder sb = new StringBuilder();
        while (s.contains(sb + "0")) sb.append("0");
        return sb.toString();
    }






    /*9. Возвращание следующего простого числа, если исходное число не простое **/
    public static int nextPrime(int n) {
        boolean prime = true;
        int nn = n;
        for (int i = 2; prime && i < n; i++) {
            prime = n % i != 0;
        }
        while (!prime)
        {
            nn++;
            prime = true;
            for (int i = 2; prime && i < nn; i++) {
                prime = nn % i != 0;
            }
        }
        return nn;
    }







    /*10. Являются x, y и z ребрами прямоугольного треугольника*/
    public static boolean rightTriangle(int x, int y, int z)
    {
        int max = Math.max(x, Math.max(y, z));
        int m1;
        if (max != x) {
            m1 = x;
        }
        else if (max != y) {
            m1 = y;
        }
        else m1 = z;
        int m2 = x + y + z - m1 - max;
        return m1 * m1 + m2 * m2 == max * max;
    }
}
