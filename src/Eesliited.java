import java.text.DecimalFormat;

/**
 * Created by Andra on 16.03.2016.
 */
public class Eesliited {
    public static String nimi = ss.eesliide1;
    public static String nimi2 = ss.eesliide2;
    public static double väärtus;


    public Eesliited(String nimi) {
        Eesliited.nimi = nimi;
    }

    public void prindi(){                                                                                                   //SWITCH, vajab info lisamist, peaks töötama
        DecimalFormat df = new DecimalFormat("#.####################################################");
        switch (nimi) {
            case "GIGA":
                väärtus = ss.setVäärtus(1000000000.0);
                if (ss.eesliide2.equals("NULL")) {
                    System.out.println(ss.getSuurus() + " gigameetrit on: " + ss.getSuurus() * väärtus + " meetrit");
                } else if (!ss.eesliide2.equals("NULL") && !ss.eesliide1.equals("NULL")) {
                    Teisendus.katse2();
                } else {
                    System.out.println("Error giga");
                }
                break;
            case "MEGA":
                väärtus = ss.setVäärtus(1000000.0);
                if (ss.eesliide2.equals("NULL")) {
                    System.out.println(ss.getSuurus() + " megameetrit on: " + ss.getSuurus() * väärtus + " meetrit");
                } else if (!ss.eesliide2.equals("NULL") && !ss.eesliide1.equals("NULL")) {
                    Teisendus.katse2();
                } else {
                    System.out.println("Error mega");
                }
                break;

            case "KILO":
                väärtus = ss.setVäärtus(1000.0);
                if (ss.eesliide2.equals("NULL")) {
                    System.out.println(ss.getSuurus() + " kilomeetrit on: " + ss.getSuurus() * väärtus + " meetrit");
                } else if (!ss.eesliide2.equals("NULL") && !ss.eesliide1.equals("NULL")) {
                    Teisendus.katse2();
                } else {
                    System.out.println("error kilo");
                }
                break;

            case "SENTI":
                väärtus = ss.setVäärtus(0.01);
                if (ss.eesliide2.equals("NULL")) {
                    System.out.println(ss.getSuurus() + " sentimeetrit on: " + ss.getSuurus() * väärtus + " meetrit");
                } else if (!ss.eesliide2.equals("NULL") && !ss.eesliide1.equals("NULL")) {
                    Teisendus.katse2();
                } else {
                    System.out.println("error centi");
                }
                break;

            case "MILLI":
                väärtus = ss.setVäärtus(0.001);
                if (ss.eesliide2.equals("NULL")) {
                    System.out.println(ss.getSuurus() + " millimeetrit on: " + ss.getSuurus() * väärtus + " meetrit");
                } else if (!ss.eesliide2.equals("NULL") && !ss.eesliide1.equals("NULL")) {
                    Teisendus.katse2();
                } else {
                    System.out.println("error milli");
                }
                break;
            case "NANO":
                väärtus = ss.setVäärtus(0.000000001);
                if (ss.eesliide2.equals("NULL")) {
                    System.out.println(ss.getSuurus() + " nanomeetrit on: " + ss.getSuurus() * väärtus + " meetrit");
                } else if (!ss.eesliide2.equals("NULL") && !ss.eesliide1.equals("NULL")) {
                    Teisendus.katse2();
                } else {
                    System.out.println("error nano");
                }
                break;

            case "PIKO":
                väärtus = ss.setVäärtus(0.000000000001);
                if (ss.eesliide2.equals("NULL")) {
                    System.out.println(ss.getSuurus() + " pikomeetrit on: " + ss.getSuurus() * väärtus + " meetrit");
                } else if (!ss.eesliide2.equals("NULL") && !ss.eesliide1.equals("NULL")) {
                    Teisendus.katse2();
                } else {
                    System.out.println("error piko");
                }
                break;

            case "NULL":
                switch (nimi2) {
                    case "GIGA":
                        System.out.println(ss.getSuurus() + " meetrit on " + df.format(ss.getSuurus() / 1000000000.0) + " gigameetrit");
                        break;
                    case "MEGA":
                        System.out.println(ss.getSuurus() + " meetrit on " + df.format(ss.getSuurus() / 1000000.0) + " megameetrit");
                        break;
                    case "KILO":
                        System.out.println(ss.getSuurus() + " meetrit on " + df.format(ss.getSuurus() / 1000.0) + " kilomeetrit");
                        break;
                    case "SENTI":
                        System.out.println(ss.getSuurus() + " meetrit on " + df.format(ss.getSuurus() / 0.01) + " sentimeetrit");
                        break;
                    case "MILLI":
                        System.out.println(ss.getSuurus() + " meetrit on " + df.format(ss.getSuurus() / 0.001) + " millimeetrit");
                        break;
                    case "NANO":
                        System.out.println(ss.getSuurus() + " meetrit on " + df.format(ss.getSuurus() / 0.000000001) + " nanomeetrit");
                        break;
                    case "PIKO":
                        System.out.println(ss.getSuurus() + " meetrit on " + df.format(ss.getSuurus() / 0.000000000001) + " pikomeetrit");
                        break;
                    default:
                        System.out.println("Midagi läks valesti, kui asi nii kaugele jõudis");
                }
                break;
            default:
                System.out.println("Sellist varianti meil ei ole, sorri");
                break;
        }
    }
}




