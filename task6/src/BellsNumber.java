public class BellsNumber {
    /*1. Возвращение числа Белла */
    public static void main(String[] args) {
        System.out.println(bell(3));
    }

    public static int bell(int num) {
        int res = 0;
        int[] [] array = new int[num + 1][num + 1];
        array[0][0] = 1;
        for (int i = 1; i <= num; i++){
            array[i][0] = array[i-1][i-1];
            for (int j = 1; j <= i; j++) {
                array[i][j] = array[i][j - 1] + array[i - 1][j - 1];
                res++;
            }
        }

        return res - 1;
    }
}
