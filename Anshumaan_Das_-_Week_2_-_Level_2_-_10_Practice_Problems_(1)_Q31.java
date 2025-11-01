public class W2L2Q31 {
    public static void main(String[] args) {
        double height = 1.75, weight = 70;
        double bmi = weight / (height * height);
        String status = bmi < 18.5 ? "Underweight" : bmi < 25 ? "Normal" : "Overweight";
        System.out.println("BMI: " + bmi + ", Status: " + status);
    }
}