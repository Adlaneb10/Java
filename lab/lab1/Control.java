public class Control
{       
    public static void main(String[] args) {
        Vehicle p1 = new Vehicle("John Smith", "15D4312");
        Vehicle p2 = new Vehicle("Mary smith", "15D142", 180, "Blue", "Auto", 4);
        System.out.println(p1);
        System.out.println(p2);
    //System.out.println(carRecent);

        p2.carRecent(p2.regNumber);
}
