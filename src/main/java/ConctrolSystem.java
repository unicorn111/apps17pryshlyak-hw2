import java.util.ArrayList;

public class ConctrolSystem {
    ArrayList<SkiPass> passlist;
    public ConctrolSystem(){
        this. passlist = new ArrayList();
    }
    public SkiPass give_pass(int num, int limit, int days, int n_lim ){
        if (num == 1){
            return new WeekdayPass(limit, days, n_lim );
        }
        return new WeekendPass(limit, days, n_lim );
    }
    public void block(SkiPass sk){
        for(SkiPass skp: passlist){
            if(skp == sk){
            skp.blocked = true; }
        }
    }
}
