public class GameOfThrones {
    /*9. Принимает строку и возвращает строку с правильным регистром для заголовков символов серии "Игра престолов" **/
    public static void main(String[] args){
        System.out.println(correctTitle("jOn SnoW, kINg IN thE noRth."));
        System.out.println(correctTitle("sansa stark, lady of winterfell."));
        System.out.println(correctTitle("TYRION LANNISTER, HAND OF THE QUEEN."));
    }

    public static StringBuilder correctTitle(String str) {
        StringBuilder sb = new StringBuilder();

        String[] nospace = str.split(" ");

        for (int i = 0; i < nospace.length; i++) {
            if (i != 0) sb.append(" ");

            String[] nodef = nospace[i].split("-");
            for (int j = 0; j < nodef.length; j++) {
                if(j > 0) sb.append("-");
                if (nodef[j].equalsIgnoreCase("the")
                        || nodef[j].equalsIgnoreCase("and")
                        || nodef[j].equalsIgnoreCase("in")
                        || nodef[j].equalsIgnoreCase("of")) sb.append(nodef[j].toLowerCase());
                else sb.append(nodef[j].substring(0, 1).toUpperCase()).append(nodef[j].substring(1).toLowerCase());
            }
        }
        return sb;
    }

}
