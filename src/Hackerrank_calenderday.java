import java.util.Calendar;

public class Hackerrank_calenderday {

  /*
  input a date return the day
   */

        public static String findDay(int month, int day, int year) {
            // Create a Calendar instance and set the specified date
            Calendar calendar = Calendar.getInstance();
            calendar.set(year, month - 1, day); // Note: Month is 0-based in Calendar

            // Get the day of the week as an integer (Sunday is 1, Monday is 2, ..., Saturday is 7)
            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

            // Convert the integer day of the week to its corresponding name
            String[] days = {"", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
            String dayName = days[dayOfWeek];

            return dayName;
        }

        public static void main(String[] args) {
            // Sample Input: 08 05 2015
            int month = 8;
            int day = 5;
            int year = 2015;

            // Call the findDay function and print the result
            String result = findDay(month, day, year);
            System.out.println(result);
        }
    }




