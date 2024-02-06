public class BmiService {

    public int calculate(double heightInMeters, int weightInKg) {
        double BMI = weightInKg / (heightInMeters * heightInMeters);
        return (int) BMI;
    }
}
