public class Car
{
    private String make;
    private String model;
    private String colour;
    private boolean manualGear;
    private Engine engine;

    public Car(Engine engine ,String make, String model, String colour, boolean manualGear)
    {
        this.make = make;
        this.model = model;
        this.manualGear = manualGear;
        this.engine = engine;

    }
    public void set(String colour, Engine engine)
    {
        colour = colour;
        engine = engine;


    }
    public String getMake()
    {
        return make;
    }
    public String getModel()
    {
        return model;
    }
    public String getColour()
    {
        return colour;
    }
    public boolean getIsManualGear()
    {
        return manualGear;
    }
    public String toString()
    {
       return make  + " " + model + " " + colour + " " + manualGear + " " + engine;
    }
    public Engine getEngine()
    {
        return engine;
    }

    public int getHorsePower(int horsepower)
    {
        return horsepower;
    }

}
