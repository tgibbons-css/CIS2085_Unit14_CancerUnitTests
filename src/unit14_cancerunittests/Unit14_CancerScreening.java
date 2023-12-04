package unit14_cancerunittests;

import java.util.Scanner;

/**
 * We will demonstrate unit test with this example
 */
public class Unit14_CancerScreening {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double radius = readRadius(input);
        double concavity = readConcavity(input);
        String result = classifyTumor(radius, concavity);
        System.out.println("The tumor is " + result);
    }

    /**
     * Read in the tumor radius --- decimal number between 0.1 and 25.0
     * @param input Scanner --- helps with unit testing
     * @return the radius from the user entered
     */
    public static double readRadius(Scanner input) {
        //Scanner input = new Scanner(System.in);
        double radius;

        do {
            System.out.print("Enter tumor radius (0.1 to 25.0): ");
            radius = input.nextDouble();

            if ((radius < 0.1) || (radius > 25.0)) {
                System.out.println("ERROR -- the tumor radius must be between (0.1 to 25.0)");
            }
        } while ((radius < 0.1) || (radius > 25.0));

        return radius;
    }

    /**
     * Read in the tumor concavity --- decimal number between 0.01 and 0.35
     * @param input Scanner --- helps with unit testing
     * @return the concavity from the user entered
     */
    public static double readConcavity(Scanner input) {
        //Scanner input = new Scanner(System.in);
        double concavity;

        do {
            System.out.print("Enter tumor concavity (0.01 to 0.35): ");
            concavity = input.nextDouble();

            if ((concavity < 0.01) || (concavity > 0.35)) {
                System.out.println("ERROR -- the tumor concavity (0.01 to 0.35)");
            }
        } while ((concavity < 0.01) || (concavity > 0.35));

        return concavity;
    }

    /**
     * Classify the tumor a Benign (NOT Cancerous) or Malignant (Cancerous)
     * @param radius -- tumor radius
     * @param concavity -- tumor concavity
     * @return a string that is either "Benign" or "Malignant"
     */
    public static String classifyTumor(double radius, double concavity) {
        if (radius > 14.5 && concavity > 0.08) {
            return ("Malignant");
        } else if (radius > 12.3 && concavity > 0.12) {
            return ("Malignant");
        } else if (radius > 16.0 || concavity > 0.3) {
            return ("Malignant");
        } else {
            return ("Benign");
        }
    }

}
