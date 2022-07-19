import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FormatDate {

    public static String formatToFullText(LocalDateTime dateTime) {
        if (dateTime != null) {
            if (dateTime.toString() != "") {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern(
                        "'Le' d LLL 'de l''an' YYYY 'à' kk'h'mm'm' 'et' ss's'", Locale.FRANCE);
                String text = dateTime.format(formatter);
                return text;
            } else {
                return null;
            }
        } else {
            return null;
        }
        // Le 22 août de l'an 2021 à 13h25m et 46s
    }

    public static String formatSimple(LocalDate date) {
        if (date != null) {
            if (date.toString() != "") {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern(
                        "LLLL dd YY", Locale.ITALIAN);
                String text = date.format(formatter);
                return text;
            } else {
                return null;
            }
        } else {
            return null;
        }
        // febbraio 13 22
    }

    public static String formatIso(LocalTime time) {
        if (time != null) {
            if (time.toString() != "") {
                if (time.getNano() == 0) {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(
                            "kk':'m':'s", Locale.FRANCE);
                    String text = time.format(formatter);
                    return text;
                } else {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(
                            "kk':'m':'s'.'n", Locale.FRANCE);
                    String text = time.format(formatter);
                    return text;
                }
            } else {
                return null;
            }
        } else {
            return null;
        }
        // 16:18:56.008495847
    }
}