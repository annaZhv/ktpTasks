import java.util.LinkedList;
/*5. Функция, которая выбирает все слова, имеющие все те же гласные (в любом порядке и / или количестве), что и первое слово, включая первое слово*/
public class SameVowel {
    public static void main(String[] args) {
        String[] array = {"toe", "ocelot", "maniac"};
        System.out.println(sameVowelGroup(array));
    }

        public static LinkedList sameVowelGroup(String[] array) {
        String glas = "aouieAOUIE";
        LinkedList list = new LinkedList();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array[0].length(); i++) {
            if (glas.contains(Character.toString(array[0].charAt(i))))
                sb.append(array[0].charAt(i));
        }
        //System.out.println(sb);
        list.add(array[0]);
        for (int i = 1; i < array.length; i++) {
            boolean flag = false;
            for (int j = 0; j < array[i].length(); j++) {
                if (!sb.toString().contains(array[i].substring(j, j + 1)) &&
                        glas.contains(Character.toString(array[i].charAt(j)))) {
                    flag = true;
                    break;
                }
            }
            if (!flag) list.add(array[i]);
        }
        return list;
    }
}
