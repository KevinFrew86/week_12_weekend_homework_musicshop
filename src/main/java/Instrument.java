public abstract class Instrument {

    private String make;
    private String model;
    private String type;
    private String colour;
    private String material;
    private int wholesale;
    private int rrp;

    public Instrument(String make, String model, String type, String colour, String material, int wholesale, int rrp) {
        this.make = make;
        this.model = model;
        this.type = type;
        this.colour = colour;
        this.material = material;
        this.wholesale = wholesale;
        this.rrp = rrp;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public String getColour() {
        return colour;
    }

    public String getMaterial() {
        return material;
    }

    public int getWholesale() {
        return wholesale;
    }

    public int getRrp() {
        return rrp;
    }
}
