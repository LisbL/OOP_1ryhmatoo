public class Draakon implements Ded {
    private String nimi;
    private int dmg;
    private int HP;

    public Draakon(String nimi, int dmg, int HP) {
        this.nimi = nimi;
        this.HP = HP;
        this.dmg = dmg;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public int getDmg() {
        return dmg;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }

    public int getHP() {
        return HP;
    }
    public void setHP(int HP) {
        this.HP = HP;
    }

    public void möirga() {
        System.out.println(nimi + " möirgab!");
    }

    @Override
    public void ründa(Draakon vastane) {
        System.out.println(getNimi() + " ründab vastast " + vastane.getNimi());
        vastane.setHP(vastane.getHP() - getDmg());
        try {
            Thread.sleep(2000); // paus enne järgmist tegevust
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean läksMagama() {
        if (this.getHP() <= 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return nimi;
    }
}
