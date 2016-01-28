package teema1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * NB! Lahenda käesolev ülesanne konsoolis. Pole vaja JavaFXi siia segada.
 *
 * 1. Kirjuta lihtne laevade pommitamise mäng, kus arvuti genereerib 1x1
 *    laevad mööda 1 dimensioonilist lauda. See tähendab, et mängulaud
 *    ei ole mitte ruudustik, vaid üks rida.
 *
 * 2. Täienda mängu nii, et nüüd oleks laual ruudustik.
 *
 * 3. Kas oskad ka nii, et laevad ei ole 1x1 vaid 1x2 ja 1x3 ja orienteeruvad
 *    nii vertikaalselt kui ka horisontaalselt?
 */
public class Peamurdja3_laevad {
    public static void main(String[] args) {
        int[][] laud = new int[9][9];

        for (int i=0; i<9; i++) {
            for (int j=0; j < 9; j++){
                laud[i][j] = randlaev();
            }
        };
//update text bla bla
        for (int i=0; i < 9, i++); {

        }
        System.out.println(Arrays.toString(laud));

        while (gameover(laud)) {

            System.out.println(Arrays.toString(laud));
            Scanner kasutaja = new Scanner(System.in);
            System.out.println("Sisesta üks number");
            int sisestus = kasutaja.nextInt();
            int hit = laud[sisestus][sisestus];
            if (hit == 1) {
                laud[sisestus][sisestus] = 2;
                System.out.println("Põhjas");
                System.out.println(Arrays.toString(laud));
            } else if (hit == 0) {
                System.out.println("mööda");

            } else if (hit == 2) {
                System.out.println("panid juba puusse");

            }
        }
        System.out.println("JEE");
    }
        public static boolean gameover(int[][] laud) {
        for (int i = 0; i < laud.length; i++) {
            if (laud[i][i] == 1) {
                return true;
            }


            }
        return false;
        }

    public static int randlaev() {
        return (int) (Math.random() * 2);

    }

    }

