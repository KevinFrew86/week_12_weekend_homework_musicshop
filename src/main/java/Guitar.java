public class Guitar extends Instrument {

    private int numOfStrings;

    public Guitar(String make, String model, String type, String colour, String material, String noise, int wholesale, int rrp, int numOfStrings) {
        super(make, model, type, colour, material, noise, wholesale, rrp);
        this.numOfStrings = numOfStrings;
    }


    public int getNumOfStrings() {
        return numOfStrings;
    }


}
