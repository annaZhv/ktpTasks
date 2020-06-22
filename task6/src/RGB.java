public class RGB {
    /*3. Является ли формат принимаемых значений допустимыми параметрами RGB */
    public static void main(String[] args) {
        System.out.println(validColor("rgb(255,256,255)"));
        System.out.println(validColor("rgba(0,0,0,0.123456789)"));
    }

        public static boolean validColor(String string)
    {
        String num = string.substring(string.indexOf("(") + 1, string.indexOf(")"));
        String[] nums = num.split(",");
        if (!string.contains("rgba") && nums.length != 3 && string.contains("rgb")) return false;
        if (string.contains("rgba") && nums.length != 4) return false;

        if (nums.length == 4) return !(Double.parseDouble(nums[3]) < 0) && !(Double.parseDouble(nums[3]) > 1);

        for (int i = 0; i < 3; i++)
            if (Integer.parseInt(nums[i]) < 0 || Integer.parseInt(nums[i]) > 255) return false;


        return true;

    }
}
