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
        System.out.println("Veedraakon - 2");
        System.out.println("Maadraakon - 3");

        Draakon[] draakonid = {
                new Draakon("Tuledraakon", 10, 100),
                new Draakon("Veedraakon", 15, 85 ),
                new Draakon("Maadraakon", 7, 120)
        };
        int valik = sc.nextInt() - 1;
        Draakon mängija = draakonid[valik];
        Draakon vastane = new Draakon("MONKE 2000",5, 105);
        while (true) {
            if (mängija.läksMagama()) {
                System.out.println(vastane + " kukkus kokku!");
                System.out.println(mängija + " võitis!");
                break;
            } else if (vastane.läksMagama()) {
                System.out.println(mängija + " kukkus kokku!");
                System.out.println(vastane + " võitis!");
                break;
            }
            mängija.ründa(vastane);
            vastane.ründa(mängija);
        }

        Täring täring = new Täring(1, 6);
        täring.viska();
    }
}
