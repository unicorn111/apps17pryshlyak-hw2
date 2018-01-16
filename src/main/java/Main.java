public class Main {
    public static void main(String[] args){
        PassShop ps = new PassShop();
        SkiPass sk = ps.buy_pass();
        Turnstile turn = new Turnstile();
        turn.check_pass_data(sk);
        turn.check_pass_lifts(sk);
        turn.isblocked(sk);
        turn.check_pass_lifts(sk);
        turn.check_pass_lifts(sk);
        turn.check_pass_lifts(sk);
        turn.check_pass_lifts(sk);
        turn.check_pass_lifts(sk);
        turn.check_pass_lifts(sk);
        turn.check_pass_lifts(sk);
        turn.check_pass_lifts(sk);
        turn.check_pass_lifts(sk);
        turn.check_pass_lifts(sk);
        turn.check_pass_lifts(sk);

    }
}
