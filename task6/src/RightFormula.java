import java.util.Arrays;
/*9.  Является ли формула правильной */
public class RightFormula {
    public static void main(String[] args)
    {
        System.out.println(formula("6 * 4 = 24"));
        System.out.println(formula("18 / 17 = 2"));
    }

    public static boolean formula(String string){
        int raz = 0;
        for(int i = 0; i < string.length(); i++){
            if(string.charAt(i) == ' ') raz++;
        }

        String[] sarr = new String[raz + 1];
        Arrays.fill(sarr,"");
        raz = 0;

        for(int i = 0; i < string.length(); i++){
            if(string.charAt(i) == ' ') raz++;
            else sarr[raz] += string.charAt(i);
        }

        if(raz > 4 || !(sarr[3].equals("="))) return false;

        switch (sarr[1]) {
            case "+":
                return (Integer.parseInt(sarr[0]) + Integer.parseInt(sarr[2])) == Integer.parseInt(sarr[4]);
            case "-":
                return (Integer.parseInt(sarr[0]) - Integer.parseInt(sarr[2])) == Integer.parseInt(sarr[4]);
            case "*":
                return (Integer.parseInt(sarr[0]) * Integer.parseInt(sarr[2])) == Integer.parseInt(sarr[4]);
            case "/":
                return (Integer.parseInt(sarr[0]) / Integer.parseInt(sarr[2])) == Integer.parseInt(sarr[4]);
            default:
                return false;
        }


    }
}
