public class DriversLicenseTest {

    public static void main(String[] args) {

        DriversLicense license = new DriversLicense(69, true, true);

        System.out.println(license.getNumber());
        System.out.println(license.isPermitForBus());
        System.out.println(license.isPermitForTruck());

        System.out.println(license);

    }

}
