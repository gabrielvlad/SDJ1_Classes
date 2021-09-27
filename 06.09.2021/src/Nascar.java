public class Nascar {
    public static void main(String[] args) {
        Name name = new Name("Dragosel","Bonaparte");
        Person driver1 = new Person(name,25,'M');
        MyDate date = new MyDate(2,6,2022);
        Clock clock = new Clock(12,30,45);
        Car ride = new Car("Mercedes","B180","Red with black accents",true);
        Engine engine = new Engine("V8 Supercharged, Bi-turbo",964,5400,false);
        System.out.println("The Nascar race will take place on "+ date +" at "+clock.getSimpleTime()+".\nThe driver is "+
                driver1 +" and he will drive a "+ride.getMake()+" "+ride.getModel()+" with a swapped "+engine.getType()+" with a blistering power of "+
                engine.getHorsePower()+" horsepower!\nWe are waiting you at the nascar competition!");
    }
}
