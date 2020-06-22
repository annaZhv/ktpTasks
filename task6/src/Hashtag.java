import java.util.Arrays;
/*5. Функция, которая извлекает три самых длинных слова из заголовка газеты и преобразует их в хэштеги*/
public class Hashtag {

    public static void main(String[] args) {
        String[] b= {"b"};
        System.out.println(Arrays.toString(getHashTags("Hey Parents, Surprise, Fruit Juice Is Not Fruit")));
        System.out.println(Arrays.toString(getHashTags("Why You Will Probably Pay More for Your Christmas Tree This Year")));
    }

    /* Метод для преобразования самых длинных слов в заголовке газеты в хэштеги **/
    public static String[] getHashTags(String string){


        int raz = 0;
        for(int i = 0; i < string.length(); i++) if(string.charAt(i) == ' ') raz++;
        int nu = 0;

        String[] str;
        if(raz == 1 || raz == 0){
            str = new String[raz + 1];
            Arrays.fill(str,"#");

            for(int i = 0; i < string.length(); i++){
                if(string.charAt(i) == ' ') nu++;
                else if(!(string.charAt(i) == ',')) str[nu] += Character.toLowerCase(string.charAt(i));
            }

            if((raz == 1) && (str[0].length() < str[1].length())){
                    String dop = str[0];
                    str[0] = str[1];
                    str[1] = dop;
                }
            return str;
        }


        else {
            str = new String[raz + 1];
            Arrays.fill(str, "#");
            for(int i = 0; i < string.length(); i++){
                if(string.charAt(i) == ' ' ) nu++;
                else if(!(string.charAt(i) == ',')) str[nu] += Character.toLowerCase(string.charAt(i));
            }
            String[] fin = new String[3];
            Arrays.fill(fin,"");


            int ter = 0;
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < str.length; i++){
                for(int j = 0; j < str.length; j++){
                    if(ter == 3) break;

                    if(str[j].length() == max(str)) {
                        fin[ter] += str[j];
                        str[j] = "";

                        ter++;
                        break;
                    }
                }
            }


            return fin;
        }
    }
    /* Вспомогательная функцция для вычисления самого длинного слова **/
    public static int max(String[] string){
        int result = string[0].length();
        for(int i = 1; i < string.length; i++) if(string[i].length() > result) result = string[i].length();
        return result;
    }
}
