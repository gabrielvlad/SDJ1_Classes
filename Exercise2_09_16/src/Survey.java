public class Survey {

    public static void main(String[] args) {

        int customersSurveyed = 15000;
        double oneOrMoreDrinks = 0.18;
        double citrusFlavoured = 0.58;

        System.out.println("Customers who purchase at least 1 drink per week: " + String.format("%.0f", customersSurveyed * oneOrMoreDrinks));
        System.out.println("Customers who prefer citrus flavoured drinks: " + String.format("%.0f", customersSurveyed * oneOrMoreDrinks * citrusFlavoured));

    }

}
