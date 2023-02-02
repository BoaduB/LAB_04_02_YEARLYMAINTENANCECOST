public class Main
{

    public static void main(String[] args)
    {
        double fallCost = 500;
        double winterCost = 403.35;
        double springCost = 195.95;
        double summerCost = 301.45;

        double totalCost = 0;

        totalCost = fallCost + winterCost + springCost + summerCost;

        System.out.println("The fall maintenance cost is : $" + fallCost);
        System.out.println("The winter maintenance cost is : $" + winterCost);
        System.out.println("The spring maintenance cost is : $" + springCost);
        System.out.println("The summer maintenance cost is : $" + summerCost);
        System.out.println("The total yearly maintenance cost is : $" + totalCost);
    }
}