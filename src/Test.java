import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Andra on 19.05.2016.
 */
public class Test extends Application{
    static double ee;
    static String ss;
    static String mm;
    static ArrayList<String> Liited = new ArrayList<>(Arrays.asList("piko", "nano", "milli", "senti", "", "null", "kilo", "mega", "giga", "jotta",
            "zetta", "eksa", "peta", "tera", "hekto", "deka", "detsi", "mikro", "femtp", "ato", "zepto", "jokto"));

    public static double getSuurus() {return ee;}
    public static String getEesliide1() {return ss;}
    public static String getEesliide2() {return mm;}



    public static void main(String[] args) {launch(args);}


    public void start(Stage primaryStage) throws FileNotFoundException {
        VBox Aken = new VBox(15);
        Group juur = new Group();
        Aken.setStyle("-fx-background-color: #72AC93;");

        Aken.setPrefSize(800, 500);
        Text pealkiri = new Text("Teisendaja");
        Aken.getChildren().add(pealkiri);

        ArrayList<String> Küsimused = new ArrayList<>();
        File fail1 = new File("C:\\Users\\Andra\\Desktop\\OOP\\rühmatöö 2\\KysimusedEE.txt");
        Scanner kys = new Scanner(fail1, "UTF-8");
        while (kys.hasNextLine()) {Küsimused.add(kys.nextLine());}
        kys.close();

        TextFlow N1 = new TextFlow();
        Text KysNr1 = new Text(Küsimused.get(0));
        TextArea Nr1 = new TextArea();
        Nr1.setPrefSize(100, 20);
        N1.getChildren().add(KysNr1);

        TextFlow N2 = new TextFlow();
        Text KysNr2 = new Text(Küsimused.get(1));
        TextArea Nr2 = new TextArea();
        Nr2.setPrefSize(100, 20);
        N2.getChildren().add(KysNr2);

        TextFlow N3 = new TextFlow();
        Text KysNr3 = new Text(Küsimused.get(2));
        TextArea Nr3 = new TextArea();
        Nr3.setPrefSize(100, 20);
        N3.getChildren().add(KysNr3);

        pealkiri.setFont(Font.font("Egyptian", FontWeight.BOLD, 16));
        Button nupp = new Button("Valmis");

        TextFlow V = new TextFlow();

        ArrayList<String> Vastus = new ArrayList<>();
        File fail2 = new File("C:\\Users\\Andra\\Desktop\\OOP\\rühmatöö 2\\VastusedEE.txt");
        Scanner vas = null;
        try {vas = new Scanner(fail2);}
        catch (FileNotFoundException e) {System.out.println("Vastuste fail on probleemne");}
        assert vas != null;
        while (vas.hasNextLine()) {Vastus.add(vas.nextLine());}
        vas.close();

        if (!(ee == 0) && !(ss.equals("")) && !(mm.equals(""))) {
            Eesliited Xmas = new Eesliited(Vastus);
            System.out.println(Xmas);
        }

        Scene stseen = new Scene(juur, 800, 500);

        Aken.getChildren().add(N1);
        Aken.getChildren().add(Nr1);
        Aken.getChildren().add(N2);
        Aken.getChildren().add(Nr2);
        Aken.getChildren().add(N3);
        Aken.getChildren().add(Nr3);
        Aken.getChildren().add(nupp);
        Aken.getChildren().add(V);
        juur.getChildren().add(Aken);

        nupp.setOnMouseClicked(event -> {
            boolean x;
            boolean y;
            boolean z;
            Text probleem = new Text("Try again!");
            probleem.setStyle("-fx-fill: RED;-fx-font-weight:normal;");
            if (Nr1.getText().matches("[+-]?\\d*\\.?\\d+")) {
                ee = Double.parseDouble(Nr1.getText());
                N1.getChildren().clear();
                N1.getChildren().add(KysNr1);
                x = true;
            }else{
                N1.getChildren().clear();
                N1.getChildren().addAll(KysNr1, probleem);
                x = false;
            }
            if (Liited.contains(Nr2.getText().toLowerCase())) {
                ss = Nr2.getText().toLowerCase();
                N2.getChildren().clear();
                N2.getChildren().add(KysNr2);
                y = true;
            }else{
                N2.getChildren().clear();
                N2.getChildren().addAll(KysNr2, probleem);
                y = false;
            }
            if (Liited.contains(Nr3.getText().toLowerCase())){
                mm = Nr3.getText().toLowerCase();
                N3.getChildren().clear();
                N3.getChildren().add(KysNr3);
                z = true;
            }else{
                N3.getChildren().clear();
                N3.getChildren().addAll(KysNr3, probleem);
                z = false;
            }
            if (x&&y&&z){
                V.getChildren().clear();
                V.getChildren().add(new Text(new Eesliited(Vastus).toString()));
                V.setStyle("font-family:'Verdana'");
            }
        });
        primaryStage.setTitle("Teisendamine");
        primaryStage.setScene(stseen);
        primaryStage.show();
    }
}
