public class WeekdayPass extends SkiPass implements SkiPassInterface{
    String type;
    int limit, days;
    protected WeekdayPass(int limit, int days, int n_lim ){
        super(limit,days, n_lim );
        this.id = id;
        this.type = "weekday";
    }

    public boolean isAvilable() {
        return this.blocked;
    }
}
