public class Brass extends Instrument {

    private int numOfValves;

    public Brass(String make, String model, String type, String colour, String material, int wholesale, int rrp, int numOfValves) {
        super(make, model, type, colour, material, wholesale, rrp);
        this.numOfValves = numOfValves;
    }

    public int getNumOfValves() {
        return numOfValves;
    }
}
