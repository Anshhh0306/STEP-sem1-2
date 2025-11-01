public class W2L2Q7 {
    public static void main(String[] args) {
        String[] friends = {"A", "B", "C"};
        int[] ages = {20, 25, 22};
        int[] heights = {170, 180, 175};
        int youngestIndex = 0;
        int tallestIndex = 0;
        for (int i = 1; i < friends.length; i++) {
            if (ages[i] < ages[youngestIndex]) youngestIndex = i;
            if (heights[i] > heights[tallestIndex]) tallestIndex = i;
        }
        System.out.println("Youngest: " + friends[youngestIndex]);
        System.out.println("Tallest: " + friends[tallestIndex]);
    }
}