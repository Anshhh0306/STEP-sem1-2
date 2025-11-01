public class W2L2Q51 {
    public static void main(String[] args) {
        double[] percentages = {85.0, 92.0};
        String[] grades = {"B", "A"};
        for (int i = 0; i < percentages.length; i++) {
            System.out.println("Student " + (i + 1) + ": Percentage = " + percentages[i] + "%, Grade = " + grades[i]);
        }
    }
}