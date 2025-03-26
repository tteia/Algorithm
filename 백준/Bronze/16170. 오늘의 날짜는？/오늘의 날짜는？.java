import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Date now = new Date();

        SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
        SimpleDateFormat monthFormat = new SimpleDateFormat("MM");
        SimpleDateFormat dayFormat = new SimpleDateFormat("dd");

        System.out.println(yearFormat.format(now));
        System.out.println(monthFormat.format(now));
        System.out.println(dayFormat.format(now));
    }
}
