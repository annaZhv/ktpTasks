import java.util.LinkedHashMap;
import java.util.Map;
/*4. Функция, которая принимает URL (строку), удаляет дублирующиеся параметры запроса и параметры, указанные во втором аргументе*/
public class URL {

    public static void main(String[] args) {
        String[] b = {"b"};
        System.out.println(stripUrlParams("https://edabit.com?a=1&b=2&a=2", b));
        b[0] = "";
        System.out.println(stripUrlParams("https://edabit.com?a=1&b=2&a=2", b));
    }


    public static String stripUrlParams(String urlstr, String[] par) {
        if (!urlstr.contains("?")) return urlstr;
        String[] chk = urlstr.split("\\?")[1].split("&");
        Map<String, String> map = new LinkedHashMap();
        for (String ch : chk) {
            String[] str = ch.split("=");
            map.put(str[0], str[1]);
        }
        if (par != null) {
            for (String string : par) map.remove(string);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(urlstr.split("\\?")[0]);
        if (map.size() > 0) sb.append("?");
        for (Map.Entry entry : map.entrySet()) sb.append(entry.getKey()).append("=").append(entry.getValue()).append("&");
        String result = sb.toString().substring(0, sb.length() - 1);
        return result;
    }
}
