package ZadanieD01;

public class CalandarConverter {

    public static final int MONDAY = 1;
    public static final int TUESDAY = 2;
    public static final int WEDNSDAY = 3;
    public static final int THURSDAY = 4;
    public static final int FRIDAY = 5;
    public static final int SATURDAY = 6;
    public static final int SUNDAY = 7;

    public static String DaytoString(int dayNumber) {
        String dayOfTheWeek = null;
        switch (dayNumber) {

            case MONDAY:
                dayOfTheWeek = "Poniedzialek";
                break;
            case TUESDAY:
                dayOfTheWeek = "Wtorek";
                break;
            case WEDNSDAY:
                dayOfTheWeek = "Sroda";
                break;
            case THURSDAY:
                dayOfTheWeek = "Czwartek";
                break;
            case FRIDAY:
                dayOfTheWeek = "Piatek";
                break;
            case SATURDAY:
                dayOfTheWeek = "Sobota";
                break;
            case SUNDAY:
                dayOfTheWeek = "Niedziela";
                break;
            default:
                System.out.println("Podales nieprawidlowy dzien tygodnia");
        }
        return dayOfTheWeek;
    }
}
