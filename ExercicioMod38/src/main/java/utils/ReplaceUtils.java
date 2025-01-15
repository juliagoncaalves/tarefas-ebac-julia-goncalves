package utils;

public class ReplaceUtils {

    private ReplaceUtils() {
    }

    public static String replace(String value, String... patterns) {
        String retorno = value;
        for (String pattern : patterns) {
            retorno = retorno.replace(pattern, "");
        }
        return retorno;
    }

}
