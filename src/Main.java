public class Main {
    public static void main(String[] args) {
        double springCost = 150.32;
        double summerCost = 450.50;
        double autumnCost = 3.50;
        double winterCost = 895.50;
        double yearlyCost = 0;


        System.out.println("Spring cost is" + springCost);
        System.out.println("Summer cost is" + summerCost);
        System.out.println("Autumn cost is" + autumnCost);
        System.out.println("Winter cost is" + winterCost);

        yearlyCost = springCost + summerCost + autumnCost + winterCost;
        System.out.println(" The Yearly cost is " + yearlyCost);
    }
}