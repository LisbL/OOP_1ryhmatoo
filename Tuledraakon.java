public class Tuledraakon extends Draakon{
    private int energia;

    public Tuledraakon(String nimi,int dmg, int HP) {
        super(nimi, dmg,  HP);
        this.energia = 75;
    }

    public int getEnergia() {
        return energia;
    }


    public void tulepall() {
        if (energia > 20) {
            setDmg(getDmg()*2);
            System.out.println(getNimi() + " pritsib tuld!");
            energia -= 20;
        } else {
            System.out.println("Pole piisavalt energiat :(");
        }
    }


    public String toString() {
        return getNimi();
    }
}
