import java.util.Locale;
import java.text.NumberFormat;

public class NumberFormatDemo {

    public static void main(String[] args) {
        

        double money = 1431912.21;

        NumberFormat nf = NumberFormat.getInstance(Locale.US);
        System.out.println("Us format : " + nf.format(money));
        nf = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("Us format : " + nf.format(money));
        System.out.println("France :"+ NumberFormat.getCurrencyInstance(Locale.FRANCE).format(money));

        System.out.println("For India");
        // Locale inLocale = new Locale("en", "IN"); deprecated from 19.....
        Locale inLocale = new Locale.Builder().setLanguage("en").setRegion("IN").setVariant("variant").build();

        System.out.println("Indian Currency : " + NumberFormat.getCurrencyInstance(inLocale).format(money));


    }
}
