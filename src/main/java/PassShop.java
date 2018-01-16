import java.util.Scanner;

public class PassShop {
    int type, limit, days, n_lim ;
    SkiPass pass;

    public PassShop() {
    }

    public SkiPass buy_pass() {
        System.out.println("Hello, what pass would you like to buy: for weekdays(1); for weekends(2)?");
        Scanner in = new Scanner(System.in);
        type = in.nextInt();
        System.out.println("Would you like an unlimited pass(1), or with a limit on lifts(2), or a season pass(3)?");
        limit = in.nextInt();
        if (limit == 1) {
            System.out.println("For how many days do you want a pass: 1, 2, 5");
            days = in.nextInt();
            if (type == 2 && days == 3) {
                System.out.println("Sorry, It`s impossible. Choose another");
                days = in.nextInt();
            }
        }
        if (limit == 2) {
            System.out.println("What limit would you like: 10, 20, 50, 100");
            n_lim = in.nextInt();
        }
        if (limit == 3 && type == 1) {
            System.out.println("Sorry, It`s impossible. Choose another");
            limit = in.nextInt();
        }
        System.out.println("Here is your pass!");

        if (type == 1) {
            pass = new WeekdayPass(limit, days, n_lim);
            return pass;
        }
        return new WeekendPass(limit, days, n_lim);
    }
}