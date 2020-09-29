import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BodyMassIndexTest {

    @org.junit.jupiter.api.Test
    void testCalcBmi() {
        double height = 68;
        double weight = 100;
        BodyMassIndex bmi = new BodyMassIndex(height, weight);
        assertEquals(15, bmi.calcBmi(height, weight));
    }

    @Test
    void bmiCategory() {
        double height = 68.00;
        double weight = 100.00;
        BodyMassIndex bmi = new BodyMassIndex(height, weight);
        assertEquals("Underweight", bmi.bmiCategory(height,weight));
        height = 60;
        weight = 100;
        assertEquals("Normal weight", bmi.bmiCategory(height,weight));
        height = 60;
        weight = 150;
        assertEquals("Overweight", bmi.bmiCategory(height,weight));
        height = 60;
        weight = 180;
        assertEquals("Obesity",bmi.bmiCategory(height,weight));
    }

}