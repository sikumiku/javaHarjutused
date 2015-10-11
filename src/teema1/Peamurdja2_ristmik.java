package teema1;

import javafx.application.Application;
import javafx.stage.Stage;
import lib.Foor;

/**
 * Täpselt nagu oli fooriga, on nüüd ristmikuga. Kuidas esiteks
 * ristmik üles ehitada loe Foori README.md-st: https://github.com/KristerV/javaHarjutused
 */
public class Peamurdja2_ristmik extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Foor foor1 = new Foor(Foor.FooriSuund.YLEMINE, primaryStage);
        Foor foor2 = new Foor(Foor.FooriSuund.ALUMINE, primaryStage);
        Foor foor3 = new Foor(Foor.FooriSuund.VASAK, primaryStage);
        Foor foor4 = new Foor(Foor.FooriSuund.PAREM, primaryStage);

        alusta(foor1);
        alusta(foor2);
        alusta(foor3);
        alusta(foor4);
    }

    public void alusta(Foor foor) {
        int count = 0;
        while (count != 10) {

            if (foor.Suund == Foor.ALUMINE || foor.Suund == Foor.YLEMINE) {

                foor.vahetaPunast();
                foor.paus(2);
                foor.kustutaPunane();
                foor.vahetaKollast();
                foor.paus(0.5);
                foor.kustutaKollane();

            }

            foor.vahetaRohelist();
            foor.paus(0.5);
            foor.vahetaRohelist();
            foor.paus(0.5);
            foor.vahetaRohelist();
            foor.paus(0.5);
            foor.vahetaRohelist();
            foor.paus(0.5);
            foor.vahetaRohelist();
            foor.paus(1);
            foor.kustutaRoheline();
            foor.vahetaKollast();
            foor.vahetaKollast();
            foor.paus(0.5);
            foor.kustutaKollane();
            foor.vahetaPunast();
            foor.paus(2);
            foor.kustutaPunane();
            foor.vahetaKollast();
            foor.paus(0.5);
            foor.kustutaKollane();
            count++;

        }


    }

}
