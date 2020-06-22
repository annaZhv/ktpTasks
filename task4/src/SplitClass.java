import java.util.LinkedList;
/*2. Группирование строки в кластер скобок*/
public class SplitClass {

    public static void main(String[] args) {
        System.out.println(Split("((())())(()(()()))"));
    }


    public static LinkedList Split(String string)
    {
        int n = 0;
        LinkedList list = new LinkedList();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '(') n++;
            else if (string.charAt(i) == ')') n--;
            sb.append(string.charAt(i));
            if (n == 0) {
                list.add(sb.toString());
                sb = new StringBuilder();
            }
        }
        return list;
    }
}
