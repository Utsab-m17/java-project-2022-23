package dateTimeCurrencyAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(LocalDate.now());
		LocalDate yesterday = LocalDate.now().minusDays(1);
		System.out.println(yesterday);
		LocalDate tomorrow = LocalDate.now().minusDays(1);
		System.out.println(tomorrow);

		Boolean isLeapYear = LocalDate.now().isLeapYear();
		System.out.println(isLeapYear);

		int date = 30;
		int month = 12;
		int year = 2020;

		Boolean checkLeapYear = LocalDate.of(year, month, date).isLeapYear();
		System.out.println(checkLeapYear);

		System.out.println(LocalDateTime.now());

		LocalDate currentDate = LocalDate.now();
		String strdate = currentDate.format(DateTimeFormatter.ISO_DATE);
		System.out.println("current date in string - " + strdate);
		System.out.println(currentDate.format(DateTimeFormatter.ofPattern("dd-MM-YYYY")));

		LocalDate date1 = LocalDate.now();
		System.out.println("Date1----" + date1);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
		String text = date1.format(formatter);
		System.out.println(text);
		LocalDate parseDate = LocalDate.parse(text, formatter);
		System.out.println(parseDate);
	}

}
