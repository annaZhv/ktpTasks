public class UntilOne {
    /*4. Функция, которая складывает числа вместе и возвращает произведение цифр до тех пор,
     * пока ответ не станет длиной в 1 цифру **/
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println(sumDigProd(array));
    }


    public static int sumDigProd(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        while (sum > 9){
            int ssum = 1;
            ssum *= sum / 10;
            ssum *= sum % 10;
            sum = ssum;
        }
        return sum;
    }

}
