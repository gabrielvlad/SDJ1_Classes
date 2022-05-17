public class Engine {

    private String type;
    private int horsepower;
    private int volume;
    private boolean isDiesel;

    public Engine(String type, int horsepower, int volume, boolean isDiesel) {
        this.type = type;
        this.horsepower = horsepower;
        this.volume = volume;
        this.isDiesel = isDiesel;
    }

    public void setValues(String type, int horsepower, int volume, boolean isDiesel) {
        this.type = type;
        this.horsepower = horsepower;
        this.volume = volume;
        this.isDiesel = isDiesel;
    }

    public void setValues(String type, int horsepower, int volume) {
        this.type = type;
        this.horsepower = horsepower;
        this.volume = volume;
        this.isDiesel = true;
    }

    public String getType() {
        return type;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public int getVolume() {
        return volume;
    }

    public boolean isDiesel() {
        return isDiesel;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                ", horsepower=" + horsepower +
                ", volume=" + volume +
                ", isDiesel=" + isDiesel +
                '}';
    }
}
