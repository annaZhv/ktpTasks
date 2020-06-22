public class NumbersToEng {
    /*7. Функция, который возвращает строковое представление этого целого числа,написанное на английском и русском языках **/
    public static void main(String[] args) {
        System.out.println(numToEng(126));
    }

    public static StringBuilder numToEng(int num) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sbRus = new StringBuilder();
        if (num == 0) return sb.append("zero").append("\nноль");
        int part;
        part = num / 100;
        sb.append(Sot(part));
        sbRus.append(SotRus(part));
        part = num % 100;
        if(part >= 20 || part < 10){
            sb.append(Dec(part / 10));
            sb.append(Ed(num % 10));
            sbRus.append(DecRus(part / 10));
            sbRus.append(EdRus(num % 10));
        }
        else return sb.append(otroDec(num % 100)).append("\n").append(sbRus.append(otroDecRus(num % 100)));

        return sb.append("\n").append(sbRus);
    }

    /* Функция для сотен на английском */
    public static StringBuilder Sot(int part){
        StringBuilder sbsot = new StringBuilder();
        switch (part)
        {
            case (1) :
                sbsot.append("one hundred ");
                break;
            case (2):
                sbsot.append("two hundred ");
                break;
            case (3):
                sbsot.append("three hundred ");
                break;
            case (4):
                sbsot.append("four hundred ");
                break;
            case (5):
                sbsot.append("five hundred ");
                break;
            case (6):
                sbsot.append("six hundred ");
                break;
            case (7):
                sbsot.append("seven hundred ");
                break;
            case (8):
                sbsot.append("eight hundred ");
                break;
            case (9):
                sbsot.append("nine hundred ");
                break;
            default:
                break;
        }

        return sbsot;
    }

    /* Функция для сотен на русском **/
    public static StringBuilder SotRus(int part){
        StringBuilder sbsot = new StringBuilder();
        switch (part)
        {
            case (1) :
                sbsot.append("сто ");
                break;
            case (2):
                sbsot.append("двести ");
                break;
            case (3):
                sbsot.append("триста ");
                break;
            case (4):
                sbsot.append("четыреста ");
                break;
            case (5):
                sbsot.append("пятьсот ");
                break;
            case (6):
                sbsot.append("шестьсот ");
                break;
            case (7):
                sbsot.append("семьсот ");
                break;
            case (8):
                sbsot.append("восемьсот ");
                break;
            case (9):
                sbsot.append("девятьсот ");
                break;
            default:
                break;
        }

        return sbsot;
    }

    /* Функция для десятков(20-90) на английском **/
    public static StringBuilder Dec(int part){
        StringBuilder sbdec = new StringBuilder();
        switch (part)
        {
            case (2):
                sbdec.append("twenty ");
                break;
            case (3):
                sbdec.append("thirty ");
                break;
            case (4):
                sbdec.append("forty ");
                break;
            case (5):
                sbdec.append("fifty ");
                break;
            case (6):
                sbdec.append("sixty ");
                break;
            case (7):
                sbdec.append("seventy ");
                break;
            case (8):
                sbdec.append("eighty ");
                break;
            case (9):
                sbdec.append("ninety ");
                break;
            default:
                break;
        }

        return sbdec;
    }

    /* Функция для десятков(20-90) на русском **/
    public static StringBuilder DecRus(int part){
        StringBuilder sbdec = new StringBuilder();
        switch (part)
        {
            case (2):
                sbdec.append("двадцать ");
                break;
            case (3):
                sbdec.append("тридцать ");
                break;
            case (4):
                sbdec.append("сорок ");
                break;
            case (5):
                sbdec.append("пятьдесят ");
                break;
            case (6):
                sbdec.append("шестьдесят ");
                break;
            case (7):
                sbdec.append("семьдесят ");
                break;
            case (8):
                sbdec.append("восемьдесят ");
                break;
            case (9):
                sbdec.append("девяносто ");
                break;
            default:
                break;
        }

        return sbdec;
    }

    /* Функция для десятков(10-20) на английском **/
    public static StringBuilder otroDec(int part){
        StringBuilder sbotro = new StringBuilder();
        switch (part)
        {
            case (10):
                sbotro.append("ten");
                break;
            case (11):
                sbotro.append("eleven");
                break;
            case (12):
                sbotro.append("twelve");
                break;
            case (13):
                sbotro.append("thirteen");
                break;
            case (14):
                sbotro.append("fourteen");
                break;
            case (15):
                sbotro.append("fifteen");
                break;
            case (16):
                sbotro.append("sixteen");
                break;
            case (17):
                sbotro.append("seventeen");
                break;
            case (18):
                sbotro.append("eighteen");
                break;
            case (19):
                sbotro.append("nineteen");
                break;
            default:
                break;
        }

        return sbotro;
    }

    /* Функция для десятков(10-20) на русском **/
    public static StringBuilder otroDecRus(int part){
        StringBuilder sbotro = new StringBuilder();
        switch (part)
        {
            case (10):
                sbotro.append("десять");
                break;
            case (11):
                sbotro.append("одиннадцать");
                break;
            case (12):
                sbotro.append("двенадцать");
                break;
            case (13):
                sbotro.append("тринадцать");
                break;
            case (14):
                sbotro.append("четырнадцать");
                break;
            case (15):
                sbotro.append("пятнадцать");
                break;
            case (16):
                sbotro.append("шестнадцать");
                break;
            case (17):
                sbotro.append("семнадцать");
                break;
            case (18):
                sbotro.append("восемнадцать");
                break;
            case (19):
                sbotro.append("девятнадцать");
                break;
            default:
                break;
        }

        return sbotro;
    }

    /* Функция для единиц на английском **/
    public static StringBuilder Ed(int part){
        StringBuilder sbed = new StringBuilder();
        switch (part)
        {
            case (1) :
                sbed.append("one");
                break;
            case (2):
                sbed.append("two");
                break;
            case (3):
                sbed.append("three");
                break;
            case (4):
                sbed.append("four");
                break;
            case (5):
                sbed.append("five");
                break;
            case (6):
                sbed.append("six");
                break;
            case (7):
                sbed.append("seven");
                break;
            case (8):
                sbed.append("eight");
                break;
            case (9):
                sbed.append("nine");
                break;
            default:
                break;
        }

        return sbed;
    }

    /* Функция для единиц на русском **/
    public static StringBuilder EdRus(int part){
        StringBuilder sbed = new StringBuilder();
        switch (part)
        {
            case (1) :
                sbed.append("один");
                break;
            case (2):
                sbed.append("два");
                break;
            case (3):
                sbed.append("три");
                break;
            case (4):
                sbed.append("четыре");
                break;
            case (5):
                sbed.append("пять");
                break;
            case (6):
                sbed.append("шесть");
                break;
            case (7):
                sbed.append("семь");
                break;
            case (8):
                sbed.append("восемь");
                break;
            case (9):
                sbed.append("девять");
                break;
            default:
                break;
        }

        return sbed;
    }

}
