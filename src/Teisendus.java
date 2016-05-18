/**
 * Created by Andra on 19.05.2016.
 */
public class Teisendus {
    public static double Teisenda(String nimi, String nimi2, double ühik) {
        double suurus = ühik;
        switch (nimi){
            case "jotta": suurus = suurus * 1000000000000000000000000.0;break;
            case "zetta": suurus = suurus * 1000000000000000000000.0;break;
            case "eksa": suurus = suurus * 1000000000000000000.0;break;
            case "peta": suurus = suurus * 1000000000000000.0;break;
            case "tera": suurus = suurus * 1000000000000.0;break;
            case "giga": suurus = suurus * 1000000000.0; break;
            case "mega": suurus = suurus * 1000000.0; break;
            case "kilo": suurus = suurus * 1000.0; break;
            case "hekto": suurus = suurus * 100.0;break;
            case "deka": suurus = suurus * 10.0;break;
            case "detsi": suurus = suurus * 0.1;break;
            case "senti": suurus = suurus * 0.01; break;
            case "milli": suurus = suurus * 0.001; break;
            case "mikro": suurus = suurus * 0.000001;break;
            case "nano": suurus = suurus * 0.000000001; break;
            case "piko": suurus = suurus * 0.000000000001; break;
            case "femto": suurus = suurus * 0.000000000000001;break;
            case "ato": suurus = suurus * 0.000000000000000001;break;
            case "zepto": suurus = suurus * 0.000000000000000000001;break;
            case "jokto": suurus = suurus * 0.000000000000000000000001;break;
            default: break;}
        switch (nimi2) {
            case "jotta": suurus = suurus / 1000000000000000000000000.0;break;
            case "zetta": suurus = suurus / 1000000000000000000000.0;break;
            case "eksa": suurus = suurus / 1000000000000000000.0;break;
            case "peta": suurus = suurus / 1000000000000000.0;break;
            case "tera": suurus = suurus / 1000000000000.0;break;
            case "giga": suurus = suurus / 1000000000.0; break;
            case "mega": suurus = suurus / 1000000.0; break;
            case "kilo": suurus = suurus / 1000.0; break;
            case "hekto": suurus = suurus / 100.0;break;
            case "deka": suurus = suurus / 10.0;break;
            case "detsi": suurus = suurus / 0.1;break;
            case "senti": suurus = suurus / 0.01; break;
            case "milli": suurus = suurus / 0.001; break;
            case "mikro": suurus = suurus / 0.000001;break;
            case "nano": suurus = suurus / 0.000000001; break;
            case "piko": suurus = suurus / 0.000000000001; break;
            case "femto": suurus = suurus / 0.000000000000001;break;
            case "ato": suurus = suurus / 0.000000000000000001;break;
            case "zepto": suurus = suurus / 0.000000000000000000001;break;
            case "jokto": suurus = suurus / 0.000000000000000000000001;break;
            default: break;}
        return suurus;
    }
}
