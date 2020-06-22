public class Rhyme {
    /*8. Рифмуются ли две строки */
    public static void main(String[] args) {
        System.out.println(doesRhyme("Sam I am!", "Green eggs and ham."));
    }

    public static boolean doesRhyme(String str1, String str2) {
        str1 = str1.replaceAll("\\p{Punct}","");
        str2 = str2.replaceAll("\\p{Punct}","");
        String[] strspl1 = str1.split(" ");
        String[] strspl2 = str2.split(" ");
        String glas = "aeiouAEIOU";
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < strspl1[strspl1.length - 1].length(); i++) {
            if (glas.contains(Character.toString(strspl1[strspl1.length - 1].charAt(i))))
                sb.append(strspl1[strspl1.length - 1].charAt(i));
        }
        for (int i = 0; i < strspl2[strspl2.length - 1].length(); i++) {
            if (glas.contains(Character.toString(strspl2[strspl2.length - 1].charAt(i))))
                sb1.append(strspl2[strspl2.length - 1].charAt(i));
        }
        return sb.toString().equals(sb1.toString());
    }


}
