import java.util.ArrayList;
import java.util.Scanner;
Scanner

public class App {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<BodyMassIndex> bmiData = new ArrayList<BodyMassIndex>();

        while (moreInput()) {
            double height = getUserHeight();
            double weight = getUserWeight();

            BodyMassIndex bmi = new BodyMassIndex(height, weight);
            bmiData.add(bmi);

            displayBmiInfo(bmi);
        }

        displayBmiStatistics(bmiData);
    }

    private static boolean moreInput() {
        System.out.println("Would you like to add another BMI entry? Y or N.");
        String input = scan.next();
        while (!(input.equalsIgnoreCase("Y") || input.equalsIgnoreCase("N"))) {
            System.out.println("Would you like to add another BMI entry? Y or N.");
            input = scan.next();
        }
    return input.equalsIgnoreCase("Y");
}


    public static double getUserHeight(){

        double height;

        System.out.println("Enter user height in inches.");
        height = scan.nextDouble();
        while(height<=0){
            System.out.println("Please enter a positive value.");
            height = scan.nextDouble();
        }
        return height;

    }

    public static double getUserWeight(){
        Scanner scan = new Scanner(System.in);
        double weight;

        System.out.println("Enter user weight in pounds.");
        weight = scan.nextDouble();
        while(weight<=0){
            System.out.println("You must be very thin. Please enter a positive value.");
            weight = scan.nextDouble();
        }

        return weight;
    }
}