package pl.znajdzserwer.ZnajdzSerwerPlugin.Utils;

public class GlobalUtil {

    public static void setLogs(String text) {
        System.out.println("[FindServerPlugin] " + text);
    }

    public static String getColor(String text) {
        String color = text.replace("&", "\u00A7");
        return color;
    }
}
