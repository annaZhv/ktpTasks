public class BuggerClass {
    /*6. Функция, которая принимает число и возвращает его мультипликативное постоянство, которое представляет собой количество раз, которое вы должны умножать цифры в num, пока не достигнете одной цифры*/
    public static void main(String[] args) {
        System.out.println(bugger(39));
    }

    public static int bugger(int num) {
        int count = 0;
        while(Integer.valueOf(num).toString().toCharArray().length > 1){
            int i = 1;
            for(char c : Integer.valueOf(num).toString().toCharArray())
                i *= Integer.parseInt(String.valueOf(c));
            num = i;
            count++;
        }
        return count;
    }

}
