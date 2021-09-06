public class Car {
    private String make,model,colour;
    private boolean manualGear;
    public Car(String make,String model,String colour,boolean manualGear)
    {
        this.make = make;
        this.model = model;
        this.manualGear = manualGear;
        setColour(colour);
    }
    public void setColour(String colour)
    {
        this.colour = colour;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public boolean isManualGear() {
        return manualGear;
    }
    @Override
    public String toString()
    {
        return make+" "+model+" "+colour+" "+manualGear;
    }
}
