import java.util.Calendar;
import java.util.GregorianCalendar;

public class Turnstile {
    int d, m, y;
    ConctrolSystem cont;

    public Turnstile() {
        this.cont = new ConctrolSystem();
    }

    public void check_pass_data(SkiPass skp) {
        Calendar calendar = new GregorianCalendar();
        int d = calendar.get(Calendar.DAY_OF_MONTH);
        int m = calendar.get(Calendar.MONTH);
        int y = calendar.get(Calendar.YEAR);
        if (skp.limit == 2) {
            return;
        } else if (skp.limit == 3) {
            if (this.Season(skp.m, skp.d).equals(this.Season(m, d))){
                System.out.println("Thanks, have a nice day!");
                return;
            }
        } else {
            if (skp.d + skp.days - d >= 0) {
                if (skp.m + skp.days - m >= 0) {
                    if (skp.y + skp.days - y >= 0) {
                        System.out.println("Thanks, have a nice day!");
                        return;
                    }
                }
            }
        }
        System.out.println("Sorry, your pass is out of date");
        cont.block(skp);
    }

    public  boolean isblocked(SkiPass skp){
        return skp.blocked;
    }
    public void check_pass_lifts(SkiPass skp) {
        if (skp.limit == 1 || skp.limit == 3){
            return;
        }
        else{
            if (skp.n_lim > 0){
                skp.n_lim -= 1;
                System.out.println("Thanks, have a nice day!");
                return;
            }
        }
        System.out.println("Sorry, your pass is out of date");
        cont.block(skp);
    }

    public String Season(int month, int day){
        String s = "Seasons";
        switch (month)
        {
            case 1:
            case 2:
                s = "Winter";
                return s;

            case 4:
            case 5:
                s = "Spring";
                return s;

            case 7:
            case 8:
                s = "Summer";
                return s;

            case 10:
            case 11:
                s = "Fall";
                return s;

            case 3:
            case 6:
            case 9:
            case 12:
                boolean firstHalf = day <= 15;
                int adjacentMonth = month + (firstHalf ? 1 : -1);
                Season(adjacentMonth, day);
        }
        return s;
    }
}
