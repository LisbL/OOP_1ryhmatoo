public class Tuledraakon extends Draakon{
    private int energia;
    private int HP;

    public Tuledraakon(String nimi) {
        super(nimi);
        this.energia = 75;
        this.HP = 100;
    }



    public String toString() {
        return getNimi();
    }
}
