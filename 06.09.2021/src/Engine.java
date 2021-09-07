public class Engine {
    private String type;
    private int horsePower,volume;
    private boolean isDiesel;
    public Engine (String type,int horsePower,int volume,boolean isDiesel)
    {
        this.type = type;
        this.horsePower = horsePower;
        this.volume = volume;
        this.isDiesel = isDiesel;
    }
    public Engine(String type,int horsePower,int volume)
    {
        this(type,horsePower,volume,false);
    }
    public String getType()
    {
        return type;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public int getVolume() {
        return volume;
    }

    public boolean isDiesel() {
        return isDiesel;
    }
    @Override
    public String toString()
    {
        return type+" "+horsePower+" "+volume+" "+isDiesel;
    }
}
