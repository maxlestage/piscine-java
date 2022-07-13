
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ParseDate {

    public static LocalDateTime parseIsoFormat(String stringDate) {
        if (stringDate != null) {
            if (stringDate != "") {
                LocalDateTime dateTime = LocalDateTime.parse(stringDate);

                return dateTime;
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    public static LocalDate parseFullTextFormat(String stringDate) {
        if (stringDate != null) {
            if (stringDate != "") {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy");
                String text = stringDate.formatted(formatter);
                LocalDate parsedDate = LocalDate.parse(text, formatter);

                return parsedDate;
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    public static LocalTime parseTimeFormat(String stringDate) {
        if (stringDate != null) {
            if (stringDate != "") {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern(
                        "hh 'heures' B, mm 'minutes et' ss 'secondes'", Locale.FRANCE);
                String text = stringDate.formatted(formatter);
                LocalTime parsedDate = LocalTime.parse(text, formatter);

                return parsedDate;
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

}