/*
- Programm käsitleb mingit (inimlikku) tegevust (mängimist, kliendile vastamist,
kodumasina kasutamist).
- Programm peab kasutajalt midagi küsima, eeldades et kasutaja sisestab
vastuse nõutud kujul.
- Programm peaks olema kasutatav ilma, et programmi kohta oleks
erilisi eelteadmisi. Küsimused peavad vajaliku info andma.
Annab vajaliku üldtutvustava lühiinfo.
- Programm peab sisaldama juhusliku suuruse kasutamist (klassi Random abil).
- Programm peab koosnema mitmest klassist (sh. peaklass).
Andmete kasutamine peaks käima erinevate objektide abil.
Selleks loodud klassid peaksid sisaldama isendivälju, konstruktoreid,
get- ja set-meetodeid ja teisi vajalikke meetodeid.
- Programm peab olema mõistlikult kommenteeritud.
- Kasutajaga suhtlemine peaks olema väga elementaarselt kujundatud.
 */

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vali draakon :)");
        System.out.println("Tuledraakon - 1");
        System.out.println("Maadraakon - 2");
        System.out.println("Veedraakon - 3");

        int valik = sc.nextInt();
        if (valik == 1) {
            Tuledraakon tuledraakon = new Tuledraakon("Tuledraakon");
            System.out.println("Valitud: " + tuledraakon);
            while (true) {
                if (tuledraakon.läksMagama(tuledraakon.getHP())) {
                    break;
                }
            }
        }

        Täring täring = new Täring(1, 6);
        täring.viska();
    }
}
