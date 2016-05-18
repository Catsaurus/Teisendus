import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * Created by Andra on 19.05.2016.
 */
public class Eesliited {
    private String nimi;
    private String nimi2;
    private double suurus;
    private double suurus2;
    private ArrayList Vastus;

    public Eesliited(ArrayList d) {
        this.Vastus = d;
        this.nimi = Test.getEesliide1();
        this.nimi2 = Test.getEesliide2();
        this.suurus = Test.getSuurus();
        this.suurus2 = Teisendus.Teisenda(nimi, nimi2, suurus);
    }

    public String toString(){
        DecimalFormat df = new DecimalFormat("#.#################################");
        return (suurus + " " + nimi + Vastus.get(0) + df.format(suurus2) + " " + nimi2 + Vastus.get(1));
    }

}
