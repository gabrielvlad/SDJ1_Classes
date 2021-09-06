public class EvaluationTest {

    // x = 7 + 3 * 6 / 2 - 1
    // first we do multiplication and division so we focus on "3 * 6 / 2"
    // we go from left to right so 3 * 6 is 18 and 18 / 2 is 9
    // then we move on to 7 + 9 - 1 and result should be = 15

    // y = 2 % 2 + 2 * 2 + - 2 / 2
    // first we do pairs separately
    // so 2 % 2 = 0, 2 * 2 = 4 and 2 / 2 = 1
    // now we do 0 + 4 - 1 = 3

    // z = (3 * 9* ( 3 + ( 9 * 3 / ( 3 ) ) ) )
    // first we do 9 * 3 / 3 = 9
    // now we do 3 + 9 = 12
    // and the rest: 3 * 9 * 12 = 324


    public static void main(String[] args) {

        double x = 7 + 3 * 6 / 2 -1;
        double y = 2 % 2 + 2 * 2 -2 / 2;
        double z = (3 * 9* ( 3 + ( 9 * 3 / ( 3 ) ) ) );

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
    }

}
