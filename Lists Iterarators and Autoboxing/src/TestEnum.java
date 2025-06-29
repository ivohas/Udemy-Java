public class TestEnum {
    public static void main(String[] args) {
        DaysOfTheWeek today = DaysOfTheWeek.SUNDAY;

        switch (today) {
            case SATURDAY, SUNDAY -> System.out.println("Weekend!");
            default -> System.out.println("Weekday.");
        }
    }
}
