public class DriversLicense {

    private int number;
    private boolean permitForTruck;
    private boolean permitForBus;

    public static int hi;

    public DriversLicense(int number, boolean permitForTruck, boolean permitForBus) {
        this.number = number;
        this.permitForTruck = permitForTruck;
        this.permitForBus = permitForBus;
    }

    public void setValues(int number, boolean permitForTruck, boolean permitForBus) {
        this.number = number;
        this.permitForTruck = permitForTruck;
        this.permitForBus = permitForBus;
    }

    public void setValues(int number, boolean permitForTruckAndBus) {
        this.number = number;
        this.permitForTruck = permitForTruckAndBus;
        this.permitForBus = permitForTruckAndBus;
    }

    public void setValues(int number){
        this.number = number;
        this.permitForBus = false;
        this.permitForTruck = false;
    }

    public int getNumber() {
        return number;
    }

    public boolean isPermitForTruck() {
        return permitForTruck;
    }

    public boolean isPermitForBus() {
        return permitForBus;
    }

    @Override
    public String toString() {
        return "DriversLicense number " + number +
                "\npermitForTruck: " + ((permitForTruck)?"Yes":"No") +
                "\npermitForBus: " + ((permitForBus)?"Yes":"No");
    }
}


