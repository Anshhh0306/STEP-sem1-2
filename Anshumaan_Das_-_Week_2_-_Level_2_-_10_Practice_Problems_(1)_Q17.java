public class W2L2Q17 {
    public static void main(String[] args) {
        int amarAge = 20, amarHeight = 170;
        int akbarAge = 25, akbarHeight = 180;
        int anthonyAge = 22, anthonyHeight = 175;
        if (amarAge > akbarAge && amarAge > anthonyAge) {
            System.out.println("Amar is oldest");
        } else if (akbarAge > anthonyAge) {
            System.out.println("Akbar is oldest");
        } else {
            System.out.println("Anthony is oldest");
        }
    }
}