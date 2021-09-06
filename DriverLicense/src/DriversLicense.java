public class DriversLicense
{
  private int number;
  private boolean permitForTruck;
  private boolean permitForBus;

  public void setValues(int number, boolean permitForTruck,
      boolean permitForBus)
  {
    this.number = number;
    this.permitForTruck = permitForTruck;
    this.permitForBus = permitForBus;

  }

  public void setValues(int number, boolean permitForTruckandBus)
  {
    this.number = number;
    this.permitForTruck = permitForTruckandBus;
    this.permitForBus = permitForTruckandBus;
  }

  public void setValues(int number)
  {
    this.number = number;
    this.permitForTruck = false;
    this.permitForBus = false;
  }

  public int getNumber()
  {
    return number;
  }

  public boolean isPermitForTruck()
  {
    return permitForTruck;
  }

  public boolean isPermitForBus()
  {
    return permitForBus;
  }

  @Override public String toString()
  {
    return "DriversLicense " +
        "number=" + number +
        "\npermitForTruck=" + ((permitForTruck)? "Yes":"No") +
        "\npermitForBus=" + ((permitForBus)? "Yes":"No");
  }
}
