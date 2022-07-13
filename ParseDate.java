
import java.time.LocalDate;
import java.time.LocalDateTime;
// import java.time.LocalTime;
// import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatter;

public class ParseDate {

    public static LocalDateTime parseIsoFormat(String stringDate) {
        LocalDateTime dateTime = LocalDateTime.parse(stringDate);
        return dateTime;
    }

    public static LocalDate parseFullTextFormat(String stringDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy");
        String text = stringDate.formatted(formatter);
        LocalDate parsedDate = LocalDate.parse(text, formatter);
        return parsedDate;

    }

    // public static LocalTime parseTimeFormat(String stringDate) {
    // // your code here
    // }

}