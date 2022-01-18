package fundamentals.enums;

public class Main {

    public static void main(String[] args) {
        whichSeason(Month.FEBRUARY);
        whichSeason(Month.MAY);
        whichSeason(Month.JUNE);
        whichSeason(Month.SEPTEMBER);
    }

    public static void whichSeason(Month month) {
        switch (month) {
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                System.out.printf("%s is in the winter season.\n", month);
                break;
            case MARCH:
            case APRIL:
            case MAY:
                System.out.printf("%s is in the spring season.\n", month);
                break;
            case JUNE:
            case JULY:
            case AUGUST:
                System.out.printf("%s is in the summer season.\n", month);
                break;
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                System.out.printf("%s is in the autumn season.\n", month);
                break;
            default:
                System.out.println("Hello");
                break;
        }
    }
}
