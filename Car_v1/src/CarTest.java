public class CarTest
{
    public static void main(String[] args)
    {
        Engine engine = new Engine("Type 2", 420, 3000, true);
        Car car = new Car(engine, "Germany", "BMW", "blue", true);
        engine.getHorsePower();
        System.out.println(car.getHorsePower(420));
        System.out.println(car.getEngine());
        car.set("blue", engine);

    }
}
