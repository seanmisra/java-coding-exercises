package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    String instanceOne;
    boolean instanceTwo;
    int instanceThree;
    int[] instanceFour;
    App instanceFive;
    char instanceSix;
    static public void main( String... args ) {
        App app = new App();
        app.testVars();
    }

    public void testVars() {
        System.out.println(this.instanceOne); // null
        System.out.println(this.instanceTwo); // false
        System.out.println(this.instanceThree); // 0
        System.out.println(this.instanceFour); // null
        System.out.println(this.instanceFive); // null
        System.out.println(this.instanceSix); // ' ' (i.e. \u0000)

        String localOne;
        boolean localTwo;
        int localThree;
        int[] localFour;
        App localFive;
        char localSix;

/*      none of the below lines will compile, as there is no defaulting for local variables
        System.out.println(localOne);
        System.out.println(localTwo);
        System.out.println(localThree);
        System.out.println(localFour);
        System.out.println(localFive);
        System.out.println(localSix);*/
    }
}
