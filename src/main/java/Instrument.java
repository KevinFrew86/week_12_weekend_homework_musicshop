public abstract class Instrument extends Item implements IPlay, ISell {

    private String make;
    private String model;
    private String type;
    private String colour;
    private String material;
    private String noise;
    private int wholesale;
    private int rrp;

    public Instrument(String make, String model, String type, String colour, String material, String noise, int wholesale, int rrp) {
        this.make = make;
        this.model = model;
        this.type = type;
        this.colour = colour;
        this.material = material;
        this.noise = noise;
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

    public String getNoise() {
        return noise;
    }

    public int getWholesale() {
        return wholesale;
    }

    public int getRrp() {
        return rrp;
    }

    public String play(String noise) {
        return "Wow, this baby really goes .... " + noise;
    }

    public int calculateMarkUp(int wholesale, int rrp) {
        return this.rrp - this.wholesale;
    }
}
