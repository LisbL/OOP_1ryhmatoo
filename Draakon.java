public class Draakon {
    private String nimi;

    public Draakon(String nimi) {
        this.nimi = nimi;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public void ründa() {
        System.out.println(nimi + " möirgab!");
    }

    public String toString() {
        return "Draakon";
    }
}
