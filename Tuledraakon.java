public class Tuledraakon extends Draakon implements  Ded{
    private int dmg;
    private int energia;
    private int HP;

    public Tuledraakon(String nimi) {
        super(nimi);
        this.dmg = 10;
        this.energia = 75;
        this.HP = 100;
    }

    public int getDmg() {
        return dmg;
    }

    public int getEnergia() {
        return energia;
    }

    public int getHP() {
        return HP;
    }

    public void tulepall() {
        if (energia > 20) {
            dmg = dmg*2;
        } else {
            System.out.println("Pole piisavalt energiat :(");
        }
    }

    @Override
    public boolean läksMagama(int HP) {
        if (HP <= 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return getNimi();
    }
}
