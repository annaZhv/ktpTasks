import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/*8. Функция, которая возвращает безопасный хеш SHA-256 для данной строки*/
public class HashAlg {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        System.out.println(getSha256Hash("Hey dude!"));
    }

    private static String getSha256Hash(String string) throws NoSuchAlgorithmException{
        StringBuilder sb = new StringBuilder();
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] byteHash = md.digest(string.getBytes(StandardCharsets.UTF_8));

        for (byte byt : byteHash){
            sb.append(String.format("%02x", byt));
        }
        return sb.toString();
    }
}
