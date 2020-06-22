public class LongLine {
    /*7. Возвращение самой длинной неповторяющейся подстроки **/
    public static void main(String[] args) {
        System.out.println(longestNonrepeatingSubstring("abcabcbb"));
        System.out.println(longestNonrepeatingSubstring("aaaaaa"));
    }


    public static StringBuilder longestNonrepeatingSubstring(String string)
    {

        StringBuilder sb = new StringBuilder();
        //StringBuilder sb1 = new StringBuilder();
        String pom = "";


        for (int i = 0; i < string.length(); i++) {
            if (!pom.contains(string.substring(i, i + 1))) pom += string.substring(i, i + 1);
            else {
                if (pom.length() > sb.length()) {
                    sb.setLength(0);
                    sb.append(pom);
                }


                pom = pom.substring(pom.indexOf(string.charAt(i)));
            }
        }
        if (pom.length() > sb.length()) {
            sb.setLength(0);
            sb.append(pom);

        }
        return sb;
    }
}
