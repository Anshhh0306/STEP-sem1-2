public class W2L2Q41 {
    public static void main(String[] args) {
        int marks = 85;
        String grade = marks >= 90 ? "A" : marks >= 80 ? "B" : marks >= 70 ? "C" : "D";
        System.out.println("Grade: " + grade);
    }
}