public class CamelSnake {
    /*3. Создайте две функции toCamelCase () и toSnakeCase (), каждая из которых берет
    одну строку и преобразует ее либо в camelCase, либо в snake_case*/
    public static void main(String[] args) {
        System.out.println(toCamelCase("is_modal_open"));
        System.out.println(toSnakeCase("isModalOpen"));
    }

    public static StringBuilder toCamelCase(String str)
    {
        String[] parts = str.split("_");
        StringBuilder sb = new StringBuilder();
        sb.append(parts[0]);
        for(int i = 1; i < parts.length; i++){
            sb.append(parts[i].substring(0, 1).toUpperCase()).append(parts[i].substring(1));

        }
        return sb;
    }


    public static StringBuilder toSnakeCase(String str)
    {
        StringBuilder sb = new StringBuilder();
        int k = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == Character.toUpperCase(str.charAt(i)))
            {
                sb.append(str.substring(k, i).toLowerCase()).append("_");
                k = i;
            }
        }
        sb.append(str.substring(k).toLowerCase());
        return sb;
    }

}
