public class BodyMassIndex {
     public double height;
     public double weight;

    public BodyMassIndex(double inches,double pounds){
       double height = inches;
       double weight = pounds;
    }

    public double calcBmi(double height, double weight) {
        double square = 0.00;
        square = height * height;
        double bmi = Math.round(703.00 * weight / square);
        return bmi;
    }

    public String bmiCategory(double height,double weight){
        String category = "";
        if(calcBmi(height,weight)<18.5){
            category = "Underweight";
        }
        else if(calcBmi(height,weight)>18.5 && calcBmi(height,weight)<24.9){
            category = "Normal weight";
        }
        else if(calcBmi(height,weight)>25.0 && calcBmi(height,weight)<29.9){
            category = "Overweight";
        }
        else if(calcBmi(height,weight)>=30) {
            category = "Obesity";
        }
        return category;
    }
}
