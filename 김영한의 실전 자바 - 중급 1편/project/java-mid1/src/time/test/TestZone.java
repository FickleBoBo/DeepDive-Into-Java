package time.test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TestZone {

    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2024, 1, 1);
        LocalTime lt = LocalTime.of(9, 0, 0);

        ZonedDateTime seoul = ZonedDateTime.of(ld, lt, ZoneId.of("Asia/Seoul"));
        System.out.println("서울의 회의 시간: " + seoul);

        ZonedDateTime london = ZonedDateTime.of(ld, lt, ZoneId.of("Europe/London"));
        System.out.println("런던의 회의 시간: " + london);

        ZonedDateTime newYork = ZonedDateTime.of(ld, lt, ZoneId.of("America/New_York"));
        System.out.println("뉴욕의 회의 시간: " + newYork);
    }
}
