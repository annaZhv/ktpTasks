
public class Latin {
/*2. Две функции, чтобы сделать переводчик с английского на свинский латинский*/
    public static void main(String[] args) {
        System.out.println(translateWord("trebuchet"));
        System.out.println(translateSentence("Do you think it is going to rain today?"));
    }

    /** Метод для перевода слова с английского на "поросячью латынь" **/
    public static StringBuilder translateWord(String string){
        StringBuilder sb1 = new StringBuilder();
        if(string.equals("")) return sb1;
        char c = Character.toLowerCase(string.charAt(0));
        if(c == 'a' || c == 'e' || c == 'i' ||  c == 'o' || c == 'u' || c == 'y'){
            sb1.append(string).append("yay");
            return sb1;
        }
        else {
            StringBuilder sb = new StringBuilder();
            int count = 0;
            while(!(string.charAt(count) == 'a' || string.charAt(count) == 'e' || string.charAt(count) == 'i' || string.charAt(count) == 'o' || string.charAt(count) == 'u' || string.charAt(count) == 'y')){

                sb.append(string.charAt(count));
                count++;
            }
            sb.append("ay");
            for(int i = count; i < string.length(); i++){
                sb1.append(string.charAt(i));
            }
            sb1.append(sb);


            return sb1;
        }
    }

    /* Метод для перевода предложения с английского на "поросячью латынь" */
    public static StringBuilder translateSentence(String string){
        StringBuilder sb = new StringBuilder();
        String[] spl = string.split(" ");
        for (int i = 0; i < spl.length; i++){
            String part;
            if (!Character.isLetter(spl[i].charAt(spl[i].length() - 1))){
                char c = spl[i].charAt(spl[i].length() - 1);
                spl[i] = spl[i].substring(0, spl[i].length() - 1);
                part = translateWord(spl[i]) + Character.toString(c) + " ";
            }
            else part = translateWord(spl[i]) + " ";


            if (!part.equals(part.toLowerCase())) part = part.substring(0, 1).toUpperCase() + part.substring(1).toLowerCase();

            sb.append(part);
        }

        return sb;
    }


}
