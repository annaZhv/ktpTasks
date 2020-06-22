import java.util.Arrays;
/*4. Функция, которая вычисляет сверхурочную работу и оплату, связанную с сверхурочной работой*/
public class UpTime {

    public static void main(String[] args) {
        Double[] arr = new Double[] {9.0, 17.0, 30.0, 1.5};
        System.out.println(overTime(arr));
    }


    public static String overTime(Double[] array)
    {
        double start = array[0];
        double end = array[1];
        double hpay = array[2];
        double coeff = array[3];
        if (start <= 17.0) {
            if (end > 17.0) return "$" + ((17.0 - start) * hpay + (end - 17.0) * hpay * coeff);
            return "$" + ((end - start) * hpay);
        }
        return "$" + ((end - start) * hpay * coeff);
    }

}
