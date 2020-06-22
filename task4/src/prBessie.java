import java.util.Arrays;
/*1. Текстовый процессор для проверки эссе Бесси **/
public class prBessie {
    public static void main(String[] args) {
        System.out.println(Processor(10, 7, "hello my name is Bessie and this is my essay"));
    }


    public static StringBuilder Processor(int n, int k, String string) {
        int momentlen = 0;
        StringBuilder sb = new StringBuilder();
        String[] splstr = string.split(" ");
        System.out.println(Arrays.toString(splstr));
        sb.append(splstr[0]);
        momentlen = splstr[0].length();

        for (int i = 1; i < n; i++) {
            if (momentlen + splstr[i].length() <= k) {
                sb.append(" ");
                sb.append(splstr[i]);
                momentlen += splstr[i].length();
            }
            else {
                sb.append("\n");
                sb.append(splstr[i]);
                momentlen = splstr[i].length();
            }


        }
        return sb;
    }
}