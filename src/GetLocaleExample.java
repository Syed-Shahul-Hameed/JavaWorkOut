import java.util.Locale;

public class GetLocaleExample {
    public static void main(String[] args) {
        Locale defaultLocale = Locale.getDefault();

        System.out.println("Default language code: " + defaultLocale.getLanguage());
        System.out.println("Default country code: " + defaultLocale.getCountry());
        System.out.println("Display name for country: " + defaultLocale.getDisplayCountry());
    }
}
