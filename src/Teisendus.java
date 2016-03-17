import java.text.DecimalFormat;

/**
 * Created by Andra on 16.03.2016.
 */
public class Teisendus {

    public static double vabanemineEesliitest() {
        return ss.getSuurus() * ss.getVäärtus();
    }

    /*public static double eesliiteJuurdeVõtmine() {                                                                     //Äkki läheb vaja
        return ss.getSuurus() / ss.getVäärtus();
    }*/


    public static void katse2() {
        DecimalFormat df = new DecimalFormat("#.####################################################");
        switch (ss.eesliide2) {
            case "GIGA":
                System.out.println(ss.getSuurus()+" "  +ss.getEesliide1()+ "meetrit on " + df.format(vabanemineEesliitest() / 1000000000.0) + " gigameetrit");
                break;
            case "MEGA":
                System.out.println(ss.getSuurus()+" "  +ss.getEesliide1()+ "meetrit on " + df.format(vabanemineEesliitest() / 1000000.0) + " megameetrit");
                break;
            case "KILO":
                System.out.println(ss.getSuurus()+" "  +ss.getEesliide1()+"meetrit on " + df.format(vabanemineEesliitest() / 1000.0) + " kilomeetrit");
                break;
            case "SENTI":
                System.out.println(ss.getSuurus()+" " +ss.getEesliide1()+ "meetrit on " + df.format(vabanemineEesliitest() / 0.01) + " sentimeetrit");
                break;
            case "MILLI":
                System.out.println(ss.getSuurus()+" " +ss.getEesliide1()+ "meetrit on " + df.format(vabanemineEesliitest() / 0.001) + " millimeetrit");
                break;
            case "NANO":
                System.out.println(ss.getSuurus()+" " +ss.getEesliide1()+ "meetrit on " + df.format(vabanemineEesliitest() / 0.000000001) + " nanomeetrit");
                break;
            case "PIKO":
                System.out.println(ss.getSuurus()+" " +ss.getEesliide1()+ "meetrit on " + df.format(vabanemineEesliitest() / 0.000000000001) + " pikomeetrit");
                break;
            default:
                System.out.println("Midagi läks valesti, kui asi nii kaugele jõudis");
                break;
        }
    }
}

