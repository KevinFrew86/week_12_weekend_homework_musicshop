public abstract class Accessory extends Item implements ISell {

    private String make;
    private String type;
    private int wholesale;
    private int rrp;

    public Accessory(String make, String type, int wholesale, int rrp) {
        this.make = make;
        this.type = type;
        this.wholesale = wholesale;
        this.rrp = rrp;
    }


    public String getMake() {
        return make;
    }

    public String getType() {
        return type;
    }

    public int getWholesale() {
        return wholesale;
    }

    public int getRrp() {
        return rrp;
    }

    public int calculateMarkUp(int wholesale, int rrp) {
        return this.rrp - this.wholesale;
    }
}
