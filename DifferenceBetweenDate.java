import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DifferenceBetweenDate {

    public static Duration durationBetweenTime(LocalTime localTime1, LocalTime localTime2) {
        // your code here
        if (localTime1 != null && localTime2 != null) {
            if (localTime1.toString() != "" && localTime2.toString() != "") {
                if (localTime1.getHour() != 0 || localTime1.getMinute() != 0
                        || localTime1.getSecond() != 0 && localTime2
                                .getHour() != 0
                        || localTime2.getMinute() != 0 || localTime2.getSecond() != 0) {
                    Duration duration = Duration.between(localTime1, localTime2);
                    return duration;
                } else {
                    return null;
                }
            } else {
                return null;
            }
        } else {
            return null;
        }
        // 8H29M21S
    }

    public static Period periodBetweenDate(LocalDate date1, LocalDate date2) {

        if (date1 != null && date2 != null) {
            if (date1.toString() != "" && date2.toString() != "") {
                Period period = Period.between(date1, date2);
                return period;
            } else {
                return null;
            }
        } else {
            return null;
        }
        // 1Y6M25D
    }

    public static Long numberOfHoursBetweenDateTime(LocalDateTime dateTime1,
            LocalDateTime dateTime2) {
        if (dateTime1 != null && dateTime2 != null) {
            if (dateTime1.toString() != "" && dateTime2.toString() != "") {
                Long unit = ChronoUnit.HOURS.between(dateTime1, dateTime2);
                if (unit <= 0) {
                    return ChronoUnit.HOURS.between(dateTime2, dateTime1);
                } else {
                    return ChronoUnit.HOURS.between(dateTime1, dateTime2);
                }
            } else {
                return null;
            }
        } else {
            return null;
        }
        // 677
    }

}