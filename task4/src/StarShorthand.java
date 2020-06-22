public class StarShorthand {
/*7. Функция, которая преобразует строку в звездную стенографию. Если символ повторяется n раз, преобразуйте его в символ*n */
    public static void main(String[] args) {
        System.out.println(toStarShorthand("77777geff"));
    }

    public static StringBuilder toStarShorthand(String string) {
        int count = 1;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < string.length() - 1; i++)
        {
            if (string.charAt(i) == string.charAt(i + 1)) count++;
            else {
                if (count > 1) {
                    sb.append(string.charAt(i)).append("*").append(count);
                    count = 1;
                }
                else sb.append(string.charAt(i));
            }
        }
        if (string.charAt(string.length() - 1) == string.charAt(string.length() - 2))
            sb.append(string.charAt(string.length() - 1)).append("*").append(count);
        else sb.append(string.charAt(string.length() - 1));
        return sb;
    }
}
