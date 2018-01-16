import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.UUID;

class SkiPass{
    String id;
    int limit, days, d, m, y, n_lim;
    boolean blocked;
    protected SkiPass(int limit, int days, int n_lim){
        this.n_lim = n_lim;
        this.limit = limit;
        this.days = days;
        this.id = UUID.randomUUID().toString();
        this.blocked = false;
        Calendar calendar = new GregorianCalendar();
        this.d = calendar.get(Calendar.DAY_OF_MONTH);
        this.m = calendar.get(Calendar.MONTH);
        this.y = calendar.get(Calendar.YEAR);
    }

}
