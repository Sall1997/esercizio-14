/*ESERCIZIO 14

Using LocaleDate or another Date class calculate and print:
How many days are left till the end of the month
How many days are left till the end of the year, using the length() method from java.time.Year.of()
 */

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

      int daysEndMonth = LocalDate.now().lengthOfMonth() - LocalDate.now().getDayOfMonth();
      int daysEndYear = LocalDate.now().lengthOfYear() - LocalDate.now().getDayOfYear();

        System.out.println("days to the end of the month missing: " + daysEndMonth);
        System.out.println("days to the end of the year missing: " + daysEndYear);
    }
}